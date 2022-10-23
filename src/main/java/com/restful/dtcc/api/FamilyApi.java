package com.restful.dtcc.api;

import com.restful.dtcc.entity.Family;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Api(value = "family")
public interface FamilyApi {

    @ApiOperation(value = "", response = Family.class, tags = {"Family",})
    @ApiResponses(value = {@ApiResponse(code = 200, message = "A successful family record", response = Family.class)})
    @RequestMapping(value = "/family/{id}", produces = {"application/json"}, method = RequestMethod.GET)
    ResponseEntity<Family> getFamilyById(@PathVariable("id") Long familyId);

}
