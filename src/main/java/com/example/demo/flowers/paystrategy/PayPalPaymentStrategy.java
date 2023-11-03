package com.example.demo.flowers.paystrategy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/flower/payment/")
public class PayPalPaymentStrategy implements BasicPay {
    @GetMapping("/paypal/")
    //public String pay(double price){
    public String pay() {
        return "PayPal";
    }    
}
