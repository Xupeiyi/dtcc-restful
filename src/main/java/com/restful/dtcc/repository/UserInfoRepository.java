package com.restful.dtcc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restful.dtcc.entity.UserInfo;
import com.restful.dtcc.entity.Location;

public interface UserInfoRepository extends JpaRepository<UserInfo, Long> {

    UserInfo findByUserId(Long userId);

    List<UserInfo> findByLocationsPoliticalSubdivisionAndRolesRoleName(String politicalSubdivision, String roleName);

}
