package com.restful.dtcc.entity;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.sql.Timestamp;


@Entity
@Table(name = "TIMEZOON_OFFSET")
@Getter
@Setter
public class TimezoonOffset {

    @Id
    @Column(name = "ID")
    private Long Id;

    //code INT foreign key references timezone_lp(code),

    @Column(name = "START_DATE")
    private Timestamp startDate;

    @Column(name = "END_DATE")
    private Timestamp endDate;

    @Column(name = "OFFSET_HOURS")
    private Long offsetHours;

}