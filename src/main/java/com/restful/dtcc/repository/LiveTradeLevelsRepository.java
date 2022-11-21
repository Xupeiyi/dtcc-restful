package com.restful.dtcc.repository;

import com.restful.dtcc.entity.LiveTradeLevels;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;


public interface LiveTradeLevelsRepository extends JpaRepository<LiveTradeLevels, Long> {

    List<LiveTradeLevels> findBySecurityTypeLpSecurityTypeGroupLpCode(String securityTypeGroupCode);

    List<LiveTradeLevels> findByInstructingPartyOrgIdAndSecurityTypeLpSecurityTypeGroupLpCode (
            Long orgId, String securityTypeGroupCode);
}
