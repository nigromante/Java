

package com.nigromante.seller.application;

import com.nigromante.seller.domain.repositories.OrderRepository;
import com.nigromante.seller.application.CreateOrderCommand;
import com.nigromante.seller.domain.entities.Order;

public class CreateOrderService {
    OrderRepository orderRepository;

    public CreateOrderService(OrderRepository orderRepository) {
      this.orderRepository = orderRepository ;
    }

    public int execute( CreateOrderCommand orderCommand ) {
        Order order = orderCommand.CreateOrder();
        this.orderRepository.save( order ) ; 
        return 4321;
    }

}

