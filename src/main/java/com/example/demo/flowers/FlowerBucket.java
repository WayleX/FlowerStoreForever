package com.example.demo.flowers;


import java.util.ArrayList;

import java.util.List;

public class FlowerBucket {
    private List<FlowerPack> bucket = new ArrayList<FlowerPack>();
    public FlowerBucket(ArrayList<FlowerPack> bucket) {
        this.bucket = bucket;
    }
    public FlowerBucket() {
    }
    public double getPrice() {
        double price = 0;
        for (FlowerPack pack:this.bucket) {
            price += pack.getPrice();

        }
        return price;
    }
    public void add(FlowerPack pack) {
        this.bucket.add(pack);
    }
}
