package com.restful.dtcc.entity;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.sql.Timestamp;


@Entity
@Table(name = "MATCHING_PROFILE_COMPARATOR")
@Getter
@Setter
public class MatchingProfileComparator {

    @Column(name = "MATCHING_FIELD_NAME")
    private String matchingFieldName;

    //matching_profile_id INT foreign key references matching_profile(matching_profile_id),

    @Column(name = "OPERATOR")
    private Long operator;

    @Column(name = "MATCHING_FIELD_TYPE")
    private Long matchingFieldType;

    @Column(name = "PARAMETER1")
    private Float parameter1;

    @Column(name = "PARAMETER2")
    private Float parameter2;

    //constraint pk_matching_profile_comparator primary key (matching_profile_id, matching_field_name)

}