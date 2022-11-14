package com.restful.dtcc.entity;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.sql.Timestamp;


@Entity
@Table(name = "security_type_group_lp")
@Getter
@Setter
public class SecurityTypeGroupLp{

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "code")
    private String code;

    @Column(name = "description")
    private String description;

    @Column(name = "inactive_date")
    private Timestamp inactiveDate;
}