package com.restful.dtcc.entity;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.sql.Timestamp;


@Entity
@Table(name = "organization_xref")
@Getter
@Setter
public class OrganizationXref{

    @Id
    @Column(name = "org_id")
    private Long org_id;

    @Id
    @Column(name = "org_xref_type")
    private String orgXrefType;

    @Id
    @Column(name = "org_xref_value")
    private String orgXrefValue;

    @Column(name = "org_xref_text")
    private String orgXrefText;

    @Column(name = "start_date")
    private Timestamp startDate;

    @Column(name = "end_date")
    private Timestamp endDate;
}