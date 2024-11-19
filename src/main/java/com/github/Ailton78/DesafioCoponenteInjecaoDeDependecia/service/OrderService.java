package com.github.Ailton78.DesafioCoponenteInjecaoDeDependecia.service;


import com.github.Ailton78.DesafioCoponenteInjecaoDeDependecia.entities.Order;

import org.springframework.stereotype.Service;

@Service
public class OrderService {

   private ShippingService shippingService;

    public OrderService(ShippingService shippingService) {
        this.shippingService = shippingService;
    }

    public double total(Order order){
               double frete = shippingService.shipping(order);
               return order.getBasic() - order.getDiscount() + frete;
    }
}
