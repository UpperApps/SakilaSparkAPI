/*
 * This file is generated by jOOQ.
 */
package br.com.upperapps.sakilasparkapi.jooq;


import br.com.upperapps.sakilasparkapi.jooq.routines.FilmInStock;
import br.com.upperapps.sakilasparkapi.jooq.routines.FilmNotInStock;
import br.com.upperapps.sakilasparkapi.jooq.routines.GetCustomerBalance;
import br.com.upperapps.sakilasparkapi.jooq.routines.InventoryHeldByCustomer;
import br.com.upperapps.sakilasparkapi.jooq.routines.InventoryInStock;
import br.com.upperapps.sakilasparkapi.jooq.routines.RewardsReport;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.Field;
import org.jooq.types.UByte;


/**
 * Convenience access to all stored procedures and functions in sakila
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Routines {

    /**
     * Call <code>sakila.film_in_stock</code>
     */
    public static Integer filmInStock(Configuration configuration, Integer pFilmId, Integer pStoreId) {
        FilmInStock p = new FilmInStock();
        p.setPFilmId(pFilmId);
        p.setPStoreId(pStoreId);

        p.execute(configuration);
        return p.getPFilmCount();
    }

    /**
     * Call <code>sakila.film_not_in_stock</code>
     */
    public static Integer filmNotInStock(Configuration configuration, Integer pFilmId, Integer pStoreId) {
        FilmNotInStock p = new FilmNotInStock();
        p.setPFilmId(pFilmId);
        p.setPStoreId(pStoreId);

        p.execute(configuration);
        return p.getPFilmCount();
    }

    /**
     * Call <code>sakila.get_customer_balance</code>
     */
    public static BigDecimal getCustomerBalance(Configuration configuration, Integer pCustomerId, Timestamp pEffectiveDate) {
        GetCustomerBalance f = new GetCustomerBalance();
        f.setPCustomerId(pCustomerId);
        f.setPEffectiveDate(pEffectiveDate);

        f.execute(configuration);
        return f.getReturnValue();
    }

    /**
     * Get <code>sakila.get_customer_balance</code> as a field.
     */
    public static Field<BigDecimal> getCustomerBalance(Integer pCustomerId, Timestamp pEffectiveDate) {
        GetCustomerBalance f = new GetCustomerBalance();
        f.setPCustomerId(pCustomerId);
        f.setPEffectiveDate(pEffectiveDate);

        return f.asField();
    }

    /**
     * Get <code>sakila.get_customer_balance</code> as a field.
     */
    public static Field<BigDecimal> getCustomerBalance(Field<Integer> pCustomerId, Field<Timestamp> pEffectiveDate) {
        GetCustomerBalance f = new GetCustomerBalance();
        f.setPCustomerId(pCustomerId);
        f.setPEffectiveDate(pEffectiveDate);

        return f.asField();
    }

    /**
     * Call <code>sakila.inventory_held_by_customer</code>
     */
    public static Integer inventoryHeldByCustomer(Configuration configuration, Integer pInventoryId) {
        InventoryHeldByCustomer f = new InventoryHeldByCustomer();
        f.setPInventoryId(pInventoryId);

        f.execute(configuration);
        return f.getReturnValue();
    }

    /**
     * Get <code>sakila.inventory_held_by_customer</code> as a field.
     */
    public static Field<Integer> inventoryHeldByCustomer(Integer pInventoryId) {
        InventoryHeldByCustomer f = new InventoryHeldByCustomer();
        f.setPInventoryId(pInventoryId);

        return f.asField();
    }

    /**
     * Get <code>sakila.inventory_held_by_customer</code> as a field.
     */
    public static Field<Integer> inventoryHeldByCustomer(Field<Integer> pInventoryId) {
        InventoryHeldByCustomer f = new InventoryHeldByCustomer();
        f.setPInventoryId(pInventoryId);

        return f.asField();
    }

    /**
     * Call <code>sakila.inventory_in_stock</code>
     */
    public static Byte inventoryInStock(Configuration configuration, Integer pInventoryId) {
        InventoryInStock f = new InventoryInStock();
        f.setPInventoryId(pInventoryId);

        f.execute(configuration);
        return f.getReturnValue();
    }

    /**
     * Get <code>sakila.inventory_in_stock</code> as a field.
     */
    public static Field<Byte> inventoryInStock(Integer pInventoryId) {
        InventoryInStock f = new InventoryInStock();
        f.setPInventoryId(pInventoryId);

        return f.asField();
    }

    /**
     * Get <code>sakila.inventory_in_stock</code> as a field.
     */
    public static Field<Byte> inventoryInStock(Field<Integer> pInventoryId) {
        InventoryInStock f = new InventoryInStock();
        f.setPInventoryId(pInventoryId);

        return f.asField();
    }

    /**
     * Call <code>sakila.rewards_report</code>
     */
    public static Integer rewardsReport(Configuration configuration, UByte minMonthlyPurchases, BigDecimal minDollarAmountPurchased) {
        RewardsReport p = new RewardsReport();
        p.setMinMonthlyPurchases(minMonthlyPurchases);
        p.setMinDollarAmountPurchased(minDollarAmountPurchased);

        p.execute(configuration);
        return p.getCountRewardees();
    }
}
