package com.restful.dtcc.api;

import com.restful.dtcc.entity.LiveTradeLevels;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.ResponseEntity;

import java.util.List;

@Api(value = "Live Trade Level")
public interface LiveTradeLevelsApi {

    @ApiOperation(value = "Get Live Trade Level by xref type, xref value and security code type", tags = {"Live Trade Level",})
    @ApiResponses(value = {
            @ApiResponse(code=200, message="OK", response= LiveTradeLevels.class, responseContainer = "List")
    })
    ResponseEntity<List<LiveTradeLevels>> getLiveTradeLevelsByXrefTypeAndXrefValueAndSecurityCodeType(
            String xrefType,
            String xrefCode,
            String securityCodeType
    );


    @ApiOperation(value = "Get Live Trade Level by instructing party's location", tags = {"Live Trade Level",})
    @ApiResponses(value = {
            @ApiResponse(code=200, message="OK", response= LiveTradeLevels.class, responseContainer = "List")
    })
    ResponseEntity<List<LiveTradeLevels>> getLiveTradeLevelsByInstructingPartyLocation(String politicalSubdivision);


}
