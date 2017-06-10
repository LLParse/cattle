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
@Table(name = "certificate", schema = "cattle")
public interface Certificate extends Serializable {

    /**
     * Setter for <code>cattle.certificate.id</code>.
     */
    public void setId(Long value);

    /**
     * Getter for <code>cattle.certificate.id</code>.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false, precision = 19)
    public Long getId();

    /**
     * Setter for <code>cattle.certificate.name</code>.
     */
    public void setName(String value);

    /**
     * Getter for <code>cattle.certificate.name</code>.
     */
    @Column(name = "name", length = 255)
    public String getName();

    /**
     * Setter for <code>cattle.certificate.account_id</code>.
     */
    public void setAccountId(Long value);

    /**
     * Getter for <code>cattle.certificate.account_id</code>.
     */
    @Column(name = "account_id", precision = 19)
    public Long getAccountId();

    /**
     * Setter for <code>cattle.certificate.kind</code>.
     */
    public void setKind(String value);

    /**
     * Getter for <code>cattle.certificate.kind</code>.
     */
    @Column(name = "kind", nullable = false, length = 255)
    public String getKind();

    /**
     * Setter for <code>cattle.certificate.uuid</code>.
     */
    public void setUuid(String value);

    /**
     * Getter for <code>cattle.certificate.uuid</code>.
     */
    @Column(name = "uuid", unique = true, nullable = false, length = 128)
    public String getUuid();

    /**
     * Setter for <code>cattle.certificate.description</code>.
     */
    public void setDescription(String value);

    /**
     * Getter for <code>cattle.certificate.description</code>.
     */
    @Column(name = "description", length = 1024)
    public String getDescription();

    /**
     * Setter for <code>cattle.certificate.state</code>.
     */
    public void setState(String value);

    /**
     * Getter for <code>cattle.certificate.state</code>.
     */
    @Column(name = "state", nullable = false, length = 128)
    public String getState();

    /**
     * Setter for <code>cattle.certificate.created</code>.
     */
    public void setCreated(Date value);

    /**
     * Getter for <code>cattle.certificate.created</code>.
     */
    @Column(name = "created")
    public Date getCreated();

    /**
     * Setter for <code>cattle.certificate.removed</code>.
     */
    public void setRemoved(Date value);

    /**
     * Getter for <code>cattle.certificate.removed</code>.
     */
    @Column(name = "removed")
    public Date getRemoved();

    /**
     * Setter for <code>cattle.certificate.remove_time</code>.
     */
    public void setRemoveTime(Date value);

    /**
     * Getter for <code>cattle.certificate.remove_time</code>.
     */
    @Column(name = "remove_time")
    public Date getRemoveTime();

    /**
     * Setter for <code>cattle.certificate.data</code>.
     */
    public void setData(Map<String,Object> value);

    /**
     * Getter for <code>cattle.certificate.data</code>.
     */
    @Column(name = "data", length = 16777215)
    public Map<String,Object> getData();

    /**
     * Setter for <code>cattle.certificate.cert_chain</code>.
     */
    public void setCertChain(String value);

    /**
     * Getter for <code>cattle.certificate.cert_chain</code>.
     */
    @Column(name = "cert_chain", length = 65535)
    public String getCertChain();

    /**
     * Setter for <code>cattle.certificate.cert</code>.
     */
    public void setCert(String value);

    /**
     * Getter for <code>cattle.certificate.cert</code>.
     */
    @Column(name = "cert", length = 65535)
    public String getCert();

    /**
     * Setter for <code>cattle.certificate.key</code>.
     */
    public void setKey(String value);

    /**
     * Getter for <code>cattle.certificate.key</code>.
     */
    @Column(name = "key", length = 65535)
    public String getKey();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface Certificate
     */
    public void from(io.cattle.platform.core.model.Certificate from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface Certificate
     */
    public <E extends io.cattle.platform.core.model.Certificate> E into(E into);
}
