

package com.nigromante.seller.application;

import com.nigromante.seller.domain.entities.Order;

public class CreateOrderCommand {

    int id;

    public CreateOrderCommand( int id ) {

      this.id = id ;

    }

    public Order CreateOrder() {
      Order order = new Order( this.id );
      return order;

    }
}

