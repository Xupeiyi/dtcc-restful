package com.restful.dtcc.entity;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Objects;


@Entity
@Table(name = "security_type_group_lp")
@Getter
@Setter
public class SecurityTypeGroupLp implements Serializable {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "code")
    private String code;

    @Column(name = "description")
    private String description;

    @Column(name = "inactive_date")
    private Timestamp inactiveDate;

    @Override
    public boolean equals (Object o){
        if (o == this) {
            return true;
        }
        if (!(o instanceof SecurityTypeGroupLp)) {
            return false;
        }
        SecurityTypeGroupLp other = (SecurityTypeGroupLp) o;
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