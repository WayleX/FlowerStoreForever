package com.example.demo.flowers;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class FlowerService {
    private final int sep = 10;
    private final double price = 10;
    public List<Flower> getFlowers() {
        return List.of(new Flower(sep,
         FlowerColor.BLUE, price, FlowerType.CHAMOMILE));
    }
}
