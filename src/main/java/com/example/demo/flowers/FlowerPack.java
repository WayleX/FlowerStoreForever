package com.example.demo.flowers;

import lombok.Getter;
@Getter
public class FlowerPack {
    private Flower flower;
    private int quantity;
    public FlowerPack(Flower flower) {
        this.quantity = 1;
        this.flower = new Flower(flower);
    }
    public FlowerPack(Flower flower, int quantity) {
        this.quantity = quantity;
        this.flower = new Flower(flower);
    }    
    public void setQuantity(int num) {
        if (num > 0) {
            this.quantity = num;
        }
        else {
            this.quantity = 1;
        }
    }
    public double getPrice() {
        double price = 0;
        price += this.flower.getPrice() * getQuantity();
        return price;
    }

}
