/*
 * This file is generated by jOOQ.
*/
package io.cattle.platform.core.model;


import java.io.Serializable;
import java.util.Date;
import java.util.Map;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "host_template", schema = "cattle")
public interface HostTemplate extends Serializable {

    /**
     * Setter for <code>cattle.host_template.id</code>.
     */
    public void setId(Long value);

    /**
     * Getter for <code>cattle.host_template.id</code>.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false, precision = 19)
    public Long getId();

    /**
     * Setter for <code>cattle.host_template.name</code>.
     */
    public void setName(String value);

    /**
     * Getter for <code>cattle.host_template.name</code>.
     */
    @Column(name = "name", length = 255)
    public String getName();

    /**
     * Setter for <code>cattle.host_template.account_id</code>.
     */
    public void setAccountId(Long value);

    /**
     * Getter for <code>cattle.host_template.account_id</code>.
     */
    @Column(name = "account_id", precision = 19)
    public Long getAccountId();

    /**
     * Setter for <code>cattle.host_template.kind</code>.
     */
    public void setKind(String value);

    /**
     * Getter for <code>cattle.host_template.kind</code>.
     */
    @Column(name = "kind", nullable = false, length = 255)
    public String getKind();

    /**
     * Setter for <code>cattle.host_template.uuid</code>.
     */
    public void setUuid(String value);

    /**
     * Getter for <code>cattle.host_template.uuid</code>.
     */
    @Column(name = "uuid", unique = true, nullable = false, length = 128)
    public String getUuid();

    /**
     * Setter for <code>cattle.host_template.description</code>.
     */
    public void setDescription(String value);

    /**
     * Getter for <code>cattle.host_template.description</code>.
     */
    @Column(name = "description", length = 1024)
    public String getDescription();

    /**
     * Setter for <code>cattle.host_template.state</code>.
     */
    public void setState(String value);

    /**
     * Getter for <code>cattle.host_template.state</code>.
     */
    @Column(name = "state", nullable = false, length = 128)
    public String getState();

    /**
     * Setter for <code>cattle.host_template.created</code>.
     */
    public void setCreated(Date value);

    /**
     * Getter for <code>cattle.host_template.created</code>.
     */
    @Column(name = "created")
    public Date getCreated();

    /**
     * Setter for <code>cattle.host_template.removed</code>.
     */
    public void setRemoved(Date value);

    /**
     * Getter for <code>cattle.host_template.removed</code>.
     */
    @Column(name = "removed")
    public Date getRemoved();

    /**
     * Setter for <code>cattle.host_template.remove_time</code>.
     */
    public void setRemoveTime(Date value);

    /**
     * Getter for <code>cattle.host_template.remove_time</code>.
     */
    @Column(name = "remove_time")
    public Date getRemoveTime();

    /**
     * Setter for <code>cattle.host_template.data</code>.
     */
    public void setData(Map<String,Object> value);

    /**
     * Getter for <code>cattle.host_template.data</code>.
     */
    @Column(name = "data", length = 16777215)
    public Map<String,Object> getData();

    /**
     * Setter for <code>cattle.host_template.driver</code>.
     */
    public void setDriver(String value);

    /**
     * Getter for <code>cattle.host_template.driver</code>.
     */
    @Column(name = "driver", length = 255)
    public String getDriver();

    /**
     * Setter for <code>cattle.host_template.flavor_prefix</code>.
     */
    public void setFlavorPrefix(String value);

    /**
     * Getter for <code>cattle.host_template.flavor_prefix</code>.
     */
    @Column(name = "flavor_prefix", length = 255)
    public String getFlavorPrefix();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface HostTemplate
     */
    public void from(io.cattle.platform.core.model.HostTemplate from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface HostTemplate
     */
    public <E extends io.cattle.platform.core.model.HostTemplate> E into(E into);
}
