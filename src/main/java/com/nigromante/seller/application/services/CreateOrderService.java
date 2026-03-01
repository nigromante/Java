


package com.nigromante.seller.application.services;
import  com.nigromante.seller.domain.useCases.CreateOrder.*;
import  com.nigromante.seller.infrastructure.repositories.OrderRepositoryMysql;

public class CreateOrderService {

    public static int call( String orderId, String customerId ) { 
    
        CreateOrderUseCase useCase = new CreateOrderUseCase( new OrderRepositoryMysql() );

        int tt = useCase.run( new CreateOrderCommand(orderId , customerId) );
        useCase = null;

        return tt;
    }

}

