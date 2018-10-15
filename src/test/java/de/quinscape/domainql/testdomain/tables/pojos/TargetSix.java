/*
 * This file is generated by jOOQ.
*/
package de.quinscape.domainql.testdomain.tables.pojos;


import de.quinscape.domainql.generic.DomainObject;

import java.io.Serializable;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
@Entity
@Table(name = "target_six", schema = "public", indexes = {
    @Index(name = "pk_target_six", unique = true, columnList = "id ASC")
})
public class TargetSix implements DomainObject, Serializable {

    private static final long serialVersionUID = -1890664955;

    private String id;

    public TargetSix() {}

    public TargetSix(TargetSix value) {
        this.id = value.id;
    }

    public TargetSix(
        String id
    ) {
        this.id = id;
    }

    @Id
    @Column(name = "id", unique = true, nullable = false, length = 36)
    @NotNull
    @Size(max = 36)
    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TargetSix (");

        sb.append(id);

        sb.append(")");
        return sb.toString();
    }
}
