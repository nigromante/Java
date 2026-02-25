
package com.nigromante.test;

import com.nigromante.seller.application.CreateOrderService;
import com.nigromante.seller.application.CreateOrderCommand;
import com.nigromante.seller.infrastructure.repositories.OrderRepositoryMysql;
import com.nigromante.seller.domain.entities.Order;

public class Seller {

    public static void start(String[] args) {

        System.out.println("-----------------------------------------------------------------------");
        System.out.println("Seller : DDD structure");
        
    
        CreateOrderService a = new CreateOrderService( new OrderRepositoryMysql() );
        int tt = a.run( new CreateOrderCommand("orderId" , "customerId") );
        a = null;

        System.out.println( "Returns : " + tt);

    }

}
