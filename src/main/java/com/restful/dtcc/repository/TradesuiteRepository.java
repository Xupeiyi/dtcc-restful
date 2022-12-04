package com.restful.dtcc.repository;

import com.restful.dtcc.entity.LiveTradeDetails;
import com.restful.dtcc.entity.LiveTradeDetailsId;
import com.restful.dtcc.entity.Organization;
import com.restful.dtcc.entity.TradesuitePta;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface TradesuiteRepository extends JpaRepository<TradesuitePta, String> {

    List<TradesuitePta> findByInstOrgId(Long orgId);

    List<TradesuitePta> findByInstIn(List<Organization> orgs);
}
