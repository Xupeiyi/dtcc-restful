//package com.restful.dtcc.entity;
//
//import lombok.Getter;
//import lombok.Setter;
//import javax.persistence.*;
//import java.io.Serializable;
//import java.sql.Timestamp;
//
//
//@Entity
//@Table(name = "USER_ROLE")
//@Getter
//@Setter
//public class UserRole implements Serializable {
//    private static final long serialVersionUID = 1L;
//
//    @Id
//    @Column(name = "ROLE_ID")
//    private Long roleId;
//
//    @Id
//    @Column(name = "USER_ID")
//    private Long userId;
//
//    @Id
//    @Column(name = "ORG_ID")
//    private Long orgId;
//
//    @Column(name = "PRIVATE_FLAG")
//    private String privateFlag;
//
//    //primary key (role_id, user_id, org_id),
//    //foreign key (role_id) references role(role_id),
//    //foreign key (user_id) references user_info(user_id),
//    //foreign key (org_id) references organization(org_id)
//
//}