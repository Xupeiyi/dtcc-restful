package com.restful.dtcc.api;


import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import com.restful.dtcc.entity.LiveTradeLevels;
import com.restful.dtcc.entity.Organization;
import com.restful.dtcc.repository.LiveTradeLevelsRepository;
import com.restful.dtcc.repository.OrganizationRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api")
public class LiveTradeLevelsApiController implements LiveTradeLevelsApi{

    @Autowired
    private LiveTradeLevelsRepository liveTradeLevelsRepository;
    @Autowired
    private OrganizationRepository orgRepo;

    @GetMapping("/live_trade_levels")
    public MappingJacksonValue getLiveTradeLevelsByXrefTypeAndXrefValueAndSecurityCodeType(
        @RequestParam(value="xrefType") String xrefType,
        @RequestParam(value="xrefValue") String xrefCode,
        @RequestParam(value="securityTypeLpCode") String securityTypeLpCode
    ){
        // one test input can be: BIC, XCHQ8310, ABSS
        Organization organization = orgRepo
                .findByOrganizationXrefOrgXrefTypeAndOrganizationXrefOrgXrefValue(xrefType, xrefCode);
        List<LiveTradeLevels> tradeLevels = liveTradeLevelsRepository
                .findByInstructingPartyOrgIdAndSecurityTypeLpCode(
                organization.getOrgId(), securityTypeLpCode
        );

        SimpleBeanPropertyFilter tradeLevelFilter = SimpleBeanPropertyFilter.filterOutAllExcept(
                "tradeSideId",
                "tradeDateTime",
                "typeOfFinancialInstrument",
                "securityCode",
                "securityTypeLp",
                "totalTradeAmount",
                "dealPrice",
                "instructingParty"
        );
        SimpleBeanPropertyFilter orgFilter = SimpleBeanPropertyFilter.filterOutAllExcept(
                "orgName",
                "organizationXref"
        );
        SimpleBeanPropertyFilter orgXrefFilter = SimpleBeanPropertyFilter.filterOutAllExcept(
                "orgXrefType",
                "orgXrefValue"
        );
        FilterProvider filterProvider = new SimpleFilterProvider()
                .addFilter("tradeLevelFilter", tradeLevelFilter)
                .addFilter("organizationFilter", orgFilter)
                .addFilter("organizationXrefFilter", orgXrefFilter);

        MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(tradeLevels);
        mappingJacksonValue.setFilters(filterProvider);
        return mappingJacksonValue;
    }

    @GetMapping("/live_trade_levels_by_location")
    public MappingJacksonValue getLiveTradeLevelsByInstructingPartyLocation(
            @RequestParam(value="politicalSubdivision") String politicalSubdivision
    ){
        List<Organization> organizations = orgRepo.findByLocationsPoliticalSubdivision(politicalSubdivision);
        List<LiveTradeLevels> tradeLevels = liveTradeLevelsRepository.findByInstructingPartyIn(organizations);

        SimpleBeanPropertyFilter tradeLevelFilter = SimpleBeanPropertyFilter.filterOutAllExcept(
                "tradeSideId",
                "instructingParty"
        );
        SimpleBeanPropertyFilter orgFilter = SimpleBeanPropertyFilter.filterOutAllExcept(
                "orgName",
                "locations"
        );
        SimpleBeanPropertyFilter locationFilter = SimpleBeanPropertyFilter.filterOutAllExcept(
                "locationId",
                "locationName",
                "city",
                "politicalSubdivision"
        );

        FilterProvider filterProvider = new SimpleFilterProvider()
                .addFilter("tradeLevelFilter", tradeLevelFilter)
                .addFilter("organizationFilter", orgFilter)
                .addFilter("locationFilter", locationFilter);

        MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(tradeLevels);
        mappingJacksonValue.setFilters(filterProvider);
        return mappingJacksonValue;
    }

    @GetMapping("/live_trade_levels_by_date_range")
    public MappingJacksonValue getLiveTradeLevelsByDateRange(
            @RequestParam String start,
            @RequestParam String end
    ){
        List<LiveTradeLevels> tradeLevels = liveTradeLevelsRepository.findAllByTradeDateTimeGreaterThanEqualAndTradeDateTimeLessThanEqual(
                getTimeStamp(start), getTimeStamp(end)
        );
        SimpleBeanPropertyFilter tradeLevelFilter = SimpleBeanPropertyFilter.filterOutAllExcept(
                "tradeSideId",
                "tradeDateTime",
                "typeOfFinancialInstrument",
                "securityCode",
                "totalTradeAmount",
                "dealPrice"
        );
        FilterProvider filterProvider = new SimpleFilterProvider().addFilter(
                "tradeLevelFilter", tradeLevelFilter
        );
        MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(tradeLevels);
        mappingJacksonValue.setFilters(filterProvider);
        return mappingJacksonValue;
    }

    private Timestamp getTimeStamp(String date){
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date parsedDate = dateFormat.parse(date);
            return new Timestamp(parsedDate.getTime());
        }
        catch(ParseException e) {
            System.out.println("Exception :" + e);
            return null;
        }
    }
}


