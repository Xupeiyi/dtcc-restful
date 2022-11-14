package com.restful.dtcc.entity;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.sql.Timestamp;


@Entity
@Table(name = "USER_ROLE")
@Getter
@Setter
public class UserRole {

    @Column(name = "ROLE_ID")
    private Long roleId;

    @Column(name = "USER_ID")
    private Long userId;

    @Column(name = "ORG_ID")
    private Long orgId;

    @Column(name = "PRIVATE_FLAG")
    private String privateFlag;

    //primary key (role_id, user_id, org_id),
    //foreign key (role_id) references role(role_id),
    //foreign key (user_id) references user_info(user_id),
    //foreign key (org_id) references organization(org_id)

}