/*
 * This file is generated by jOOQ.
*/
package de.quinscape.domainql.testdomain.tables.daos;


import de.quinscape.domainql.testdomain.tables.SourceFive;
import de.quinscape.domainql.testdomain.tables.records.SourceFiveRecord;

import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


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
@Repository
public class SourceFiveDao extends DAOImpl<SourceFiveRecord, de.quinscape.domainql.testdomain.tables.pojos.SourceFive, String> {

    /**
     * Create a new SourceFiveDao without any configuration
     */
    public SourceFiveDao() {
        super(SourceFive.SOURCE_FIVE, de.quinscape.domainql.testdomain.tables.pojos.SourceFive.class);
    }

    /**
     * Create a new SourceFiveDao with an attached configuration
     */
    @Autowired
    public SourceFiveDao(Configuration configuration) {
        super(SourceFive.SOURCE_FIVE, de.quinscape.domainql.testdomain.tables.pojos.SourceFive.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getId(de.quinscape.domainql.testdomain.tables.pojos.SourceFive object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<de.quinscape.domainql.testdomain.tables.pojos.SourceFive> fetchById(String... values) {
        return fetch(SourceFive.SOURCE_FIVE.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public de.quinscape.domainql.testdomain.tables.pojos.SourceFive fetchOneById(String value) {
        return fetchOne(SourceFive.SOURCE_FIVE.ID, value);
    }

    /**
     * Fetch records that have <code>target_id IN (values)</code>
     */
    public List<de.quinscape.domainql.testdomain.tables.pojos.SourceFive> fetchByTargetId(String... values) {
        return fetch(SourceFive.SOURCE_FIVE.TARGET_ID, values);
    }
}
