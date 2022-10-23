package com.restful.dtcc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.restful.dtcc.entity.Organization;


public interface OrganizationRepository extends JpaRepository<Organization, Long> {
    List<Organization> findByFamilyFamilyId(Long familyId);
    Organization findOrganizationByOrgId(Long orgId);
}
