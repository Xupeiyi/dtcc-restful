package com.restful.dtcc.entity;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.sql.Timestamp;


@Entity
@Table(name = "organization_location")
@Getter
@Setter
public class OrganizationLocation{

    @Id
    @Column(name = "org_id")
    private Long orgId;

    @Column(name = "location_id")
    private Long locationId;
}