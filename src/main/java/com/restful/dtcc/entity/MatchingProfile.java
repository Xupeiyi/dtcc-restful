package com.restful.dtcc.entity;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.sql.Timestamp;


@Entity
@Table(name = "MATCHING_PROFILE")
@Getter
@Setter
public class MatchingProfile {

    @Id
    @Column(name = "MATCHING_PROFILE_ID")
    private Long matchingProfileId;

    @Column(name = "L2_MATCHING_PROFILE_NAME")
    private String l2MatchingProfileName;

    //instructing_party_org_id INT foreign key references organization(org_id),

    @Column(name = "FACTOR_PROFILE_ID")
    private Long factorProfileId;

    @Column(name = "VERSION_OF_MATCHING_PROFILE")
    private Long versionOfMatchingProfile;

    @Column(name = "START_DATE")
    private Timestamp startDate;

    @Column(name = "END_DATE")
    private Timestamp endDate;

    @Column(name = "DEFAULT_MATCHING_PROFILE")
    private Boolean defaultMatchingProfile;

    @Column(name = "PROFILE_CHANGED_BY_VERSION")
    private Long profileChangedByVersion;

    @Column(name = "REQUESTED_END_DATE")
    private Timestamp requestedEndDate;

    @Column(name = "COMMENTS")
    private String comments;

    @Column(name = "MATCHING_PROFILE_TYPED_ID")
    private Long matchingProfileTypedId;

    @Column(name = "ELIGIBLE_PAIRING_FIELD_ID")
    private Long eligiblePairingFieldId;

    @Column(name = "IS_ORG_LEVEL_PROFILE")
    private Boolean isOrgLevelProfile;

    //user_id INT foreign key references user_info(user_id)

}