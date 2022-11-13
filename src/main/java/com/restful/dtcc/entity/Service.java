package com.restful.dtcc.entity;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.sql.Timestamp;


@Entity
@Table(name = "service")
@Getter
@Setter
public class Service{

    @Id
    @Column(name = "service_id")
    private Long serviceId;

    @Column(name = "service_name")
    private String serviceName;

    @Column(name = "description")
    private String description;

    @Column(name = "enrichment_flag")
    private String enrichmentFlag;

    @Column(name = " private_flag")
    private String  privateFlag;
}