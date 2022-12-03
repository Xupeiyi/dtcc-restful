package com.restful.dtcc.repository;

import com.restful.dtcc.entity.LiveTradeLevels;
import com.restful.dtcc.entity.Organization;
import org.springframework.data.jpa.repository.JpaRepository;

import java.sql.Timestamp;
import java.util.List;



public interface LiveTradeLevelsRepository extends JpaRepository<LiveTradeLevels, Long> {

    List<LiveTradeLevels> findBySecurityTypeLpCode(String securityTypeLpCode);

    List<LiveTradeLevels> findByInstructingPartyOrgIdAndSecurityTypeLpCode (
            Long orgId, String securityTypeGroupCode
    );

    List<LiveTradeLevels> findByInstructingPartyIn(List<Organization> organizations);

    List<LiveTradeLevels> findAllByTradeDateTimeGreaterThanEqualAndTradeDateTimeLessThanEqual(
            Timestamp startDate, Timestamp endDate
    );

}
