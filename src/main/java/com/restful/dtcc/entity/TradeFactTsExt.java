package com.restful.dtcc.entity;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.sql.Timestamp;


@Entity
@Table(name = "trade_fact_ts_ext")
@Getter
@Setter
public class TradeFactTsExt{

    @Column(name = "source_system_cd")
    private String sourceSystemCd;

    @Column(name = "process_dt")
    private Long processDt;

    @Column(name = "tradeid")
    private Long tradeid;

    @Column(name = "institution_acctid")
    private Long institutionAcctid;

    @Column(name = "yr")
    private Long yr;

    @Column(name = "instid")
    private String instid;

    @Column(name = "bkrid")
    private String bkrid;

    @Column(name = "cl_agtid")
    private String clAgtid;

    @Column(name = "cl_bkrid")
    private String clBkrid;

    @Column(name = "agtid")
    private String agtid;

    @Column(name = "inst_tfid")
    private String instTfid;

    @Column(name = "bkr_tfid")
    private String bkrTfid;

    @Column(name = "cl_agt_tfid")
    private String clAgtTfid;

    @Column(name = "cl_bkr_tfid")
    private String clBkrTfid;

    @Column(name = "agt_tfid")
    private String agtTfid;

    @Column(name = "inst_pno_orgid")
    private Long instPnoOrgid;

    @Column(name = "bkr_pno_orgid")
    private Long bkrPnoOrgid;

    @Column(name = "cl_agt_pno_orgid")
    private Long clAgtPnoOrgid;

    @Column(name = "cl_bkr_pno_orgid")
    private Long clBkrPnoOrgid;

    @Column(name = "agt_pno_orgid")
    private Long agtPnoOrgid;

    @Column(name = "rec_type")
    private String recType;

    @Column(name = "elig_type")
    private String eligType;

    @Column(name = "buysell")
    private String buysell;

    @Column(name = "aff_party")
    private String affParty;

    @Column(name = "trade_type")
    private String tradeType;

    @Column(name = "cancel_type")
    private String cancelType;

    @Column(name = "affirm_type")
    private String affirmType;

    @Column(name = "cns_setting_elig")
    private String cnsSettingElig;

    @Column(name = "sett_option")
    private String settOption;

    @Column(name = "status_type")
    private String statusType;

    @Column(name = "alc_source")
    private String alcSource;

    @Column(name = "pset_bic")
    private String psetBic;

    @Column(name = "pset_region")
    private String psetRegion;

    @Column(name = "model")
    private String model;

    @Column(name = "inst_name")
    private String instName;

    @Column(name = "broker_name")
    private String brokerName;

    @Column(name = "agt_name")
    private String agtName;

    @Column(name = "clbroker_name")
    private String clbrokerName;

    @Column(name = "clagt_name")
    private String clagtName;

    @Column(name = "ww_inst_family_name")
    private String wwInstFamilyName;

    @Column(name = "ww_broker_family_name")
    private String wwBrokerFamilyName;

    @Column(name = "ww_agt_family_name")
    private String wwAgtFamilyName;

    @Column(name = "ww_clbroker_family_name")
    private String wwClbrokerFamilyName;

    @Column(name = "ww_clagt_family_name")
    private String wwClagtFamilyName;

    @Column(name = "load_id")
    private String loadId;

    @Column(name = "agt_int_acc")
    private String agtIntAcc;

    @Column(name = "bkr_int_acc")
    private String bkrIntAcc;

    @Column(name = "secur_id")
    private String securId;

    @Column(name = "security_desc")
    private String securityDesc;

    @Column(name = "atp_cancel")
    private String atpCancel;

    @Column(name = "not_aff")
    private Long notAff;

    @Column(name = "aff_on_t")
    private Long affOnT;

    @Column(name = "aff_on_t1am")
    private Long affOnT1am;

    @Column(name = "aff_on_t1pm")
    private Long affOnT1pm;

    @Column(name = "late_affirm")
    private Long lateAffirm;

    @Column(name = "late_pdq_elig")
    private Long latePdqElig;

    @Column(name = "pdq_secur_type")
    private String pdqSecurType;

    @Column(name = "ipid_1")
    private String ipid1;

    @Column(name = "ip_name_1")
    private String ipName1;

    @Column(name = "ipid_2")
    private String ipid2;

    @Column(name = "ip_name_2")
    private String ipName2;

    @Column(name = "ipid_3")
    private String ipid3;

    @Column(name = "ip_name_3")
    private String ipName3;

    @Column(name = "inst_tsid")
    private String instTsid;

    @Column(name = "brk_tsid")
    private String brkTsid;

    @Column(name = "agt_tsid")
    private String agtTsid;

    @Column(name = "cl_brk_tsid")
    private String clBrkTsid;

    @Column(name = "cl_agt_tsid")
    private String clAgtTsid;

    @Column(name = "confirm")
    private Long confirm;

    @Column(name = "cancel")
    private Long cancel;

    @Column(name = "in_by_t_7pm")
    private Long inByT7pm;

    @Column(name = "affirm_by_t_7pm")
    private Long affirmByT7pm;

    @Column(name = "affirm_by_t_9pm")
    private Long affirmByT9pm;

    @Column(name = "affirm_after_t_9pm")
    private Long affirmAfterT9pm;
}