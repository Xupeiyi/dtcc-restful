package com.restful.dtcc.entity;


import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.sql.Timestamp;

@Getter
@Setter
@Entity
@Table(name = "ALERT_ACCOUNT")
@JsonFilter("alertAccountFilter")
public class AlertAccount {

    @Id
    @Column(name = "ACCOUNT_ID")
    private long accountId;

    @Column(name = "VERSION")
    private long version;

    @Column(name = "REF_ID")
    private String refId;
    
    @Column(name = "ACCESS_CODE")
    private String accessCode;

    @Column(name = "ACCOUNT_NAME")
    private String accountName;

    @Column(name = "ACCOUNT_NAME_2") 
    private String accountName2;

    @Column(name = "ACCOUNT_TYPE")
    private String accountType;

    @Column(name = "AFFIRMING_PARTY")
    private String affirmingParty;

    @Column(name = "CHARITY_ACCT_REF")
    private String charityAcctRef;

    @Column(name = "CLIENT_OF_INVESTMENT_ADVISOR")
    private Long clientOfInvestmentAdvisor;

    @Column(name = "CONTACT_NAME")
    private String contactName;

    @Column(name = "CONTACT_PHONE")
    private String contactPhone;

    @Column(name = "COUNTRY_OF_ORIGIN")
    private String countryOfOrigin;

    @Column(name = "FUND_ISIN")
    private String fundIsin;

    @Column(name = "INSTITUTION_BIC")
    private String institutionBic;

    @Column(name = "INSTITUTION_NAME")
    private String institutionName;

    @Column(name = "OMNI_ACCESS_CODE")
    private String omniAccessCode;

    @Column(name = "RECEIVER_BIC")
    private String receiverBic;

    @Column(name = "RECEIVER_NAME")
    private String recevierName;

    @Column(name = "SHORT_NAME")
    private String shortName;

    @Column(name = "TAX_EXEMPT")
    private Long taxExempt;

    @Column(name = "IS_SSN")
    private Long isSSN;

    @Column(name = "TAX_ID")
    private String taxId;

    @Column(name = "TAX_ID_EXPIRATION_DATE")
    private Timestamp taxIdExpirationDate;

    @Column(name = "TAX_WITHHOLDING_REQUIRED")
    private Long taxWithholdingRequired;

    @Column(name = "FUND_TYPE")
    private String fundType;

    @Column(name = "LARGE_TRADE_ID")
    private String largeTradeId;

    @Column(name = "ACCESS_CODE_LE_ID")
    private String accessCodeLeId;

    @Column(name = "REQUEST_ID")
    private String requestId;

    @Column(name = "SOURCE_APP")
    private Long sourceApp;

    @Column(name = "UPDATE_BY")
    private String updateBy;

    @Column(name = "UPDATE_DATE")
    private Timestamp updateDate;

    // foreign key (ORGANIZATION_ID) references ORGANIZATION(ORG_ID)
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ORGANIZATION_ID", referencedColumnName = "ORG_ID", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Organization organization;
}
