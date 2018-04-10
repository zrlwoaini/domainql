/*
 * This file is generated by jOOQ.
*/
package de.quinscape.domainql.testdomain.tables.pojos;


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
@Table(name = "target_five", schema = "public", indexes = {
    @Index(name = "pk_target_five", unique = true, columnList = "id ASC")
})
public class TargetFive implements Serializable {

    private static final long serialVersionUID = 688925579;

    private String id;

    public TargetFive() {}

    public TargetFive(TargetFive value) {
        this.id = value.id;
    }

    public TargetFive(
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
        StringBuilder sb = new StringBuilder("TargetFive (");

        sb.append(id);

        sb.append(")");
        return sb.toString();
    }
}
