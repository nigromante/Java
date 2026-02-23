
package com.nigromante.test;
import com.nigromante.lib.Prueba;


public class Test1 {

    public static void start(String[] args) {

        System.out.println(".....................................");
        System.out.println("Test 1 : Clase Prueba");
        
        Prueba a = new Prueba();
        int tt = a.tt();

        System.out.println( "Returns : " + tt);

    }

}
