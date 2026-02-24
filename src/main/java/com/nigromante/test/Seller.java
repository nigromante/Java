
package com.nigromante.test;

import com.nigromante.seller.application.CreateOrderService;
import com.nigromante.seller.application.CreateOrderCommand;
import com.nigromante.seller.infrastructure.repositories.OrderRepositoryMysql;
import com.nigromante.seller.domain.entities.Order;

public class Seller {

    public static void start(String[] args) {

        System.out.println("-----------------------------------------------------------------------");
        System.out.println("Seller : ");
        
    
        CreateOrderService a = new CreateOrderService( new OrderRepositoryMysql() );
        int tt = a.execute( new CreateOrderCommand(1) );
        a = null;

        System.out.println( "Returns : " + tt);

    }

}
