package com.restful.dtcc.api;


import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import com.restful.dtcc.entity.Organization;
import com.restful.dtcc.entity.TradesuitePta;
import com.restful.dtcc.repository.OrganizationRepository;
import com.restful.dtcc.repository.TradesuiteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/api")
public class TradesuitePtaApiController implements TradeSuitePtaApi{

    @Autowired
    private TradesuiteRepository tradesuiteRepository;

    @Autowired
    private OrganizationRepository orgRepo;


    @GetMapping("/tradesuite_pta_by_location")
    public MappingJacksonValue getByTradeSuiteInstLocation(
            @RequestParam(value="politicalSubdivision")  String politicalSubdivision
    ) {
        List<Organization> orgs  = orgRepo.findByLocationsPoliticalSubdivision(politicalSubdivision);
        List<TradesuitePta> tradesuitePtas = tradesuiteRepository.findByInstIn(orgs);

        SimpleBeanPropertyFilter tradesuitePtaFilter = SimpleBeanPropertyFilter.filterOutAllExcept(
                "dtccControlNum",
                "inst"
                //"liveTradeDetails"
        );
        SimpleBeanPropertyFilter orgFilter = SimpleBeanPropertyFilter.filterOutAllExcept(
                "orgName"
        );
        SimpleBeanPropertyFilter liveTradeDetailsFilter = SimpleBeanPropertyFilter.filterOutAllExcept(
                "quantityAllocated"
        );

        FilterProvider filterProvider = new SimpleFilterProvider()
                .addFilter("tradesuitePtaFilter", tradesuitePtaFilter)
                .addFilter("organizationFilter", orgFilter)
                .addFilter("liveTradeDetailsFilter", liveTradeDetailsFilter);

        MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(tradesuitePtas);
        mappingJacksonValue.setFilters(filterProvider);
        return mappingJacksonValue;
    }


}
