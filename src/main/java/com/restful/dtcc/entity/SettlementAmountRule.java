package com.restful.dtcc.entity;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.sql.Timestamp;


@Entity
@Table(name = "SETTLEMENT_AMOUNT_RULE")
@Getter
@Setter
public class SettlementAmountRule {

    @Id
    @Column(name = "MATCHING_PROFILE_ID")
    private Long matchingProfileId;

    @Column(name = "SETTLEMENT_CURRENCY_CODE")
    private Character settlementCurrencyCode;

    //@Column(name = "PARAMETER1")
    //private Long parameter1;

    //@Column(name = "PARAMETER2")
    //private Long parameter2;

    //foreign key (matching_profile_id) references matching_profile(matching_profile_id)

}