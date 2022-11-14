package com.restful.dtcc.api;


import com.restful.dtcc.entity.UserInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.ResponseEntity;

import java.util.List;

@Api(value = "user_info")
public interface UserInfoApi {

    @ApiOperation(value = "Get user info by user_id", tags = {"UserInfo",})
    @ApiResponses(value = {
            @ApiResponse(code=200, message="OK", response= UserInfo.class)
    })
    ResponseEntity<UserInfo> getUserInfoByUserId(Long familyId);


    @ApiOperation(value = "Get user info by location.political_subdivision and role.role_name", tags = {"UserInfo",})
    @ApiResponses(value = {
            @ApiResponse(code=200, message="OK", response= UserInfo.class, responseContainer = "List")
    })
    ResponseEntity<List<UserInfo>> getUserInfoByPoliticalSubdivisionAndRoleName(String politicalSubdivision, String roleName);

}
