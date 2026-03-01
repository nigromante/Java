

package com.nigromante.seller.domain.useCases.CreateOrder;
import  com.nigromante.seller.domain.useCases.CreateOrder.*;

import com.nigromante.seller.domain.entities.Order;
import com.nigromante.seller.domain.repositories.OrderRepository;

public class CreateOrderUseCase {
    OrderRepository orderRepository;

    public CreateOrderUseCase(OrderRepository orderRepository) {
      this.orderRepository = orderRepository ;
    }

    public int run( CreateOrderCommand command ) { 
        Order order = CreateOrderMapper.Map( command );  
        this.orderRepository.save( order ) ; 
        return 4321;
    }

}

