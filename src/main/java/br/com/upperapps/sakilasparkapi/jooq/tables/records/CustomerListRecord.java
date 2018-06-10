/*
 * This file is generated by jOOQ.
 */
package br.com.upperapps.sakilasparkapi.jooq.tables.records;


import br.com.upperapps.sakilasparkapi.jooq.tables.CustomerList;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.TableRecordImpl;
import org.jooq.types.UByte;
import org.jooq.types.UShort;


/**
 * VIEW
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CustomerListRecord extends TableRecordImpl<CustomerListRecord> implements Record9<UShort, String, String, String, String, String, String, String, UByte> {

    private static final long serialVersionUID = -1154671310;

    /**
     * Setter for <code>sakila.customer_list.ID</code>.
     */
    public void setId(UShort value) {
        set(0, value);
    }

    /**
     * Getter for <code>sakila.customer_list.ID</code>.
     */
    public UShort getId() {
        return (UShort) get(0);
    }

    /**
     * Setter for <code>sakila.customer_list.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>sakila.customer_list.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>sakila.customer_list.address</code>.
     */
    public void setAddress(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>sakila.customer_list.address</code>.
     */
    public String getAddress() {
        return (String) get(2);
    }

    /**
     * Setter for <code>sakila.customer_list.zip code</code>.
     */
    public void setZipCode(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>sakila.customer_list.zip code</code>.
     */
    public String getZipCode() {
        return (String) get(3);
    }

    /**
     * Setter for <code>sakila.customer_list.phone</code>.
     */
    public void setPhone(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>sakila.customer_list.phone</code>.
     */
    public String getPhone() {
        return (String) get(4);
    }

    /**
     * Setter for <code>sakila.customer_list.city</code>.
     */
    public void setCity(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>sakila.customer_list.city</code>.
     */
    public String getCity() {
        return (String) get(5);
    }

    /**
     * Setter for <code>sakila.customer_list.country</code>.
     */
    public void setCountry(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>sakila.customer_list.country</code>.
     */
    public String getCountry() {
        return (String) get(6);
    }

    /**
     * Setter for <code>sakila.customer_list.notes</code>.
     */
    public void setNotes(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>sakila.customer_list.notes</code>.
     */
    public String getNotes() {
        return (String) get(7);
    }

    /**
     * Setter for <code>sakila.customer_list.SID</code>.
     */
    public void setSid(UByte value) {
        set(8, value);
    }

    /**
     * Getter for <code>sakila.customer_list.SID</code>.
     */
    public UByte getSid() {
        return (UByte) get(8);
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<UShort, String, String, String, String, String, String, String, UByte> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<UShort, String, String, String, String, String, String, String, UByte> valuesRow() {
        return (Row9) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UShort> field1() {
        return CustomerList.CUSTOMER_LIST.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return CustomerList.CUSTOMER_LIST.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return CustomerList.CUSTOMER_LIST.ADDRESS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return CustomerList.CUSTOMER_LIST.ZIP_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return CustomerList.CUSTOMER_LIST.PHONE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return CustomerList.CUSTOMER_LIST.CITY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return CustomerList.CUSTOMER_LIST.COUNTRY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return CustomerList.CUSTOMER_LIST.NOTES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UByte> field9() {
        return CustomerList.CUSTOMER_LIST.SID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UShort component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getAddress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getZipCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getPhone();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getCity();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getCountry();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getNotes();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UByte component9() {
        return getSid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UShort value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getAddress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getZipCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getPhone();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getCity();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getCountry();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getNotes();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UByte value9() {
        return getSid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CustomerListRecord value1(UShort value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CustomerListRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CustomerListRecord value3(String value) {
        setAddress(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CustomerListRecord value4(String value) {
        setZipCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CustomerListRecord value5(String value) {
        setPhone(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CustomerListRecord value6(String value) {
        setCity(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CustomerListRecord value7(String value) {
        setCountry(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CustomerListRecord value8(String value) {
        setNotes(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CustomerListRecord value9(UByte value) {
        setSid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CustomerListRecord values(UShort value1, String value2, String value3, String value4, String value5, String value6, String value7, String value8, UByte value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CustomerListRecord
     */
    public CustomerListRecord() {
        super(CustomerList.CUSTOMER_LIST);
    }

    /**
     * Create a detached, initialised CustomerListRecord
     */
    public CustomerListRecord(UShort id, String name, String address, String zipCode, String phone, String city, String country, String notes, UByte sid) {
        super(CustomerList.CUSTOMER_LIST);

        set(0, id);
        set(1, name);
        set(2, address);
        set(3, zipCode);
        set(4, phone);
        set(5, city);
        set(6, country);
        set(7, notes);
        set(8, sid);
    }
}
