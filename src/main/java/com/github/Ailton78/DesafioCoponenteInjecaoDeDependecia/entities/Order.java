package com.github.Ailton78.DesafioCoponenteInjecaoDeDependecia.entities;

import org.springframework.stereotype.Component;

@Component
public class Order {
    private Integer code;
    private Double basic;
    private Double discount;

    public  Order(){}

    public Order(Integer code, Double basic, Double discount) {
        this.code = code;
        this.basic = basic;
        this.discount = discount;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Double getBasic() {
        return basic;
    }

    public void setBasic(Double basic) {
        this.basic = basic;
    }

    public Double getDiscount() {
        return basic * ( discount / 100);
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }
}
