/*
 * This file is generated by jOOQ.
*/
package io.cattle.platform.core.model.tables;


import io.cattle.platform.core.model.CattleTable;
import io.cattle.platform.core.model.Keys;
import io.cattle.platform.core.model.tables.records.ClusterHostMapRecord;
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
public class ClusterHostMapTable extends TableImpl<ClusterHostMapRecord> {

    private static final long serialVersionUID = -1131682498;

    /**
     * The reference instance of <code>cattle.cluster_host_map</code>
     */
    public static final ClusterHostMapTable CLUSTER_HOST_MAP = new ClusterHostMapTable();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ClusterHostMapRecord> getRecordType() {
        return ClusterHostMapRecord.class;
    }

    /**
     * The column <code>cattle.cluster_host_map.id</code>.
     */
    public final TableField<ClusterHostMapRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>cattle.cluster_host_map.name</code>.
     */
    public final TableField<ClusterHostMapRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>cattle.cluster_host_map.kind</code>.
     */
    public final TableField<ClusterHostMapRecord, String> KIND = createField("kind", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>cattle.cluster_host_map.uuid</code>.
     */
    public final TableField<ClusterHostMapRecord, String> UUID = createField("uuid", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

    /**
     * The column <code>cattle.cluster_host_map.description</code>.
     */
    public final TableField<ClusterHostMapRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.VARCHAR.length(1024), this, "");

    /**
     * The column <code>cattle.cluster_host_map.state</code>.
     */
    public final TableField<ClusterHostMapRecord, String> STATE = createField("state", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

    /**
     * The column <code>cattle.cluster_host_map.created</code>.
     */
    public final TableField<ClusterHostMapRecord, Date> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP, this, "", new DateConverter());

    /**
     * The column <code>cattle.cluster_host_map.removed</code>.
     */
    public final TableField<ClusterHostMapRecord, Date> REMOVED = createField("removed", org.jooq.impl.SQLDataType.TIMESTAMP, this, "", new DateConverter());

    /**
     * The column <code>cattle.cluster_host_map.remove_time</code>.
     */
    public final TableField<ClusterHostMapRecord, Date> REMOVE_TIME = createField("remove_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "", new DateConverter());

    /**
     * The column <code>cattle.cluster_host_map.data</code>.
     */
    public final TableField<ClusterHostMapRecord, Map<String,Object>> DATA = createField("data", org.jooq.impl.SQLDataType.CLOB, this, "", new DataConverter());

    /**
     * The column <code>cattle.cluster_host_map.cluster_id</code>.
     */
    public final TableField<ClusterHostMapRecord, Long> CLUSTER_ID = createField("cluster_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>cattle.cluster_host_map.host_id</code>.
     */
    public final TableField<ClusterHostMapRecord, Long> HOST_ID = createField("host_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * Create a <code>cattle.cluster_host_map</code> table reference
     */
    public ClusterHostMapTable() {
        this("cluster_host_map", null);
    }

    /**
     * Create an aliased <code>cattle.cluster_host_map</code> table reference
     */
    public ClusterHostMapTable(String alias) {
        this(alias, CLUSTER_HOST_MAP);
    }

    private ClusterHostMapTable(String alias, Table<ClusterHostMapRecord> aliased) {
        this(alias, aliased, null);
    }

    private ClusterHostMapTable(String alias, Table<ClusterHostMapRecord> aliased, Field<?>[] parameters) {
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
    public Identity<ClusterHostMapRecord, Long> getIdentity() {
        return Keys.IDENTITY_CLUSTER_HOST_MAP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ClusterHostMapRecord> getPrimaryKey() {
        return Keys.KEY_CLUSTER_HOST_MAP_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ClusterHostMapRecord>> getKeys() {
        return Arrays.<UniqueKey<ClusterHostMapRecord>>asList(Keys.KEY_CLUSTER_HOST_MAP_PRIMARY, Keys.KEY_CLUSTER_HOST_MAP_IDX_CLUSTER_HOST_MAP_UUID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<ClusterHostMapRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<ClusterHostMapRecord, ?>>asList(Keys.FK_CLUSTER_HOST_MAP__HOST_ID, Keys.FK_HOST_HOST_MAP__HOST_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClusterHostMapTable as(String alias) {
        return new ClusterHostMapTable(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ClusterHostMapTable rename(String name) {
        return new ClusterHostMapTable(name, null);
    }
}
