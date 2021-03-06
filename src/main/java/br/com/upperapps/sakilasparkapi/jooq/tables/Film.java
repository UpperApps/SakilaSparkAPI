/*
 * This file is generated by jOOQ.
 */
package br.com.upperapps.sakilasparkapi.jooq.tables;


import br.com.upperapps.sakilasparkapi.jooq.Indexes;
import br.com.upperapps.sakilasparkapi.jooq.Keys;
import br.com.upperapps.sakilasparkapi.jooq.Sakila;
import br.com.upperapps.sakilasparkapi.jooq.enums.FilmRating;
import br.com.upperapps.sakilasparkapi.jooq.tables.records.FilmRecord;

import java.math.BigDecimal;
import java.sql.Date;
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
public class Film extends TableImpl<FilmRecord> {

    private static final long serialVersionUID = 1395595810;

    /**
     * The reference instance of <code>sakila.film</code>
     */
    public static final Film FILM = new Film();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FilmRecord> getRecordType() {
        return FilmRecord.class;
    }

    /**
     * The column <code>sakila.film.film_id</code>.
     */
    public final TableField<FilmRecord, UShort> FILM_ID = createField("film_id", org.jooq.impl.SQLDataType.SMALLINTUNSIGNED.nullable(false).identity(true), this, "");

    /**
     * The column <code>sakila.film.title</code>.
     */
    public final TableField<FilmRecord, String> TITLE = createField("title", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>sakila.film.description</code>.
     */
    public final TableField<FilmRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>sakila.film.release_year</code>.
     */
    public final TableField<FilmRecord, Date> RELEASE_YEAR = createField("release_year", org.jooq.impl.SQLDataType.DATE, this, "");

    /**
     * The column <code>sakila.film.language_id</code>.
     */
    public final TableField<FilmRecord, UByte> LANGUAGE_ID = createField("language_id", org.jooq.impl.SQLDataType.TINYINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sakila.film.original_language_id</code>.
     */
    public final TableField<FilmRecord, UByte> ORIGINAL_LANGUAGE_ID = createField("original_language_id", org.jooq.impl.SQLDataType.TINYINTUNSIGNED, this, "");

    /**
     * The column <code>sakila.film.rental_duration</code>.
     */
    public final TableField<FilmRecord, UByte> RENTAL_DURATION = createField("rental_duration", org.jooq.impl.SQLDataType.TINYINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("3", org.jooq.impl.SQLDataType.TINYINTUNSIGNED)), this, "");

    /**
     * The column <code>sakila.film.rental_rate</code>.
     */
    public final TableField<FilmRecord, BigDecimal> RENTAL_RATE = createField("rental_rate", org.jooq.impl.SQLDataType.DECIMAL(4, 2).nullable(false).defaultValue(org.jooq.impl.DSL.inline("4.99", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>sakila.film.length</code>.
     */
    public final TableField<FilmRecord, UShort> LENGTH = createField("length", org.jooq.impl.SQLDataType.SMALLINTUNSIGNED, this, "");

    /**
     * The column <code>sakila.film.replacement_cost</code>.
     */
    public final TableField<FilmRecord, BigDecimal> REPLACEMENT_COST = createField("replacement_cost", org.jooq.impl.SQLDataType.DECIMAL(5, 2).nullable(false).defaultValue(org.jooq.impl.DSL.inline("19.99", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>sakila.film.rating</code>.
     */
    public final TableField<FilmRecord, FilmRating> RATING = createField("rating", org.jooq.impl.SQLDataType.VARCHAR(5).defaultValue(org.jooq.impl.DSL.inline("G", org.jooq.impl.SQLDataType.VARCHAR)).asEnumDataType(br.com.upperapps.sakilasparkapi.jooq.enums.FilmRating.class), this, "");

    /**
     * The column <code>sakila.film.special_features</code>.
     */
    public final TableField<FilmRecord, String> SPECIAL_FEATURES = createField("special_features", org.jooq.impl.SQLDataType.VARCHAR(54), this, "");

    /**
     * The column <code>sakila.film.last_update</code>.
     */
    public final TableField<FilmRecord, Timestamp> LAST_UPDATE = createField("last_update", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * Create a <code>sakila.film</code> table reference
     */
    public Film() {
        this(DSL.name("film"), null);
    }

    /**
     * Create an aliased <code>sakila.film</code> table reference
     */
    public Film(String alias) {
        this(DSL.name(alias), FILM);
    }

    /**
     * Create an aliased <code>sakila.film</code> table reference
     */
    public Film(Name alias) {
        this(alias, FILM);
    }

    private Film(Name alias, Table<FilmRecord> aliased) {
        this(alias, aliased, null);
    }

    private Film(Name alias, Table<FilmRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Film(Table<O> child, ForeignKey<O, FilmRecord> key) {
        super(child, key, FILM);
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
        return Arrays.<Index>asList(Indexes.FILM_IDX_FK_LANGUAGE_ID, Indexes.FILM_IDX_FK_ORIGINAL_LANGUAGE_ID, Indexes.FILM_IDX_TITLE, Indexes.FILM_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<FilmRecord, UShort> getIdentity() {
        return Keys.IDENTITY_FILM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<FilmRecord> getPrimaryKey() {
        return Keys.KEY_FILM_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<FilmRecord>> getKeys() {
        return Arrays.<UniqueKey<FilmRecord>>asList(Keys.KEY_FILM_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<FilmRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<FilmRecord, ?>>asList(Keys.FK_FILM_LANGUAGE, Keys.FK_FILM_LANGUAGE_ORIGINAL);
    }

    public Language fkFilmLanguage() {
        return new Language(this, Keys.FK_FILM_LANGUAGE);
    }

    public Language fkFilmLanguageOriginal() {
        return new Language(this, Keys.FK_FILM_LANGUAGE_ORIGINAL);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Film as(String alias) {
        return new Film(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Film as(Name alias) {
        return new Film(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Film rename(String name) {
        return new Film(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Film rename(Name name) {
        return new Film(name, null);
    }
}
