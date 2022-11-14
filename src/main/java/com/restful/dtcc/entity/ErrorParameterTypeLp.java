package com.restful.dtcc.entity;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.sql.Timestamp;


@Entity
@Table(name = "ERROR_PARAMETER_TYPE_LP")
@Getter
@Setter
public class ErrorParameterTypeLp {

    @Id
    @Column(name = "ID")
    private Long Id;

    @Column(name = "CODE")
    private String code;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "INACTIVE_DATE")
    private Timestamp inactiveDate;


}