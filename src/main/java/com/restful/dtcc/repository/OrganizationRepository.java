package com.restful.dtcc.repository;

import java.util.List;

import com.restful.dtcc.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import com.restful.dtcc.entity.Organization;


public interface OrganizationRepository extends JpaRepository<Organization, Long> {
    List<Organization> findByFamilyFamilyId(Long familyId);

    Organization findOrganizationByOrgId(Long orgId);

    Organization findByOrganizationXrefOrgXrefTypeAndOrganizationXrefOrgXrefValue(String xrefType, String xrefValue);

    List<Organization> findByLocationsPoliticalSubdivision(String politicalSubdivision);

}
