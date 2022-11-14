package com.restful.dtcc.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;


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

    @JsonIgnore
    @ManyToMany(
            fetch = FetchType.LAZY,
            mappedBy = "userInfos"
    )
    private Set<Location> locations = new HashSet<>();

    @JsonIgnore
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
        name = "user_role",
        joinColumns = {@JoinColumn(name="USER_ID")},
        inverseJoinColumns = {@JoinColumn(name="ROLE_ID")}
    )
    private Set<Role> roles = new HashSet<>();

}
