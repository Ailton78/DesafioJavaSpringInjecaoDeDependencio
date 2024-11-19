package com.github.Ailton78.DesafioCoponenteInjecaoDeDependecia.service;


import com.github.Ailton78.DesafioCoponenteInjecaoDeDependecia.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public Double shipping(Order order) {
        double frete = 0;
        if (order.getBasic() < 100.0) {
            frete = 20.00;
        } else if (order.getBasic() < 200.0) {
            frete = 12.00;
        }
        return frete;
    }
}
