

package com.nigromante.seller.application;

import com.nigromante.seller.domain.entities.Order;

public class CreateOrderCommand {

    String orderId;
    String customerId;

    public CreateOrderCommand( String orderId, String customerId ) {

      this.orderId = orderId ;
      this.customerId = customerId;

    }

    public Order CreateOrder() {
        Order order = new Order( this.orderId, this.customerId );
        return order;
    }
}

