

package com.nigromante.seller.domain.repositories;

import com.nigromante.seller.domain.entities.Order;

public interface OrderRepository {

  Order save(Order order);
 
}
