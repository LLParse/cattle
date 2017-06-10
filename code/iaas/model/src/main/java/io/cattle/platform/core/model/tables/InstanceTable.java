/*
 * This file is generated by jOOQ.
*/
package io.cattle.platform.core.model.tables;


import io.cattle.platform.core.model.CattleTable;
import io.cattle.platform.core.model.Keys;
import io.cattle.platform.core.model.tables.records.InstanceRecord;
import io.cattle.platform.db.jooq.converter.DataConverter;
import io.cattle.platform.db.jooq.converter.DateConverter;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


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
public class InstanceTable extends TableImpl<InstanceRecord> {

    private static final long serialVersionUID = 1627696014;

    /**
     * The reference instance of <code>cattle.instance</code>
     */
    public static final InstanceTable INSTANCE = new InstanceTable();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<InstanceRecord> getRecordType() {
        return InstanceRecord.class;
    }

    /**
     * The column <code>cattle.instance.id</code>.
     */
    public final TableField<InstanceRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>cattle.instance.name</code>.
     */
    public final TableField<InstanceRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>cattle.instance.account_id</code>.
     */
    public final TableField<InstanceRecord, Long> ACCOUNT_ID = createField("account_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>cattle.instance.kind</code>.
     */
    public final TableField<InstanceRecord, String> KIND = createField("kind", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>cattle.instance.uuid</code>.
     */
    public final TableField<InstanceRecord, String> UUID = createField("uuid", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

    /**
     * The column <code>cattle.instance.description</code>.
     */
    public final TableField<InstanceRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.VARCHAR.length(1024), this, "");

    /**
     * The column <code>cattle.instance.state</code>.
     */
    public final TableField<InstanceRecord, String> STATE = createField("state", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

    /**
     * The column <code>cattle.instance.created</code>.
     */
    public final TableField<InstanceRecord, Date> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP, this, "", new DateConverter());

    /**
     * The column <code>cattle.instance.removed</code>.
     */
    public final TableField<InstanceRecord, Date> REMOVED = createField("removed", org.jooq.impl.SQLDataType.TIMESTAMP, this, "", new DateConverter());

    /**
     * The column <code>cattle.instance.remove_time</code>.
     */
    public final TableField<InstanceRecord, Date> REMOVE_TIME = createField("remove_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "", new DateConverter());

    /**
     * The column <code>cattle.instance.data</code>.
     */
    public final TableField<InstanceRecord, Map<String,Object>> DATA = createField("data", org.jooq.impl.SQLDataType.CLOB, this, "", new DataConverter());

    /**
     * The column <code>cattle.instance.allocation_state</code>.
     */
    public final TableField<InstanceRecord, String> ALLOCATION_STATE = createField("allocation_state", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>cattle.instance.compute</code>.
     */
    public final TableField<InstanceRecord, Long> COMPUTE = createField("compute", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>cattle.instance.memory_mb</code>.
     */
    public final TableField<InstanceRecord, Long> MEMORY_MB = createField("memory_mb", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>cattle.instance.image_id</code>.
     */
    public final TableField<InstanceRecord, Long> IMAGE_ID = createField("image_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>cattle.instance.hostname</code>.
     */
    public final TableField<InstanceRecord, String> HOSTNAME = createField("hostname", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>cattle.instance.instance_triggered_stop</code>.
     */
    public final TableField<InstanceRecord, String> INSTANCE_TRIGGERED_STOP = createField("instance_triggered_stop", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "");

    /**
     * The column <code>cattle.instance.agent_id</code>.
     */
    public final TableField<InstanceRecord, Long> AGENT_ID = createField("agent_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>cattle.instance.domain</code>.
     */
    public final TableField<InstanceRecord, String> DOMAIN = createField("domain", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "");

    /**
     * The column <code>cattle.instance.first_running</code>.
     */
    public final TableField<InstanceRecord, Date> FIRST_RUNNING = createField("first_running", org.jooq.impl.SQLDataType.TIMESTAMP, this, "", new DateConverter());

    /**
     * The column <code>cattle.instance.token</code>.
     */
    public final TableField<InstanceRecord, String> TOKEN = createField("token", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>cattle.instance.userdata</code>.
     */
    public final TableField<InstanceRecord, String> USERDATA = createField("userdata", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>cattle.instance.registry_credential_id</code>.
     */
    public final TableField<InstanceRecord, Long> REGISTRY_CREDENTIAL_ID = createField("registry_credential_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>cattle.instance.external_id</code>.
     */
    public final TableField<InstanceRecord, String> EXTERNAL_ID = createField("external_id", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "");

    /**
     * The column <code>cattle.instance.native_container</code>.
     */
    public final TableField<InstanceRecord, Boolean> NATIVE_CONTAINER = createField("native_container", org.jooq.impl.SQLDataType.BIT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("b'0'", org.jooq.impl.SQLDataType.BIT)), this, "");

    /**
     * The column <code>cattle.instance.network_container_id</code>.
     */
    public final TableField<InstanceRecord, Long> NETWORK_CONTAINER_ID = createField("network_container_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>cattle.instance.health_state</code>.
     */
    public final TableField<InstanceRecord, String> HEALTH_STATE = createField("health_state", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "");

    /**
     * The column <code>cattle.instance.start_count</code>.
     */
    public final TableField<InstanceRecord, Long> START_COUNT = createField("start_count", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>cattle.instance.create_index</code>.
     */
    public final TableField<InstanceRecord, Long> CREATE_INDEX = createField("create_index", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>cattle.instance.deployment_unit_uuid</code>.
     */
    public final TableField<InstanceRecord, String> DEPLOYMENT_UNIT_UUID = createField("deployment_unit_uuid", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "");

    /**
     * The column <code>cattle.instance.version</code>.
     */
    public final TableField<InstanceRecord, String> VERSION = createField("version", org.jooq.impl.SQLDataType.VARCHAR.length(255).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>cattle.instance.health_updated</code>.
     */
    public final TableField<InstanceRecord, Date> HEALTH_UPDATED = createField("health_updated", org.jooq.impl.SQLDataType.TIMESTAMP, this, "", new DateConverter());

    /**
     * The column <code>cattle.instance.service_index_id</code>.
     */
    public final TableField<InstanceRecord, Long> SERVICE_INDEX_ID = createField("service_index_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>cattle.instance.dns_internal</code>.
     */
    public final TableField<InstanceRecord, String> DNS_INTERNAL = createField("dns_internal", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>cattle.instance.dns_search_internal</code>.
     */
    public final TableField<InstanceRecord, String> DNS_SEARCH_INTERNAL = createField("dns_search_internal", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>cattle.instance.memory_reservation</code>.
     */
    public final TableField<InstanceRecord, Long> MEMORY_RESERVATION = createField("memory_reservation", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>cattle.instance.milli_cpu_reservation</code>.
     */
    public final TableField<InstanceRecord, Long> MILLI_CPU_RESERVATION = createField("milli_cpu_reservation", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>cattle.instance.system</code>.
     */
    public final TableField<InstanceRecord, Boolean> SYSTEM = createField("system", org.jooq.impl.SQLDataType.BIT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("b'0'", org.jooq.impl.SQLDataType.BIT)), this, "");

    /**
     * The column <code>cattle.instance.service_id</code>.
     */
    public final TableField<InstanceRecord, Long> SERVICE_ID = createField("service_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>cattle.instance.environment_id</code>.
     */
    public final TableField<InstanceRecord, Long> STACK_ID = createField("environment_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>cattle.instance.deployment_unit_id</code>.
     */
    public final TableField<InstanceRecord, Long> DEPLOYMENT_UNIT_ID = createField("deployment_unit_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>cattle.instance.revision_id</code>.
     */
    public final TableField<InstanceRecord, Long> REVISION_ID = createField("revision_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>cattle.instance.desired</code>.
     */
    public final TableField<InstanceRecord, Boolean> DESIRED = createField("desired", org.jooq.impl.SQLDataType.BIT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("b'1'", org.jooq.impl.SQLDataType.BIT)), this, "");

    /**
     * Create a <code>cattle.instance</code> table reference
     */
    public InstanceTable() {
        this("instance", null);
    }

    /**
     * Create an aliased <code>cattle.instance</code> table reference
     */
    public InstanceTable(String alias) {
        this(alias, INSTANCE);
    }

    private InstanceTable(String alias, Table<InstanceRecord> aliased) {
        this(alias, aliased, null);
    }

    private InstanceTable(String alias, Table<InstanceRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return CattleTable.CATTLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<InstanceRecord, Long> getIdentity() {
        return Keys.IDENTITY_INSTANCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<InstanceRecord> getPrimaryKey() {
        return Keys.KEY_INSTANCE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<InstanceRecord>> getKeys() {
        return Arrays.<UniqueKey<InstanceRecord>>asList(Keys.KEY_INSTANCE_PRIMARY, Keys.KEY_INSTANCE_IDX_INSTANCE_UUID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<InstanceRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<InstanceRecord, ?>>asList(Keys.FK_INSTANCE__ACCOUNT_ID, Keys.FK_INSTANCE__IMAGE_ID, Keys.FK_INSTANCE__AGENT_ID, Keys.FK_INSTANCE__REGISTRY_CREDENTIAL_ID, Keys.FK_INSTANCE__INSTANCE_ID, Keys.FK_INSTANCE__SERVICE_INDEX_ID, Keys.FK_INSTANCE__SERVICE_ID, Keys.FK_INSTANCE__ENVIRONMENT_ID, Keys.FK_INSTANCE__DEPLOYMENT_UNIT_ID, Keys.FK_INSTANCE__REVISION_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InstanceTable as(String alias) {
        return new InstanceTable(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public InstanceTable rename(String name) {
        return new InstanceTable(name, null);
    }
}
