package com.example.demo.flowers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.example.demo.flowers.Flower;
//import com.example.demo.flowers.FlowerColor;
//import com.example.demo.flowers.FlowerType;
//import com.example.demo.flowers.deliverstrategy.DHLDeliveryStrategy;

@RestController
@RequestMapping("api/flower/")
public class FlowerController {
    private final int sep = 10;
    private final double price = 10;
    private FlowerService flowerService;

    @Autowired
    public FlowerController(FlowerService flowerService){
        this.flowerService = flowerService;
    }

    @GetMapping("/list/")
    public List<Flower> getFlowers() {
        return flowerService.getFlowers();
    }

    @GetMapping("/payment/")
    public String payment() {
        return "Choose method";
    }

    @GetMapping("/payment/success/")
    public String paysuccess() {
        return "Order confirmed";
    }

    @GetMapping("/payment/failed/")
    public String payfailed() {
        return "Order declined";
    }

    @GetMapping("/deliver/")
    public String deliver() {
        return "Choose method of delivery";
    }

    @GetMapping("/deliver/success/")
    public String deliversuccess() {
        return "Deliver confirmed";
    }

    @GetMapping("/deliver/failed/")
    public String deliverfailed() {
        return "Deliver declined";
    }
}
