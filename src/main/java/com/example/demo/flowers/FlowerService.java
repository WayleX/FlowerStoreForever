package com.example.demo.flowers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.annotation.JsonProperty;

@Service
public class FlowerService {
    private final int sep = 10;
    private final double price = 10;
    public FlowerRepository flowerRepository;

    @Autowired
    public FlowerService(FlowerRepository flowerRepository){
        this.flowerRepository = flowerRepository;
    }
    public List<Flower> getFlowers() {
        return flowerRepository.findAll();
    }
    //@JsonProperty(access = JsonProperty.Access.READ_ONLY)
    public void add(Flower flower){
        flowerRepository.save(flower);
    }
}
