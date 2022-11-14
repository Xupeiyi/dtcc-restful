package com.restful.dtcc.entity;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.sql.Timestamp;
import java.sql.Date;


@Entity
@Table(name = "alert_si")
@Getter
@Setter
public class AlertSi{

    @Id
    @Column(name = "si_id")
    private Long siId;

    @Column(name = "version")
    private Long version;

    @Column(name = "si_type")
    private String siType;

    @Column(name = "model_id")
    private String modelId;

    @Column(name = "ref_id")
    private String refId;

    @Column(name = "cms_id")
    private Long cmsId;

    @Column(name = "purpose")
    private String purpose;

    @Column(name = "effective_date")
    private Date effectiveDate;

    @Column(name = "pset_bic")
    private String psetBic;

    @Column(name = "id_1")
    private String id1;

    @Column(name = "id_2")
    private String id2;

    @Column(name = "lca_ac_no")
    private String lcaAcNo;

    @Column(name = "request_id")
    private String requestId;

    @Column(name = "source_app")
    private Long sourceApp;

    @Column(name = "update_by")
    private String updateBy;

    @Column(name = "update_date")
    private Date updateDate;

    @Column(name = "status")
    private Long status;

    @Column(name = "salt")
    private String salt;
}