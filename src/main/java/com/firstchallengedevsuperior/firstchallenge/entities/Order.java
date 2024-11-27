package com.firstchallengedevsuperior.firstchallenge.entities;

public class Order {
    public Integer code;
    public double basic;
    public double discount;

    public Order() {}

    public Order(Integer code, double basic, double discount) {
        this.code = code;
        this.basic = basic;

        if(discount == 0.00) {
            this.discount = 1.00;
        } else {
            this.discount = discount / 100;
        }
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getBasic() {
        return basic;
    }

    public void setBasic(double basic) {
        this.basic = basic;
    }
}
