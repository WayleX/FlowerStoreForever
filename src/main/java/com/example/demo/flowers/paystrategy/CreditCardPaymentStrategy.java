package com.example.demo.flowers.paystrategy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/flower/payment/")
public class CreditCardPaymentStrategy implements BasicPay {
    @GetMapping("/creditcard/")
    //public String pay(double price){
    public String pay() {
        return "Credit card";
    }
}
