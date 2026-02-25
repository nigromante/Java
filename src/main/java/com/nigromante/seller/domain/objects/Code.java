
package com.nigromante.seller.domain.objects;
import java.io.IOException;

public final class Code  {

  private String value;
  private String customerId;

  public Code( String value ) throws IOException {
    if( ! this.ensureValue( value) ) {
      throw new IOException("Code not valid");
    }
    this.value = value;
  }

  private boolean ensureValue( String value ) {
    if( value.length() < 4 )
      return false;

    return  true;
  }
} 
