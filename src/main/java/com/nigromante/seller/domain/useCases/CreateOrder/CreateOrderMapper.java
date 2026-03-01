
package com.nigromante.seller.domain.useCases.CreateOrder;

import com.nigromante.seller.domain.entities.Order;

public class CreateOrderMapper {

    public static Order Map(  CreateOrderCommand command ) {
      return( new Order ( command.orderId , command.customerId ) );

    }

}

