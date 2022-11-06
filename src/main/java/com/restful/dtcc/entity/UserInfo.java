package com.restful.dtcc.entity;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.sql.Timestamp;


@Entity
@Table(name = "USER_INFO")
@Getter
@Setter
public class UserInfo {

    @Id
    @Column(name = "USER_ID")
    private Long userId;

    @Column(name = "LOGIN_NAME")
    private String loginName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "MIDDLE_NAME")
    private String middleName;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "USER_TYPE")
    private String userType;

    @Column(name = "START_DATE")
    private Timestamp startDate;

    @Column(name = "END_DATE")
    private Timestamp endDate;

}
