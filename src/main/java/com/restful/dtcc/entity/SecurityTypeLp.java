package com.restful.dtcc.entity;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.sql.Timestamp;


@Entity
@Table(name = "security_type_lp")
@Getter
@Setter
public class SecurityTypeLp{

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "code")
    private String code;

    @Column(name = "description")
    private String description;

    @Column(name = "profile_instrument_type_code")
    private String profileInstrumentTypeCode;

    @Column(name = "inactive_date")
    private Timestamp inactiveDate;
}