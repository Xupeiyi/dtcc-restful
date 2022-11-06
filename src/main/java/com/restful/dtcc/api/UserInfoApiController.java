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


@Controller
@RequestMapping("/api")
public class UserInfoApiController implements UserInfoApi{

    @Autowired
    private UserInfoRepository userInfoRepository;

    @GetMapping("/user_info/{userId}")
    public ResponseEntity<UserInfo> getUserInfoByUserId(@PathVariable(value="userId") Long userId){
        return new ResponseEntity<>(userInfoRepository.findByUserId(userId), HttpStatus.OK);
    }

}
