package com.restful.dtcc.entity;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.sql.Timestamp;


@Entity
@Table(name = "BROKER_MATCHING_GROUP")
@Getter
@Setter
public class brokerMatchingGroup {

    //instructing_party_org_id INT foreign key references organization(org_id),

    @Id
    @Column(name = "BRMG_ID")
    private Long brmgId;

    @Column(name = "BRMG_CODE")
    private String brmgCode;

    @Column(name = "BRMG_NAME")
    private String brmgName;

    @Column(name = "BRMG_NAME_UC")
    private String brmgNameUc;

    @Column(name = "BRMG_DESC")
    private String brmgDesc;

    @Column(name = "BRMG_MODIFIED_DTM")
    private String brmgModifiedDtm;

    @Column(name = "BRMG_CREATE_DTM")
    private Timestamp brmgCreateDtm;

    @Column(name = "BRMG_INACTIVE_DTM")
    private Timestamp brmgInactiveDtm;

}