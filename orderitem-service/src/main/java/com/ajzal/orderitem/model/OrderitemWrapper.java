package com.ajzal.orderitem.model;
/**
 * @author ajzal
 */
import java.util.List;

public class OrderitemWrapper {

    private List<Orderitem> orderitems;

    /**
     * @return the persons
     */
    public List<Orderitem> getOrderitems() {
        return orderitems;
    }

    /**
     * @param persons the persons to set
     */
    public void setPersons(List<Orderitem> orderitems) {
        this.orderitems = orderitems;
    }
}