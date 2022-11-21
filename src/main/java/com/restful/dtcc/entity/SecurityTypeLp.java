package com.restful.dtcc.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.NaturalId;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Objects;


@Entity
@Table(name = "security_type_lp")
@Getter
@Setter
public class SecurityTypeLp implements Serializable {

    @Id
    @Column(name = "id")
    private Long id;

    @NaturalId
    @Column(name = "code")
    private String code;

    @Column(name = "description")
    private String description;

//    @Column(name = "profile_instrument_type_code")
//    private String profileInstrumentTypeCode;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(
            name = "profile_instrument_type_code", referencedColumnName = "CODE"
    )
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private SecurityTypeGroupLp securityTypeGroupLp;

    @Column(name = "inactive_date")
    private Timestamp inactiveDate;

    @Override
    public boolean equals (Object o){
        if (o == this) {
            return true;
        }
        if (!(o instanceof SecurityTypeLp)) {
            return false;
        }
        SecurityTypeLp other = (SecurityTypeLp) o;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        long hash = 17;
        hash = hash * prime + this.id;
        hash = hash * prime + this.id;
        return (int)hash;
    }
}