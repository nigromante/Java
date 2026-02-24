

package com.nigromante.seller.infrastructure.repositories;

import com.nigromante.seller.domain.repositories.OrderRepository; 
import com.nigromante.seller.domain.entities.Order;

public class OrderRepositoryMysql implements OrderRepository {

  public Order save(Order order){
    return order;
  }
 
}
