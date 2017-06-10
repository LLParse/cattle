/*
 * This file is generated by jOOQ.
*/
package io.cattle.platform.core.model.tables;


import io.cattle.platform.core.model.CattleTable;
import io.cattle.platform.core.model.Keys;
import io.cattle.platform.core.model.tables.records.BackoffRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
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
public class BackoffTable extends TableImpl<BackoffRecord> {

    private static final long serialVersionUID = 1694326781;

    /**
     * The reference instance of <code>cattle.backoff</code>
     */
    public static final BackoffTable BACKOFF = new BackoffTable();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<BackoffRecord> getRecordType() {
        return BackoffRecord.class;
    }

    /**
     * The column <code>cattle.backoff.id</code>.
     */
    public final TableField<BackoffRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>cattle.backoff.resource_type</code>.
     */
    public final TableField<BackoffRecord, String> RESOURCE_TYPE = createField("resource_type", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

    /**
     * The column <code>cattle.backoff.resource_id</code>.
     */
    public final TableField<BackoffRecord, Long> RESOURCE_ID = createField("resource_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>cattle.backoff.count</code>.
     */
    public final TableField<BackoffRecord, Long> COUNT = createField("count", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>cattle.backoff.period</code>.
     */
    public final TableField<BackoffRecord, Long> PERIOD = createField("period", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * Create a <code>cattle.backoff</code> table reference
     */
    public BackoffTable() {
        this("backoff", null);
    }

    /**
     * Create an aliased <code>cattle.backoff</code> table reference
     */
    public BackoffTable(String alias) {
        this(alias, BACKOFF);
    }

    private BackoffTable(String alias, Table<BackoffRecord> aliased) {
        this(alias, aliased, null);
    }

    private BackoffTable(String alias, Table<BackoffRecord> aliased, Field<?>[] parameters) {
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
    public Identity<BackoffRecord, Long> getIdentity() {
        return Keys.IDENTITY_BACKOFF;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<BackoffRecord> getPrimaryKey() {
        return Keys.KEY_BACKOFF_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<BackoffRecord>> getKeys() {
        return Arrays.<UniqueKey<BackoffRecord>>asList(Keys.KEY_BACKOFF_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BackoffTable as(String alias) {
        return new BackoffTable(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public BackoffTable rename(String name) {
        return new BackoffTable(name, null);
    }
}
