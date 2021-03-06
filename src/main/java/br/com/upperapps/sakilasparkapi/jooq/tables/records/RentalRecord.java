/*
 * This file is generated by jOOQ.
 */
package br.com.upperapps.sakilasparkapi.jooq.tables.records;


import br.com.upperapps.sakilasparkapi.jooq.tables.Rental;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;
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
public class RentalRecord extends UpdatableRecordImpl<RentalRecord> implements Record7<Integer, Timestamp, UInteger, UShort, Timestamp, UByte, Timestamp> {

    private static final long serialVersionUID = -1497555755;

    /**
     * Setter for <code>sakila.rental.rental_id</code>.
     */
    public void setRentalId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>sakila.rental.rental_id</code>.
     */
    public Integer getRentalId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>sakila.rental.rental_date</code>.
     */
    public void setRentalDate(Timestamp value) {
        set(1, value);
    }

    /**
     * Getter for <code>sakila.rental.rental_date</code>.
     */
    public Timestamp getRentalDate() {
        return (Timestamp) get(1);
    }

    /**
     * Setter for <code>sakila.rental.inventory_id</code>.
     */
    public void setInventoryId(UInteger value) {
        set(2, value);
    }

    /**
     * Getter for <code>sakila.rental.inventory_id</code>.
     */
    public UInteger getInventoryId() {
        return (UInteger) get(2);
    }

    /**
     * Setter for <code>sakila.rental.customer_id</code>.
     */
    public void setCustomerId(UShort value) {
        set(3, value);
    }

    /**
     * Getter for <code>sakila.rental.customer_id</code>.
     */
    public UShort getCustomerId() {
        return (UShort) get(3);
    }

    /**
     * Setter for <code>sakila.rental.return_date</code>.
     */
    public void setReturnDate(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>sakila.rental.return_date</code>.
     */
    public Timestamp getReturnDate() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>sakila.rental.staff_id</code>.
     */
    public void setStaffId(UByte value) {
        set(5, value);
    }

    /**
     * Getter for <code>sakila.rental.staff_id</code>.
     */
    public UByte getStaffId() {
        return (UByte) get(5);
    }

    /**
     * Setter for <code>sakila.rental.last_update</code>.
     */
    public void setLastUpdate(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>sakila.rental.last_update</code>.
     */
    public Timestamp getLastUpdate() {
        return (Timestamp) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, Timestamp, UInteger, UShort, Timestamp, UByte, Timestamp> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, Timestamp, UInteger, UShort, Timestamp, UByte, Timestamp> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Rental.RENTAL.RENTAL_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field2() {
        return Rental.RENTAL.RENTAL_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field3() {
        return Rental.RENTAL.INVENTORY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UShort> field4() {
        return Rental.RENTAL.CUSTOMER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return Rental.RENTAL.RETURN_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UByte> field6() {
        return Rental.RENTAL.STAFF_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return Rental.RENTAL.LAST_UPDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getRentalId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component2() {
        return getRentalDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger component3() {
        return getInventoryId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UShort component4() {
        return getCustomerId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component5() {
        return getReturnDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UByte component6() {
        return getStaffId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component7() {
        return getLastUpdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getRentalId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value2() {
        return getRentalDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger value3() {
        return getInventoryId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UShort value4() {
        return getCustomerId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getReturnDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UByte value6() {
        return getStaffId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value7() {
        return getLastUpdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RentalRecord value1(Integer value) {
        setRentalId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RentalRecord value2(Timestamp value) {
        setRentalDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RentalRecord value3(UInteger value) {
        setInventoryId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RentalRecord value4(UShort value) {
        setCustomerId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RentalRecord value5(Timestamp value) {
        setReturnDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RentalRecord value6(UByte value) {
        setStaffId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RentalRecord value7(Timestamp value) {
        setLastUpdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RentalRecord values(Integer value1, Timestamp value2, UInteger value3, UShort value4, Timestamp value5, UByte value6, Timestamp value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached RentalRecord
     */
    public RentalRecord() {
        super(Rental.RENTAL);
    }

    /**
     * Create a detached, initialised RentalRecord
     */
    public RentalRecord(Integer rentalId, Timestamp rentalDate, UInteger inventoryId, UShort customerId, Timestamp returnDate, UByte staffId, Timestamp lastUpdate) {
        super(Rental.RENTAL);

        set(0, rentalId);
        set(1, rentalDate);
        set(2, inventoryId);
        set(3, customerId);
        set(4, returnDate);
        set(5, staffId);
        set(6, lastUpdate);
    }
}
