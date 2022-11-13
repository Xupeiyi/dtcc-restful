package com.restful.dtcc.entity;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.sql.Timestamp;


@Entity
@Table(name = "trade_fact")
@Getter
@Setter
public class TradeFact{

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

    @Column(name = "broker_acctid")
    private Long brokerAcctid;

    @Column(name = "instrumenttypecd")
    private Long instrumenttypecd;

    @Column(name = "assetclasscd")
    private String assetclasscd;

    @Column(name = "tradedtm")
    private Timestamp tradedtm;

    @Column(name = "placeoftrade")
    private String placeoftrade;

    @Column(name = "settlementdtm")
    private Timestamp settlementdtm;

    @Column(name = "firstentrydtm")
    private Timestamp firstentrydtm;

    @Column(name = "firstagreementdtm")
    private Timestamp firstagreementdtm;

    @Column(name = "firstrejectdtm")
    private Timestamp firstrejectdtm;

    @Column(name = "lastrejectdtm")
    private Timestamp lastrejectdtm;

    @Column(name = "firstcanceldtm")
    private Timestamp firstcanceldtm;

    @Column(name = "lastcanceldtm")
    private Timestamp lastcanceldtm;

    @Column(name = "isaffirmedflg")
    private Long isaffirmedflg;

    @Column(name = "security_location")
    private String securityLocation;

    @Column(name = "market_cd")
    private String marketCd;

    @Column(name = "xts_hrs")
    private Float xtsHrs;

    @Column(name = "xts_days")
    private Long xts_days;

    @Column(name = "ara")
    private Long ara;

    @Column(name = "xtst0")
    private Long xtst0;

    @Column(name = "xtst1")
    private Long xtst1;

    @Column(name = "xtst2")
    private Long xtst2;

    @Column(name = "xtst3")
    private Long xtst3;

    @Column(name = "xtst4plus")
    private Long xtst4plus;

    @Column(name = "xd12")
    private Long xd12;

    @Column(name = "xd16")
    private Long xd16;

    @Column(name = "xd18")
    private Long xd18;

    @Column(name = "xd20")
    private Long xd20;

    @Column(name = "xd24")
    private Long xd24;

    @Column(name = "numofshares")
    private Long numofshares;

    @Column(name = "numofallocations")
    private Long numofallocations;

    @Column(name = "feta_hrs")
    private Float fetaHrs;

    @Column(name = "feta_days")
    private Long fetaDays;

    @Column(name = "fets_hrs")
    private Float fetsHrs;

    @Column(name = "fets_days")
    private Long fetsDays;

    @Column(name = "ats_hrs")
    private Float atsHrs;

    @Column(name = "ats_days")
    private Long atsDays;

    @Column(name = "ad12")
    private Long ad12;

    @Column(name = "ad16")
    private Long ad16;

    @Column(name = "ad18")
    private Long ad18;

    @Column(name = "ad20")
    private Long ad20;

    @Column(name = "ad24")
    private Long ad24;

    @Column(name = "adt1")
    private Long adt1;

    @Column(name = "adt2plus")
    private Long adt2plus;

    @Column(name = "fec_hrs")
    private Float fecHrs;

    @Column(name = "fec_days")
    private Long fecDays;

    @Column(name = "xta_hrs")
    private Float xtaHrs;

    @Column(name = "xta_days")
    private Long xtaDays;

    @Column(name = "xta10m")
    private Long xta10m;

    @Column(name = "xta30m")
    private Long xta30m;

    @Column(name = "xta030m")
    private Long xta030m;

    @Column(name = "xta1hr")
    private Long xta1hr;

    @Column(name = "xta3hr")
    private Long xta3hr;

    @Column(name = "xta3hrplus")
    private Long xta3hrplus;

    @Column(name = "fetst0")
    private Long fetst0;

    @Column(name = "fetst1")
    private Long fetst1;

    @Column(name = "fetst2")
    private Long fetst2;

    @Column(name = "fetst3")
    private Long fetst3;

    @Column(name = "fetst4plus")
    private Long fetst4plus;

    @Column(name = "ssm")
    private Long ssm;

    @Column(name = "nssm")
    private Long nssm;

    @Column(name = "sms")
    private Long sms;

    @Column(name = "atm_hrs")
    private Float atmHrs;

    @Column(name = "sdsm0")
    private Long sdsm0;

    @Column(name = "sdsm1")
    private Long sdsm1;

    @Column(name = "sdsm2")
    private Long sdsm2;

    @Column(name = "sdsm3")
    private Long sdsm3;

    @Column(name = "sdsm4plus")
    private Long sdsm4plus;

    @Column(name = "smsbd0")
    private Long smsbd0;

    @Column(name = "smsbd1")
    private Long smsbd1;

    @Column(name = "smsbd2")
    private Long smsbd2;

    @Column(name = "smsbd3")
    private Long smsbd3;

    @Column(name = "smsbd4")
    private Long smsbd4;

    @Column(name = "smsbd5")
    private Long smsbd5;

    @Column(name = "smsbd6")
    private Long smsbd6;

    @Column(name = "smsbd7")
    private Long smsbd7;

    @Column(name = "smsbd8")
    private Long smsbd8;

    @Column(name = "smsbd9")
    private Long smsbd9;

    @Column(name = "is_sdamkt")
    private Long isSdamkt;

    @Column(name = "pset")
    private String pset;

    @Column(name = "tradestatus")
    private Long tradestatus;

    @Column(name = "tradematchstatus")
    private Long tradematchstatus;

    @Column(name = "load_id")
    private Long load_id;

    @Column(name = "ats0")
    private Long ats0;

    @Column(name = "ats1")
    private Long ats1;

    @Column(name = "ats2")
    private Long ats2;

    @Column(name = "ats3")
    private Long ats3;

    @Column(name = "is_sdemkt")
    private Long isSdemkt;

    @Column(name = "is_cdemkt")
    private Long isCdemkt;

    @Column(name = "is_cdamkt")
    private Long isCdamkt;

    @Column(name = "is_cdamkt")
    private Long isCdamkt;

    @Column(name = "touch_oa")
    private Long touchOa;

    @Column(name = "pdq_oa")
    private Long pdqOa;

    @Column(name = "pdqelig")
    private Long pdqelig;
}