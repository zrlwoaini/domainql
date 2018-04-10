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
@Table(name = "source_two", schema = "public", indexes = {
    @Index(name = "pk_source_two", unique = true, columnList = "id ASC")
})
public class SourceTwo implements Serializable {

    private static final long serialVersionUID = 1183813830;

    private String id;
    private String targetId;

    public SourceTwo() {}

    public SourceTwo(SourceTwo value) {
        this.id = value.id;
        this.targetId = value.targetId;
    }

    public SourceTwo(
        String id,
        String targetId
    ) {
        this.id = id;
        this.targetId = targetId;
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

    @Column(name = "target_id", nullable = false, length = 36)
    @NotNull
    @Size(max = 36)
    public String getTargetId() {
        return this.targetId;
    }

    public void setTargetId(String targetId) {
        this.targetId = targetId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("SourceTwo (");

        sb.append(id);
        sb.append(", ").append(targetId);

        sb.append(")");
        return sb.toString();
    }
}
