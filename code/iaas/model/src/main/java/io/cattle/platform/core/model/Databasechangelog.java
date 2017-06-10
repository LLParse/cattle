/*
 * This file is generated by jOOQ.
*/
package io.cattle.platform.core.model;


import java.io.Serializable;
import java.util.Date;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
@Entity
@Table(name = "DATABASECHANGELOG", schema = "cattle")
public interface Databasechangelog extends Serializable {

    /**
     * Setter for <code>cattle.DATABASECHANGELOG.ID</code>.
     */
    public void setId(String value);

    /**
     * Getter for <code>cattle.DATABASECHANGELOG.ID</code>.
     */
    @Column(name = "ID", nullable = false, length = 255)
    public String getId();

    /**
     * Setter for <code>cattle.DATABASECHANGELOG.AUTHOR</code>.
     */
    public void setAuthor(String value);

    /**
     * Getter for <code>cattle.DATABASECHANGELOG.AUTHOR</code>.
     */
    @Column(name = "AUTHOR", nullable = false, length = 255)
    public String getAuthor();

    /**
     * Setter for <code>cattle.DATABASECHANGELOG.FILENAME</code>.
     */
    public void setFilename(String value);

    /**
     * Getter for <code>cattle.DATABASECHANGELOG.FILENAME</code>.
     */
    @Column(name = "FILENAME", nullable = false, length = 255)
    public String getFilename();

    /**
     * Setter for <code>cattle.DATABASECHANGELOG.DATEEXECUTED</code>.
     */
    public void setDateexecuted(Date value);

    /**
     * Getter for <code>cattle.DATABASECHANGELOG.DATEEXECUTED</code>.
     */
    @Column(name = "DATEEXECUTED", nullable = false)
    public Date getDateexecuted();

    /**
     * Setter for <code>cattle.DATABASECHANGELOG.ORDEREXECUTED</code>.
     */
    public void setOrderexecuted(Integer value);

    /**
     * Getter for <code>cattle.DATABASECHANGELOG.ORDEREXECUTED</code>.
     */
    @Column(name = "ORDEREXECUTED", nullable = false, precision = 10)
    public Integer getOrderexecuted();

    /**
     * Setter for <code>cattle.DATABASECHANGELOG.EXECTYPE</code>.
     */
    public void setExectype(String value);

    /**
     * Getter for <code>cattle.DATABASECHANGELOG.EXECTYPE</code>.
     */
    @Column(name = "EXECTYPE", nullable = false, length = 10)
    public String getExectype();

    /**
     * Setter for <code>cattle.DATABASECHANGELOG.MD5SUM</code>.
     */
    public void setMd5sum(String value);

    /**
     * Getter for <code>cattle.DATABASECHANGELOG.MD5SUM</code>.
     */
    @Column(name = "MD5SUM", length = 35)
    public String getMd5sum();

    /**
     * Setter for <code>cattle.DATABASECHANGELOG.DESCRIPTION</code>.
     */
    public void setDescription(String value);

    /**
     * Getter for <code>cattle.DATABASECHANGELOG.DESCRIPTION</code>.
     */
    @Column(name = "DESCRIPTION", length = 255)
    public String getDescription();

    /**
     * Setter for <code>cattle.DATABASECHANGELOG.COMMENTS</code>.
     */
    public void setComments(String value);

    /**
     * Getter for <code>cattle.DATABASECHANGELOG.COMMENTS</code>.
     */
    @Column(name = "COMMENTS", length = 255)
    public String getComments();

    /**
     * Setter for <code>cattle.DATABASECHANGELOG.TAG</code>.
     */
    public void setTag(String value);

    /**
     * Getter for <code>cattle.DATABASECHANGELOG.TAG</code>.
     */
    @Column(name = "TAG", length = 255)
    public String getTag();

    /**
     * Setter for <code>cattle.DATABASECHANGELOG.LIQUIBASE</code>.
     */
    public void setLiquibase(String value);

    /**
     * Getter for <code>cattle.DATABASECHANGELOG.LIQUIBASE</code>.
     */
    @Column(name = "LIQUIBASE", length = 20)
    public String getLiquibase();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface Databasechangelog
     */
    public void from(io.cattle.platform.core.model.Databasechangelog from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface Databasechangelog
     */
    public <E extends io.cattle.platform.core.model.Databasechangelog> E into(E into);
}
