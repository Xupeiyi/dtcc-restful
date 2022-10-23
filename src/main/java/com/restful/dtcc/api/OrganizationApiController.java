package com.restful.dtcc.api;

import com.restful.dtcc.entity.Family;
import com.restful.dtcc.entity.Organization;
import com.restful.dtcc.repository.FamilyRepository;
import com.restful.dtcc.repository.OrganizationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
@RequestMapping("/api")
public class OrganizationApiController {

    @Autowired
    private OrganizationRepository orgRepository;

    @GetMapping("/family/{familyId}/organizations")
    public ResponseEntity<List<Organization>> getAllOrgsByFamilyId(@PathVariable(value="familyId") Long familyId){
        List<Organization> organizations = orgRepository.findByFamilyFamilyId(familyId);
        return new ResponseEntity<>(organizations, HttpStatus.OK);
    }

    @GetMapping("/organization/{orgId}")
    public ResponseEntity<Organization> getOrganizationByOrgId(@PathVariable(value="orgId") Long orgId){
        return new ResponseEntity<>(orgRepository.findOrganizationByOrgId(orgId), HttpStatus.OK);
    }

}
