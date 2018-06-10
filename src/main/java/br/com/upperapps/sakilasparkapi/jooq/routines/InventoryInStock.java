/*
 * This file is generated by jOOQ.
 */
package br.com.upperapps.sakilasparkapi.jooq.routines;


import br.com.upperapps.sakilasparkapi.jooq.Sakila;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;


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
public class InventoryInStock extends AbstractRoutine<Byte> {

    private static final long serialVersionUID = -408403793;

    /**
     * The parameter <code>sakila.inventory_in_stock.RETURN_VALUE</code>.
     */
    public static final Parameter<Byte> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.TINYINT, false, false);

    /**
     * The parameter <code>sakila.inventory_in_stock.p_inventory_id</code>.
     */
    public static final Parameter<Integer> P_INVENTORY_ID = createParameter("p_inventory_id", org.jooq.impl.SQLDataType.INTEGER, false, false);

    /**
     * Create a new routine call instance
     */
    public InventoryInStock() {
        super("inventory_in_stock", Sakila.SAKILA, org.jooq.impl.SQLDataType.TINYINT);

        setReturnParameter(RETURN_VALUE);
        addInParameter(P_INVENTORY_ID);
    }

    /**
     * Set the <code>p_inventory_id</code> parameter IN value to the routine
     */
    public void setPInventoryId(Integer value) {
        setValue(P_INVENTORY_ID, value);
    }

    /**
     * Set the <code>p_inventory_id</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setPInventoryId(Field<Integer> field) {
        setField(P_INVENTORY_ID, field);
    }
}
