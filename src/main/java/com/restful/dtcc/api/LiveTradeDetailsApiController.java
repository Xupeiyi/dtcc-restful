//package com.restful.dtcc.api;
//
//import com.fasterxml.jackson.databind.ser.FilterProvider;
//import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
//import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
//import com.restful.dtcc.entity.LiveTradeDetails;
//import com.restful.dtcc.entity.Organization;
//import com.restful.dtcc.entity.TradesuitePta;
//import com.restful.dtcc.repository.LiveTradeDetailsRepository;
//import com.restful.dtcc.repository.OrganizationRepository;
//import com.restful.dtcc.repository.TradesuiteRepository;
//import io.swagger.annotations.Api;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.http.converter.json.MappingJacksonValue;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
//
//@RestController
//@RequestMapping("/api")
//@Api(value = "Live Trade Details")
//public class LiveTradeDetailsApiController {
//    @Autowired
//    private LiveTradeDetailsRepository liveTradeDetailsRepository;
//
//
//    @GetMapping("/live_trade_details")
//    public ResponseEntity<List<LiveTradeDetails>> getByTradeSide(
//            @RequestParam(value = "tradeSideId") Long tradeSideId
//            ) {
//        List<LiveTradeDetails> liveTradeDetails = liveTradeDetailsRepository.findByLiveTradeDetailsIdLiveTradeLevelsTradeSideId(tradeSideId);
//        return new ResponseEntity<>(liveTradeDetails, HttpStatus.OK);
//
//    }
//
//    @GetMapping("/live_trade_details_by_trade_suite")
//    public MappingJacksonValue getByTradeSuite(
//            @RequestParam(value = "dtccControlNum") String dtccControlNum
//    ) {
//        List<LiveTradeDetails> liveTradeDetails = liveTradeDetailsRepository.findByTradesuitePtaDtccControlNum(dtccControlNum);
//
//        SimpleBeanPropertyFilter tradesuitePtaFilter = SimpleBeanPropertyFilter.filterOutAllExcept(
//                "dtccControlNum"
//        );
//        SimpleBeanPropertyFilter orgFilter = SimpleBeanPropertyFilter.filterOutAllExcept(
//                "orgName"
//        );
//        FilterProvider filterProvider = new SimpleFilterProvider()
//                .addFilter("tradesuitePtaFilter", tradesuitePtaFilter)
//                .addFilter("organizationFilter", orgFilter);
//
//        MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(liveTradeDetails);
//        mappingJacksonValue.setFilters(filterProvider);
//        return mappingJacksonValue;
//    }
//
//
//}
