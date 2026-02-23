
package com.nigromante.test;
import com.nigromante.lib.Prueba;


public class Test1 {

    public static void start(String[] args) {

        System.out.println("-----------------------------------------------------------------------");
        System.out.println("Test1 : Class instance and dereferences variable object");
        
        Prueba a = new Prueba();
        int tt = a.tt();
        a = null;

        System.out.println( "Returns : " + tt);

    }

}
