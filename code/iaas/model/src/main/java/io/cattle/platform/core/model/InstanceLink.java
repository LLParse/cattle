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
@Table(name = "instance_link", schema = "cattle")
public interface InstanceLink extends Serializable {

    /**
     * Setter for <code>cattle.instance_link.id</code>.
     */
    public void setId(Long value);

    /**
     * Getter for <code>cattle.instance_link.id</code>.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false, precision = 19)
    public Long getId();

    /**
     * Setter for <code>cattle.instance_link.name</code>.
     */
    public void setName(String value);

    /**
     * Getter for <code>cattle.instance_link.name</code>.
     */
    @Column(name = "name", length = 255)
    public String getName();

    /**
     * Setter for <code>cattle.instance_link.account_id</code>.
     */
    public void setAccountId(Long value);

    /**
     * Getter for <code>cattle.instance_link.account_id</code>.
     */
    @Column(name = "account_id", precision = 19)
    public Long getAccountId();

    /**
     * Setter for <code>cattle.instance_link.kind</code>.
     */
    public void setKind(String value);

    /**
     * Getter for <code>cattle.instance_link.kind</code>.
     */
    @Column(name = "kind", nullable = false, length = 255)
    public String getKind();

    /**
     * Setter for <code>cattle.instance_link.uuid</code>.
     */
    public void setUuid(String value);

    /**
     * Getter for <code>cattle.instance_link.uuid</code>.
     */
    @Column(name = "uuid", unique = true, nullable = false, length = 128)
    public String getUuid();

    /**
     * Setter for <code>cattle.instance_link.description</code>.
     */
    public void setDescription(String value);

    /**
     * Getter for <code>cattle.instance_link.description</code>.
     */
    @Column(name = "description", length = 1024)
    public String getDescription();

    /**
     * Setter for <code>cattle.instance_link.state</code>.
     */
    public void setState(String value);

    /**
     * Getter for <code>cattle.instance_link.state</code>.
     */
    @Column(name = "state", nullable = false, length = 128)
    public String getState();

    /**
     * Setter for <code>cattle.instance_link.created</code>.
     */
    public void setCreated(Date value);

    /**
     * Getter for <code>cattle.instance_link.created</code>.
     */
    @Column(name = "created")
    public Date getCreated();

    /**
     * Setter for <code>cattle.instance_link.removed</code>.
     */
    public void setRemoved(Date value);

    /**
     * Getter for <code>cattle.instance_link.removed</code>.
     */
    @Column(name = "removed")
    public Date getRemoved();

    /**
     * Setter for <code>cattle.instance_link.remove_time</code>.
     */
    public void setRemoveTime(Date value);

    /**
     * Getter for <code>cattle.instance_link.remove_time</code>.
     */
    @Column(name = "remove_time")
    public Date getRemoveTime();

    /**
     * Setter for <code>cattle.instance_link.data</code>.
     */
    public void setData(Map<String,Object> value);

    /**
     * Getter for <code>cattle.instance_link.data</code>.
     */
    @Column(name = "data", length = 16777215)
    public Map<String,Object> getData();

    /**
     * Setter for <code>cattle.instance_link.link_name</code>.
     */
    public void setLinkName(String value);

    /**
     * Getter for <code>cattle.instance_link.link_name</code>.
     */
    @Column(name = "link_name", length = 255)
    public String getLinkName();

    /**
     * Setter for <code>cattle.instance_link.instance_id</code>.
     */
    public void setInstanceId(Long value);

    /**
     * Getter for <code>cattle.instance_link.instance_id</code>.
     */
    @Column(name = "instance_id", precision = 19)
    public Long getInstanceId();

    /**
     * Setter for <code>cattle.instance_link.target_instance_id</code>.
     */
    public void setTargetInstanceId(Long value);

    /**
     * Getter for <code>cattle.instance_link.target_instance_id</code>.
     */
    @Column(name = "target_instance_id", precision = 19)
    public Long getTargetInstanceId();

    /**
     * Setter for <code>cattle.instance_link.service_consume_map_id</code>.
     */
    public void setServiceConsumeMapId(Long value);

    /**
     * Getter for <code>cattle.instance_link.service_consume_map_id</code>.
     */
    @Column(name = "service_consume_map_id", precision = 19)
    public Long getServiceConsumeMapId();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface InstanceLink
     */
    public void from(io.cattle.platform.core.model.InstanceLink from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface InstanceLink
     */
    public <E extends io.cattle.platform.core.model.InstanceLink> E into(E into);
}
