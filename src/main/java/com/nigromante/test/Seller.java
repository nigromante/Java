
package com.nigromante.test;
import com.nigromante.seller.application.*;


public class Seller {

    public static void start(String[] args) {

        System.out.println("-----------------------------------------------------------------------");
        System.out.println("Seller : ");
        

        Prueba a = new Prueba();
        int tt = a.tt();
        a = null;

        System.out.println( "Returns : " + tt);

    }

}
