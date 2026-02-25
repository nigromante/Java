
package com.nigromante.seller.domain.entities;
import com.nigromante.seller.domain.objects.*;
import java.io.IOException;

public final class Order {

  private Code orderId;
  private Code customerId;

  public Order( String orderId, String customerId ){
      try {
        this.orderId = new Code(orderId);
        this.customerId = new Code(customerId);
      } catch( IOException ex ){
        System.out.println( "Order : "  + ex.getMessage());
        // ex.printStackTrace();
      }
  }

}
