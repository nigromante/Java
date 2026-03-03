
package com.nigromante.test;

import com.nigromante.seller.application.services.CreateOrderService;

public class Seller {

    public static void start(String[] args) {

        System.out.println("-----------------------------------------------------------------------");
        System.out.println("Seller : DDD structure");
        
        int tt = CreateOrderService.call("mit", "gnn");

        System.out.println( "Returns : " + tt);

    }

}
