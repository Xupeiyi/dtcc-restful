package com.restful.dtcc.api;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import com.restful.dtcc.entity.AlertAccount;
import com.restful.dtcc.entity.Organization;
import com.restful.dtcc.repository.AlertAccountRepository;
import com.restful.dtcc.repository.OrganizationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AlertAccountApiController implements AlertAccountApi{

    @Autowired
    AlertAccountRepository alertAccountRepository;

    @Autowired
    OrganizationRepository organizationRepository;

    @GetMapping("/alert_accounts")
    public MappingJacksonValue getAlertAccountByOrgLocation(
            @RequestParam(value="politicalSubdivision") String politicalSubdivision
    ){
        List<Organization> organizations = organizationRepository.findByLocationsPoliticalSubdivision(politicalSubdivision);
        List<AlertAccount> alertAccounts = alertAccountRepository.findByOrganizationIn(organizations);


        SimpleBeanPropertyFilter alertAccountFilter = SimpleBeanPropertyFilter.filterOutAllExcept(
                "accountId",
                "accountName",
                "organization"
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
                .addFilter("alertAccountFilter", alertAccountFilter)
                .addFilter("organizationFilter", orgFilter)
                .addFilter("locationFilter", locationFilter);

        MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(alertAccounts);
        mappingJacksonValue.setFilters(filterProvider);
        return mappingJacksonValue;
    }

}
