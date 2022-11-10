package com.restful.dtcc.entity;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.sql.Timestamp;


@Entity
@Table(name = "TL_BAG_OBJECT_TYPE_LP")
@Getter
@Setter
public class TlBagObjectTypeLp {

    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "CODE")
    private String code;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "INACTIVE_DATE")
    private Date inactiveDate;

}