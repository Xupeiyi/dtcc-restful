package com.restful.dtcc.api;

import java.util.List;
import com.restful.dtcc.entity.Organization;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.ResponseEntity;


@Api(value="organization")
public interface OrganizationApi {

    @ApiOperation(value = "Get organization by org_id", tags = {"Organization",})
    @ApiResponses(value = {
            @ApiResponse(code=200, message="OK", response=Organization.class)
    })
    ResponseEntity<Organization> getOrganizationByOrgId(Long orgId);

    @ApiOperation(value = "Get all organizations in family", tags = {"Organization",})
    @ApiResponses(value = {
            @ApiResponse(code=200, message="OK", response=Organization.class, responseContainer = "List")
    })
    ResponseEntity<List<Organization>> getAllOrgsByFamilyId(Long familyId);


}
