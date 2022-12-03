package com.restful.dtcc.api;

import com.restful.dtcc.entity.AlertAccount;
import com.restful.dtcc.entity.Organization;
import com.restful.dtcc.repository.AlertAccountRepository;
import com.restful.dtcc.repository.OrganizationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/api")
public class AlertAccountApiController implements AlertAccountApi{

    @Autowired
    AlertAccountRepository alertAccountRepository;

    @Autowired
    OrganizationRepository organizationRepository;

    @GetMapping("/alert_accounts")
    public ResponseEntity<List<AlertAccount>> getAlertAccountByOrgLocation(
            @RequestParam(value="politicalSubdivision") String politicalSubdivision
    ){
        List<Organization> organizations = organizationRepository.findByLocationsPoliticalSubdivision(politicalSubdivision);
        List<AlertAccount> alertAccounts = alertAccountRepository.findByOrganizationIn(organizations);
        return new ResponseEntity<>(alertAccounts, HttpStatus.OK);
    }

}
