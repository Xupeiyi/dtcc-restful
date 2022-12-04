package com.restful.dtcc.api;


import com.restful.dtcc.entity.Organization;
import com.restful.dtcc.entity.TradesuitePta;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.converter.json.MappingJacksonValue;


@Api(value="Trade Suite Pta")
public interface TradeSuitePtaApi {

    @ApiOperation(value = "Get trade suite pta by institution's location", tags = {"Trade Suite Pta",})
    @ApiResponses(value = {
            @ApiResponse(code=200, message="OK", response= TradesuitePta.class, responseContainer = "List")
    })
    MappingJacksonValue getByTradeSuiteInstLocation(String politicalSubdivision);
}
