package com.devsuperior.pedidos.entities;

public class Order {
    final private Integer code;
    final private Double basic;
    final private Double discount;

    public Order(Integer code, Double basic, Double discount) {
        this.code = code;
        this.basic = basic;
        this.discount = discount;
    }

    public Integer getCode() {
        return code;
    }

    public Double getBasic() {
        return basic;
    }

    public Double getDiscount() {
        return discount;
    }
}
