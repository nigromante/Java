/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nigromante.seller.domain.useCases.FindOrderById;

import com.nigromante.seller.domain.repositories.OrderRepository;

/**
 *
 * @author julian
 */
public class FindOrderByIdUseCase {
    OrderRepository orderRepository;

    public FindOrderByIdUseCase(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }
    
}
