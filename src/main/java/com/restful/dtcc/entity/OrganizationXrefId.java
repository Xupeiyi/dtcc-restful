package com.restful.dtcc.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrganizationXrefId implements Serializable {

    private Long org_id;

    private String orgXrefType;

    private String orgXrefValue;

}
