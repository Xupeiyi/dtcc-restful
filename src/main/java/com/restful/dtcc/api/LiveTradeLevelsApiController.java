package com.restful.dtcc.api;


import com.restful.dtcc.entity.LiveTradeLevels;
import com.restful.dtcc.entity.Organization;
import com.restful.dtcc.entity.OrganizationXrefId;
import com.restful.dtcc.entity.UserInfo;
import com.restful.dtcc.repository.LiveTradeLevelsRepository;
import com.restful.dtcc.repository.OrganizationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/api")
public class LiveTradeLevelsApiController implements LiveTradeLevelsApi{

    @Autowired
    private LiveTradeLevelsRepository liveTradeLevelsRepository;
    @Autowired
    private OrganizationRepository orgRepo;

    @GetMapping("/live_trade_levels")
    public ResponseEntity<List<LiveTradeLevels>> getLiveTradeLevelsByXrefTypeAndXrefValueAndSecurityCodeType(
        @RequestParam(value="xrefType") String xrefType,
        @RequestParam(value="xrefValue") String xrefCode,
        @RequestParam(value="securityCodeType") String securityCodeType
    ){
        // one test input can be: BIC, XCHQ8310, DBT
        Organization organization = orgRepo.findByOrganizationXrefOrgXrefTypeAndOrganizationXrefOrgXrefValue(xrefType, xrefCode);

        return new ResponseEntity<>(liveTradeLevelsRepository.findByInstructingPartyOrgIdAndSecurityTypeLpSecurityTypeGroupLpCode(
                organization.getOrgId(), securityCodeType
        ), HttpStatus.OK);
    }

    @GetMapping("/live_trade_levels_by_location")
    public ResponseEntity<List<LiveTradeLevels>> getLiveTradeLevelsByInstructingPartyLocation(
            @RequestParam(value="politicalSubdivision") String politicalSubdivision
    ){
        List<Organization> organizations = orgRepo.findByLocationsPoliticalSubdivision(politicalSubdivision);
        List<LiveTradeLevels> tradeLevels = liveTradeLevelsRepository.findByInstructingPartyIn(organizations);
        return new ResponseEntity<>(tradeLevels, HttpStatus.OK);
    }

}


