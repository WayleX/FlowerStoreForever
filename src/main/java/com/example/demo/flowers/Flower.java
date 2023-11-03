package com.example.demo.flowers;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Flower {
    @Id
    private int id;
    private double price;
    private double sepalLength;
    private FlowerColor color;
    private FlowerType flowerType;
    /*    
    public Flower() {
        this.sepalLength = 0;
        this.color = color.BLUE;
        this.price = 0;
        this.flowerType = FlowerType.CHAMOMILE;    
    }
    */
    public Flower(double sepallength, FlowerColor color, double price,
     FlowerType type) {
        this.sepalLength = sepallength;
        this.color = color;
        this.price = price;
        this.flowerType = type;    
    }
    
    public Flower(Flower flower) {
        this.sepalLength = flower.sepalLength;
        this.color = flower.color;
        this.price = flower.price;
        this.flowerType = flower.flowerType;
    }
    /*
    public String getColor() {
        return color.toString();
    }
    */
}
