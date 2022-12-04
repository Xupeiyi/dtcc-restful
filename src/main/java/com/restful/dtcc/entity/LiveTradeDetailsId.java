package com.restful.dtcc.entity;

import javax.persistence.*;
import java.io.Serializable;


@Embeddable
public class LiveTradeDetailsId implements Serializable {

    private static final long serialVersionUID = 1918446199175160468L;
    @ManyToOne(cascade= CascadeType.ALL, fetch= FetchType.LAZY)
    @JoinColumn(name = "TRADE_SIDE_ID")
    private LiveTradeLevels liveTradeLevels;

    @Column(name = "TRADE_DETAIL_ID")
    private Long tradeDetailsId;

}
