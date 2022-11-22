package com.restful.dtcc.entity;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "location")
@Getter
@Setter
public class Location{

    @Id
    @Column(name = "location_id")
    private Long locationId;

    @Column(name = "location_name")
    private String locationName;

    @Column(name = "street1")
    private String street1;

    @Column(name = "street2")
    private String street2;

    @Column(name = "street3")
    private String street3;

    @Column(name = "city")
    private String city;

    @Column(name = "political_subdivision")
    private String politicalSubdivision;

    @Column(name = "postal_code")
    private String postalCode;

    @Column(name = "country")
    private String country;

    @Column(name = "open_time")
    private Timestamp openTime;

    @Column(name = "close_time")
    private Timestamp closeTime;

    @Column(name = "time_zone")
    private Long timeZone;

    @Column(name = "location_url")
    private String locationUrl;

    @Column(name = "location_phone")
    private String locationPhone;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name="user_location",
            joinColumns = {@JoinColumn(name="LOCATION_ID")},
            inverseJoinColumns = {@JoinColumn(name="USER_ID")}
    )
    private Set<UserInfo> userInfos = new HashSet<>();

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name="organization_location",
            joinColumns = {@JoinColumn(name="LOCATION_ID")},
            inverseJoinColumns = {@JoinColumn(name="ORG_ID")}
    )
    private Set<Organization> organizations = new HashSet<>();

}