package com.restful.dtcc.api;

import com.restful.dtcc.entity.UserInfo;
import com.restful.dtcc.repository.UserInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@Controller
@RequestMapping("/api")
public class UserInfoApiController implements UserInfoApi {

    @Autowired
    private UserInfoRepository userInfoRepository;

    @GetMapping("/user_info/{userId}")
    public ResponseEntity<UserInfo> getUserInfoByUserId(@PathVariable(value="userId") Long userId){
        return new ResponseEntity<>(userInfoRepository.findByUserId(userId), HttpStatus.OK);
    }

    @GetMapping("/user_info")
    public ResponseEntity<List<UserInfo>> getUserInfoByPoliticalSubdivisionAndRoleName(
            @RequestParam(value="politicalSubdivision") String politicalSubdivision,
            @RequestParam(value="roleName") String roleName
    ) {
        return new ResponseEntity<>(userInfoRepository.findByLocationsPoliticalSubdivisionAndRolesRoleName(
                politicalSubdivision, roleName
            ), HttpStatus.OK
        );
    }

}
