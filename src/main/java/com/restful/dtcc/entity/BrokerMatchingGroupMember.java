package com.restful.dtcc.entity;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.sql.Timestamp;


@Entity
@Table(name = "BROKER_MATCHING_GROUP_MEMBER")
@Getter
@Setter
public class brokerMatchingGroupMember {


    @Column(name = "INSTRUCTING_PARTY_ORG_ID")
    private Long instructingPartyOrgId;

    @Column(name = "EXECUTING_BROKER_ORG_ID")
    private Long executingBrokerOrgId;

    @Column(name = "BRMG_ID")
    private Long brmgId;

    //primary key (
    //instructing_party_org_id,
    //executing_broker_org_id,
   // brmg_id
    //),
    //foreign key (instructing_party_org_id) references organization(org_id),
    //foreign key (executing_broker_org_id) references organization(org_id),
    //foreign key (brmg_id) references broker_matching_group(brmg_id)

}