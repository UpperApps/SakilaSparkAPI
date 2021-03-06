/*
 * This file is generated by jOOQ.
 */
package br.com.upperapps.sakilasparkapi.jooq.tables;


import br.com.upperapps.sakilasparkapi.jooq.Indexes;
import br.com.upperapps.sakilasparkapi.jooq.Keys;
import br.com.upperapps.sakilasparkapi.jooq.Sakila;
import br.com.upperapps.sakilasparkapi.jooq.tables.records.CountryRecord;

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
public class Country extends TableImpl<CountryRecord> {

    private static final long serialVersionUID = -169747150;

    /**
     * The reference instance of <code>sakila.country</code>
     */
    public static final Country COUNTRY = new Country();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CountryRecord> getRecordType() {
        return CountryRecord.class;
    }

    /**
     * The column <code>sakila.country.country_id</code>.
     */
    public final TableField<CountryRecord, UShort> COUNTRY_ID = createField("country_id", org.jooq.impl.SQLDataType.SMALLINTUNSIGNED.nullable(false).identity(true), this, "");

    /**
     * The column <code>sakila.country.country</code>.
     */
    public final TableField<CountryRecord, String> COUNTRY_ = createField("country", org.jooq.impl.SQLDataType.VARCHAR(50).nullable(false), this, "");

    /**
     * The column <code>sakila.country.last_update</code>.
     */
    public final TableField<CountryRecord, Timestamp> LAST_UPDATE = createField("last_update", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * Create a <code>sakila.country</code> table reference
     */
    public Country() {
        this(DSL.name("country"), null);
    }

    /**
     * Create an aliased <code>sakila.country</code> table reference
     */
    public Country(String alias) {
        this(DSL.name(alias), COUNTRY);
    }

    /**
     * Create an aliased <code>sakila.country</code> table reference
     */
    public Country(Name alias) {
        this(alias, COUNTRY);
    }

    private Country(Name alias, Table<CountryRecord> aliased) {
        this(alias, aliased, null);
    }

    private Country(Name alias, Table<CountryRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Country(Table<O> child, ForeignKey<O, CountryRecord> key) {
        super(child, key, COUNTRY);
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
        return Arrays.<Index>asList(Indexes.COUNTRY_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<CountryRecord, UShort> getIdentity() {
        return Keys.IDENTITY_COUNTRY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CountryRecord> getPrimaryKey() {
        return Keys.KEY_COUNTRY_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CountryRecord>> getKeys() {
        return Arrays.<UniqueKey<CountryRecord>>asList(Keys.KEY_COUNTRY_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Country as(String alias) {
        return new Country(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Country as(Name alias) {
        return new Country(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Country rename(String name) {
        return new Country(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Country rename(Name name) {
        return new Country(name, null);
    }
}
