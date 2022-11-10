package com.restful.dtcc.entity;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.sql.Timestamp;


@Entity
@Table(name = "WORKFLOW_MODIFIER_LP")
@Getter
@Setter
public class WorkflowModifierLp {

    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "CODE")
    private String code;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "WORKFLOW_TYPE")
    private String workflowType;

    @Column(name = "INACTIVE_DATE")
    private Timestamp inactiveDate;

    @Column(name = "DML_ACTION")
    private Character dmlAction;

    @Column(name = "DML_TIMESTAMP")
    private Timestamp dmlTimestamp;

    @Column(name = "DML_SCN")
    private Long dmlScn;

}