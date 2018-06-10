/*
 * This file is generated by jOOQ.
 */
package br.com.upperapps.sakilasparkapi.jooq.tables;


import br.com.upperapps.sakilasparkapi.jooq.Indexes;
import br.com.upperapps.sakilasparkapi.jooq.Keys;
import br.com.upperapps.sakilasparkapi.jooq.Sakila;
import br.com.upperapps.sakilasparkapi.jooq.tables.records.InventoryRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;
import org.jooq.types.UByte;
import org.jooq.types.UInteger;
import org.jooq.types.UShort;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Inventory extends TableImpl<InventoryRecord> {

    private static final long serialVersionUID = 1030932191;

    /**
     * The reference instance of <code>sakila.inventory</code>
     */
    public static final Inventory INVENTORY = new Inventory();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<InventoryRecord> getRecordType() {
        return InventoryRecord.class;
    }

    /**
     * The column <code>sakila.inventory.inventory_id</code>.
     */
    public final TableField<InventoryRecord, UInteger> INVENTORY_ID = createField("inventory_id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).identity(true), this, "");

    /**
     * The column <code>sakila.inventory.film_id</code>.
     */
    public final TableField<InventoryRecord, UShort> FILM_ID = createField("film_id", org.jooq.impl.SQLDataType.SMALLINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sakila.inventory.store_id</code>.
     */
    public final TableField<InventoryRecord, UByte> STORE_ID = createField("store_id", org.jooq.impl.SQLDataType.TINYINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sakila.inventory.last_update</code>.
     */
    public final TableField<InventoryRecord, Timestamp> LAST_UPDATE = createField("last_update", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * Create a <code>sakila.inventory</code> table reference
     */
    public Inventory() {
        this(DSL.name("inventory"), null);
    }

    /**
     * Create an aliased <code>sakila.inventory</code> table reference
     */
    public Inventory(String alias) {
        this(DSL.name(alias), INVENTORY);
    }

    /**
     * Create an aliased <code>sakila.inventory</code> table reference
     */
    public Inventory(Name alias) {
        this(alias, INVENTORY);
    }

    private Inventory(Name alias, Table<InventoryRecord> aliased) {
        this(alias, aliased, null);
    }

    private Inventory(Name alias, Table<InventoryRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Inventory(Table<O> child, ForeignKey<O, InventoryRecord> key) {
        super(child, key, INVENTORY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Sakila.SAKILA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.INVENTORY_IDX_FK_FILM_ID, Indexes.INVENTORY_IDX_STORE_ID_FILM_ID, Indexes.INVENTORY_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<InventoryRecord, UInteger> getIdentity() {
        return Keys.IDENTITY_INVENTORY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<InventoryRecord> getPrimaryKey() {
        return Keys.KEY_INVENTORY_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<InventoryRecord>> getKeys() {
        return Arrays.<UniqueKey<InventoryRecord>>asList(Keys.KEY_INVENTORY_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<InventoryRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<InventoryRecord, ?>>asList(Keys.FK_INVENTORY_FILM, Keys.FK_INVENTORY_STORE);
    }

    public Film film() {
        return new Film(this, Keys.FK_INVENTORY_FILM);
    }

    public Store store() {
        return new Store(this, Keys.FK_INVENTORY_STORE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Inventory as(String alias) {
        return new Inventory(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Inventory as(Name alias) {
        return new Inventory(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Inventory rename(String name) {
        return new Inventory(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Inventory rename(Name name) {
        return new Inventory(name, null);
    }
}
