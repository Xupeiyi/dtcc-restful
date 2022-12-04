package com.restful.dtcc.entity;

import com.fasterxml.jackson.annotation.JsonFilter;
import lombok.Getter;
import lombok.Setter;


import javax.persistence.*;
import java.sql.Timestamp;


@Entity
@Table(name = "LIVE_TRADE_DETAILS")
@Getter
@Setter
@JsonFilter("liveTradeDetailsFilter")
public class LiveTradeDetails {

    private static final long serialVersionUID = 1918446199175160468L;

    @EmbeddedId
    private LiveTradeDetailsId liveTradeDetailsId;

    @Column(name = "TD_BAG_OBJECT_TYPE")
    private Long tdBagObjectType;

    @Column(name = "ACCRUED_INTEREST_AMOUNT")
    private Float accuruedInterestAmount;

    //account_id INT foreign key references ALERT_ACCOUNT(ACCOUNT_ID),

    @Column(name = "EXCHANGE_RATE")
    private Float exchangeRate;

    @Column(name = "SETTLEMENT_AMOUNT")
    private Float settlementAmount;

    @Column(name = "QUANTITY_ALLOCATED")
    private Long quantityAllocated;

    @Column(name = "VERSION_OF_TRADE_COMPONENT")
    private Long versionOfTradeComponent;

    @Column(name = "TRADE_AMOUNT")
    private Float tradeAmount;

    @Column(name = "NET_CASH_AMOUNT")
    private Float netCashAmount;

    @Column(name = "CLIENT_ALLOCATION_REFERENCE")
    private String clientAllocationReference;

    @Column(name = "ALERT_COUNTRY_CODE")
    private Long alertCountryCode;

    @Column(name = "ALERT_METHOD_TYPE")
    private Long alertMethodType;

    //alert_security_type INT foreign key references security_type_lp(id),

    @Column(name = "ALERT_SETTLEMENT_MODEL_NAME")
    private String alertSettlementModelName;

    //trade_side_id INT foreign key references live_trade_levels(trade_side_id),

    @Column(name = "PARTY_FUND_NAME_SA")
    private String partyFundNameSa;

    @Column(name = "ORIGINAL_FACE_AMOUNT")
    private Float originalFaceAmount;

    @Column(name = "DIRECTED_COMMISSIONS_A")
    private Float directedCommissionsA;

    @Column(name = "COUNTER_PARTY_DETAIL_ID")
    private Long counterPartyDetailId;

    @Column(name = "MATCH_STATUS")
    private Long matchStatus;

    @Column(name = "ERROR_STATUS")
    private Long errorStatus;

    @Column(name = "TD_HIGHEST_ERROR_SEVERITY_DTM")
    private Timestamp tHighestErrorSeverityDtm;

    @Column(name = "MATCH_STATUS_DTM")
    private Timestamp matchStatusDtm;

    @Column(name = "ERROR_STATUS_DTM")
    private Timestamp errorStatusDtm;

    @Column(name = "CANCEL_TEXT_STRING")
    private String cancelTextString;

    @Column(name = "TRANSPORT_MESSAGE_ID")
    private String transportMessageId;

    //user_id INT foreign key references user_info(user_id),

    @Column(name = "TE_VISIBLE_ONLY")
    private Boolean teVisibleOnly;

    @Column(name = "REJECT_FLAG")
    private Boolean rejectFlag;

    @Column(name = "ISITC_REJECT_REASON_CODE")
    private Long isitcRejectReasonCode;

    @Column(name = "REJECT_COMPONENT_TEXT_STRING")
    private String rejectComponentTextString;

    @Column(name = "REJECT_COMPONENT_DTM")
    private Timestamp rejectComponentDtm;

    @Column(name = "LOGIN_ID")
    private String loginId;

    @Column(name = "ORIGINATOR_OF_MESSAGE_ID")
    private Long originatorOfMessageId;

    @Column(name = "FIRST_MATCH_STATUS_NMAT")
    private Timestamp firstMatchStatusNmat;

    //counter_party_org_id INT foreign key references organization(org_id),

    @Column(name = "FIRST_MATCH_STATUS_MISM")
    private Timestamp firstMatchStatusMism;

    @Column(name = "PACKED_COMMISSIONS")
    private Float packedCommissions;

    @Column(name = "asynch_error_exists")
    private Boolean asyncErrorExists;

    @Column(name = "REPORTED_PRICE")
    private Float reportedPrice;

    @Column(name = "MARKUP_MARKDOWN")
    private Float markupMarkdown;

    @Column(name = "ASSET_BACKED")
    private Boolean assetBacked;

    @Column(name = "MARKET_MAKER")
    private String marketMaker;

    @Column(name = "CURRENT_FACE_VALUE")
    private Float currentFaceValue;

    //clearing_broker_org_id INT foreign key references organization(org_id),

    @Column(name = "CLEARING_BROKER")
    private String clearingBroker;

    @Column(name = "TD_FORCEMATCHFLAG")
    private Long tdForcematchflag;

    @Column(name = "DML_ACTION")
    private Character dmlAction;

    @Column(name = "DML_TIMESTAMP")
    private Timestamp dmlTimestamp;

    @Column(name = "DML_SCN")
    private Long dmlScn;

    @Column(name = "ACCESS_CODE_LE_ID")
    private Long accessCodeLeId;

    //workflow_modifiers INT foreign key references workflow_modifier_lp(id),

    @Column(name = "LARGE_TRADE_ID")
    private Long largeTradeId;

    //constraint pk_live_trade_details primary key (trade_side_id, trade_detail_id)
    @OneToOne(mappedBy = "liveTradeDetails")
    private TradesuitePta tradesuitePta;
}