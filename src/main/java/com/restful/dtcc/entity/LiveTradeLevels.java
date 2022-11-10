package com.restful.dtcc.entity;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.sql.Timestamp;


@Entity
@Table(name = "LIVE_TRADE_LEVELS")
@Getter
@Setter
public class LiveTradeLevels {

    @Id
    @Column(name = "TRADE_SIDE_ID")
    private Long tradeSideId;

    @Column(name = "ORIGINATOR_OF_MESSAGE_ID")
    private Long originatorOfMessageId;

    //counter_party_org_id INT foreign key references organization(org_id),
    //instructing_party_org_id INT foreign key references organization(org_id),
    //executing_broker_org_id INT foreign key references organization(org_id),

    @Column(name = "ALERT_COUNTRY_CODE")
    private Long alertCountryCode;

    @Column(name = "BUY_SELL_IND")
    private Long buySellInd;

    @Column(name = "DEAL_PRICE")
    private Float dealPrice;

    @Column(name = "EXECUTING_BROKER")
    private String executingBroker;

    @Column(name = "INSTRUCTING_PARTY")
    private String instructingParty;

    @Column(name = "QUANTITY_OF_BLOCK_TRADE")
    private String quantityOfBlockTrade;

    @Column(name = "SETTLEMENT_DATE")
    private Date settlementDate;

    @Column(name = "TOTAL_TRADE_AMOUNT")
    private Float totalTradeAmount;

    @Column(name = "TRADE_DATE_TIME")
    private Timestamp tradeDateTime;

    @Column(name = "TYPE_OF_FINANCIAL_INSTRUMENT")
    private Long typeOfFinancialInstrument;

    @Column(name = "VERSION_OF_TRADE_COMPONENT")
    private Long versionOfTradeComponent;

    @Column(name = "TOTAL_SETTLEMENT_AMOUNT")
    private Float totalSettlementAmount;

    @Column(name = "TOTAL_ACCRUED_INTEREST_AMOUNT")
    private Float totalAccruedInterestAmount;

    @Column(name = "TOTAL_TRADE_CHARGES_OR_TAXES")
    private Float totalTradeChargesOrTaxes;

    @Column(name = "LISTED")
    private Boolean listed;

    @Column(name = "TOTAL_TRADE_COMMISSIONS")
    private Float totalTradeCommissions;

    @Column(name = "TYPE_OF_TRANSACTION_IND")
    private Long typeOfTransactionInd;

    @Column(name = "MASTER_REFERENCE")
    private Long masterReference;

    @Column(name = "TOTAL_NET_CASH_AMOUNT")
    private Float totalNetCashAmount;

    @Column(name = "TIME_ZONE")
    private String timeZone;

    //l2_matching_profile_id INT foreign key references matching_profile(matching_profile_id),

    @Column(name = "TL_BAG_OBJECT_TYPE")
    private Long tlBagObjectType;

    @Column(name = "SECURITY_CODE_TYPE")
    private Long securityCodeType;

    @Column(name = "SECURITY_CODE")
    private Long securityCode;

    @Column(name = "TRADE_TRANS_CONDITION_STRING")
    private String tradeTransConditionString;

    @Column(name = "TYPE_OF_PRICE_IND_SA")
    private Long typeOfPriceIndSa;

    @Column(name = "DESCRIPTION_OF_SECURITY_ST")
    private String descriptionOfSecuritySt;

    @Column(name = "ADDITIONAL_TEXT_STRING")
    private String additionalTextString;

    @Column(name = "WHERE_LISTED_STRING")
    private String whereListedString;

    @Column(name = "MATCHING_SECURITY_CODE")
    private Long matchingSecurityCode;

    @Column(name = "EXECUTOR_ALERT_ACRONYM")
    private String executorAlertAcronym;

    @Column(name = "SHOW_HIDDEN_FIELDS_INDICATOR")
    private Boolean showHiddenFieldsIndicator;

    @Column(name = "YIELDS")
    private Float yields;

    @Column(name = "COMPLETE_STATUS")
    private Long completeStatus;

    @Column(name = "MATCH_STATUS")
    private Long matchStatus;

    @Column(name = "MATCH_AGREED_STATUS")
    private Long matchAgreedStatus;

    @Column(name = "ERROR_STATUS")
    private Long errorStatus;

    @Column(name = "TL_HIGHEST_ERROR_SEVERITY_DTM")
    private Timestamp tlHighestErrorSeverityDtm;

    @Column(name = "TS_HIGHEST_ERROR_SEVERITY_DTM")
    private Timestamp tsHighestErrorSeverityDtm;

    @Column(name = "COMPLETE_STATUS_DTM")
    private Timestamp completeStatusDtm;

    @Column(name = "MATCH_STATUS_STM")
    private Timestamp matchStatusDtm;

    @Column(name = "MATCH_AGREED_STATUS_DTM")
    private Timestamp matchAgreedStatusDtm;

    @Column(name = "ERROR_STATUS_DTM")
    private Timestamp errorStatusDtm;

    @Column(name = "REJECT_FLAG")
    private Boolean rejectFlag;

    @Column(name = "ISITC_REJECT_REASON_CODE")
    private Long isitcRejectReasonCode;

    @Column(name = "REJECT_COMPONENT_TEXT_STRING")
    private String rejectComponentTextString;

    @Column(name = "REJECT_COMPONENT_DTM")
    private Timestamp rejectComponentDtm;

    @Column(name = "IS_AWAITING_AMEND")
    private Boolean isAwaitingAmend;

    @Column(name = "COUNTER_PARTY_SIDE_ID")
    private Long counterPartySideId;

    @Column(name = "TRADE_LEVEL_EXPECTED")
    private Boolean tradeLevelExpected;

    @Column(name = "TRADE_LEVEL_RECEIVED")
    private Boolean tradeLevelReceived;

    @Column(name = "TRANSPORT_MESSAGE_ID")
    private String transportMessageId;

    //user_id INT foreign key references user_info(user_id),

    @Column(name = "MAGR_MATCH_AGREED_STATUS_DTM")
    private Timestamp magrMatchAgreedStatusDtm;

    //brmg_id INT foreign key references broker_matching_group(brmg_id),

    @Column(name = "DEAL_PRICE_IS_L1_FIELD")
    private Boolean dealPriceIsL1Field;

    @Column(name = "FIRST_MATCH_STATUS_NMAT")
    private Timestamp firstMatchStatusNmat;

    @Column(name = "FIRST_MATCH_STATUS_MISM")
    private Timestamp firstMatchStatusMism;

    @Column(name = "FIRST_COMPLETE_STATUS_INCP")
    private Timestamp firstCompleteStatusIncp;

    @Column(name = "FIRST_MATCH_AGREED_STATUS_NMAG")
    private Timestamp firstMatchAgreedStatusNmag;

    @Column(name = "PACKED_TRADE_COMMISSIONS")
    private Float packedTradeCommissions;

    @Column(name = "ASYNCH_ERROR_EXISTS")
    private Boolean asynchErrorExists;

    @Column(name = "FIRST_REJECT_COMP_TEXT_STRING")
    private String firstRejectCompTextString;

    @Column(name = "FIRST_REJECT_COMPONENT_DTM")
    private Timestamp firstRejectComponentDtm;

    @Column(name = "FIRST_COMPLETE_STATUS_COMP")
    private Timestamp firstCompleteStatusComp;

    @Column(name = "TRADE_CURRENCY_CODE")
    private Long tradeCurrencyCode;

    @Column(name = "TL_FORCEMATCHFLAG")
    private Long tlForcematchflag;

    @Column(name = "DML_ACTION")
    private Character dmlAction;

    @Column(name = "DML_TIMESTAMP")
    private Timestamp dmlTimestamp;

    @Column(name = "ISIN")
    private Long isin;

    //workflow_modifiers INT foreign key references workflow_modifier_lp(id),
    //workflow_type INT foreign key references workflow_type_lp(id),

}