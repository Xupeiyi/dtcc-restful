package com.restful.dtcc.repository;

import com.restful.dtcc.entity.LiveTradeDetails;
import com.restful.dtcc.entity.LiveTradeDetailsId;
import com.restful.dtcc.entity.TradesuitePta;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface LiveTradeDetailsRepository extends JpaRepository<LiveTradeDetails, LiveTradeDetailsId> {

    List<LiveTradeDetails> findByLiveTradeDetailsIdLiveTradeLevelsTradeSideId(Long tradeSideId);

    List<LiveTradeDetails> findByTradesuitePtaDtccControlNum(String dtccControlNum);

    List<LiveTradeDetails> findByTradesuitePtaIn(List<TradesuitePta> tradesuitePtas);
}
