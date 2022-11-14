//package com.restful.dtcc.entity;
//
//import lombok.Getter;
//import lombok.Setter;
//import javax.persistence.*;
//import java.sql.Timestamp;
//import java.sql.Date;
//
//@Entity
//@Table(name = "tradesuite_pta")
//@Getter
//@Setter
//public class TradesuitePta{
//
//    @Column(name = "load_date")
//    private Long loadDate;
//
//    @Column(name = "dtcc_control_num")
//    private String dtccControlNum;
//
//    @Column(name = "rec_type")
//    private String RecType;
//
//    @Column(name = "bkrid")
//    private String bkrid;
//
//    @Column(name = "instid")
//    private String instid;
//
//    @Column(name = "agtid")
//    private String agtid;
//
//    @Column(name = "secur_id")
//    private String securId;
//
//    @Column(name = "buysell")
//    private String buysell;
//
//    @Column(name = "pset")
//    private String pset;
//
//    @Column(name = "pdq_secur_type")
//    private String pdqSecurType;
//
//    @Column(name = "atp_cancel")
//    private String atpCancel;
//
//    @Column(name = "agt_int_acc")
//    private String agtIntAcc;
//
//    @Column(name = "bkr_int_acc")
//    private String bkrIntAcc;
//
//    @Column(name = "sett_option")
//    private String settOption;
//
//    @Column(name = "aff_party")
//    private String affParty;
//
//    @Column(name = "elig_type")
//    private String eligType;
//
//    @Column(name = "status_type")
//    private String statusType;
//
//    @Column(name = "trade_type")
//    private String tradeType;
//
//    @Column(name = "cancel_type")
//    private String cancelType;
//
//    @Column(name = "affirm_type")
//    private String affirmType;
//
//    @Column(name = "inst_name")
//    private String instName;
//
//    @Column(name = "inst_bill")
//    private String instBill;
//
//    @Column(name = "agt_name")
//    private String agtName;
//
//    @Column(name = "cns_setting_elig")
//    private String cnsSettingElig;
//
//    @Column(name = "cl_agtid")
//    private String clAgtid;
//
//    @Column(name = "broker_name")
//    private String brokerName;
//
//    @Column(name = "cl_bkrid")
//    private String clBkrid;
//
//    @Column(name = "security_desc")
//    private String securityDesc;
//
//    @Column(name = "confirm")
//    private Long confirm;
//
//    @Column(name = "cancels")
//    private Long cancels;
//
//    @Column(name = "not_aff")
//    private Long notAff;
//
//    @Column(name = "aff_on_t")
//    private Long affOnT;
//
//    @Column(name = "aff_on_t1am")
//    private Long affOnT1am;
//
//    @Column(name = "aff_on_t1pm")
//    private Long affOnT1pm;
//
//    @Column(name = "late_affirm")
//    private Long lateAffirm;
//
//    @Column(name = "pdq_elig")
//    private Long pdqElig;
//
//    @Column(name = "model")
//    private String model;
//
//    @Column(name = "period")
//    private String period;
//
//    @Column(name = "trade_date")
//    private Date tradeDate;
//
//    @Column(name = "sett_date")
//    private Date settDate;
//
//    @Column(name = "late_pdq_elig")
//    private Long latePdqElig;
//
//    @Column(name = "insite")
//    private String insite;
//
//    @Column(name = "alc_source")
//    private String alcSource;
//
//    @Column(name = "ipid_1")
//    private String ipid1;
//
//    @Column(name = "ip_name_1")
//    private String ipName1;
//
//    @Column(name = "ipid_2")
//    private String ipid2;
//
//    @Column(name = "ip_name_2")
//    private String ipName2;
//
//    @Column(name = "ipid_3")
//    private String ipid3;
//
//    @Column(name = "ip_name_3")
//    private String ipName3;
//
//    @Column(name = "agt_categ")
//    private String agtCateg;
//
//    @Column(name = "agt_fee")
//    private String agtFee;
//
//    @Column(name = "agt_del_fee")
//    private String agtDelFee;
//
//    @Column(name = "agt_disc")
//    private String agtDisc;
//
//    @Column(name = "bkr_categ")
//    private String bkrCateg;
//
//    @Column(name = "bkr_fee")
//    private String bkrFee;
//
//    @Column(name = "insite_fee")
//    private String insiteFee;
//
//    @Column(name = "notification_fee")
//    private String notificationFee;
//
//    @Column(name = "bkr_del_fee")
//    private String bkrDelFee;
//
//    @Column(name = "bkr_disc")
//    private String bkrDisc;
//
//    @Column(name = "load_id")
//    private Long loadId;
//
//    @Column(name = "load_rownum")
//    private Long loadRownum;
//
//    @Column(name = "trd_transm_dt")
//    private Timestamp trdTransmDt;
//
//    @Column(name = "trd_actv_dt")
//    private Timestamp trdActvDt;
//
//    @Column(name = "trd_match_dt")
//    private Timestamp trdMatchDt;
//
//    @Column(name = "trd_cnclcorr_dt")
//    private Timestamp trdCnclcorrDt;
//
//    @Column(name = "trd_disaffirm_dt")
//    private Timestamp trdDisaffirmDt;
//
//    @Column(name = "trd_affirm_dt")
//    private Timestamp trdAffirmDt;
//
//    @Column(name = "ctm_block_ref_id")
//    private String ctmBlockRefId;
//
//    @Column(name = "ctm_detail_ref_id")
//    private String ctmDetailRefId;
//
//    @Column(name = "ctm_bkr_conf_id")
//    private String ctmBkrConfId;
//
//    @Column(name = "ctm_brkr_ref_id")
//    private String ctmBrkrRefId;
//}