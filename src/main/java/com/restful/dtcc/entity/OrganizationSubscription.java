package com.restful.dtcc.entity;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.sql.Timestamp;


@Entity
@Table(name = "organization_subscription")
@Getter
@Setter
public class OrganizationSubscription{

    @Id
    @Column(name = "service_id")
    private Long serviceId;

    @Id
    @Column(name = "org_id")
    private Long orgId;

    @Column(name = "NAME")
    private String NAME;

    @Column(name = "description")
    private String description;

    @Column(name = "start_date")
    private Timestamp startDate;

    @Column(name = "end_date")
    private Timestamp endDate;
}