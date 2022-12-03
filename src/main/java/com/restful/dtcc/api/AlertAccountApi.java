package com.restful.dtcc.api;

import com.restful.dtcc.entity.AlertAccount;
import com.restful.dtcc.entity.LiveTradeLevels;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.ResponseEntity;

import java.util.List;

@Api(value = "Alert Account")
public interface AlertAccountApi {

    @ApiOperation(value = "Get Alert Account by the organization's location", tags = {"Alert Account",})
    @ApiResponses(value = {
            @ApiResponse(code=200, message="OK", response= AlertAccount.class, responseContainer = "List")
    })
    ResponseEntity<List<AlertAccount>> getAlertAccountByOrgLocation(String politicalSubdivision);
}
