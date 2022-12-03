package com.restful.dtcc.api;

import com.restful.dtcc.entity.LiveTradeLevels;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.Timestamp;
import java.util.List;

@Api(value = "Live Trade Level")
public interface LiveTradeLevelsApi {

    @ApiOperation(value = "Get Live Trade Level by xref type, xref value and security code type", tags = {"Live Trade Level",})
    @ApiResponses(value = {
            @ApiResponse(code=200, message="OK", response= LiveTradeLevels.class, responseContainer = "List")
    })
    MappingJacksonValue getLiveTradeLevelsByXrefTypeAndXrefValueAndSecurityCodeType(
            String xrefType,
            String xrefCode,
            String securityCodeType
    );


    @ApiOperation(value = "Get Live Trade Level by instructing party's location", tags = {"Live Trade Level",})
    @ApiResponses(value = {
            @ApiResponse(code=200, message="OK", response= LiveTradeLevels.class, responseContainer = "List")
    })
    MappingJacksonValue getLiveTradeLevelsByInstructingPartyLocation(String politicalSubdivision);

    @ApiOperation(value = "Find Live Trade Level by date range", tags = {"Live Trade Level",})
    @ApiResponses(value = {
            @ApiResponse(code=200, message="OK", response= LiveTradeLevels.class, responseContainer = "List")
    })
    // ResponseEntity<List<LiveTradeLevels>> getLiveTradeLevelsByDateRange(String start, String end);
    MappingJacksonValue getLiveTradeLevelsByDateRange(String start, String end);
}
