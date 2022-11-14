//package com.restful.dtcc.entity;
//
//import lombok.Getter;
//import lombok.Setter;
//import javax.persistence.*;
//import java.io.Serializable;
//
//
//@Entity
//@Table(name = "USER_LOCATION")
//@Getter
//@Setter
//public class UserLocation implements Serializable {
//
//    @Id
//    @Column(name = "LOCATION_ID")
//    private Long locationId;
//
//    @Id
//    @Column(name = "USER_ID")
//    private Long userId;
//
//    //primary key (location_id, user_id),
//    //foreign key(location_id) references location(location_id),
//    //foreign key(user_id) references user_info(user_id)
//}