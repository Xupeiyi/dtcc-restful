package com.restful.dtcc.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "FAMILY")
@Getter
@Setter
public class Family {
    @Id
    @Column(name = "FAMILY_ID")
    private Long familyId;

    @Column(name = "FAMILY_NAME")
    private String familyName;

    @Column(name = "FAMILY_DESCRIPTION")
    private String familyDescription;

}
