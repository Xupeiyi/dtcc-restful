package com.restful.dtcc.entity;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.sql.Timestamp;


@Entity
@Table(name = "MATCHING_PROFILE_TRADING_CURR")
@Getter
@Setter
public class MatchingProfileTradingCurr {

    @Column(name = "TRADING_CURRENCY_CODE")
    private Long tradingCurrencyCode;

    //matching_profile_id INT foreign key references matching_profile(matching_profile_id),

    //constraint matching_profile_trading_curr_pk primary key (matching_profile_id, trading_currency_code)
}