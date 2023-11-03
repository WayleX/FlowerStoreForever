package com.example.demo.flowers.deliverstrategy;
//import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.example.demo.flowers.Item;

@RestController
@RequestMapping("/api/flower/deliver/")
public class PostDeliveryStrategy implements BasicDeliver {
    @GetMapping("/post/")
    public String deliver() {
        return "Post delivery";
    }
}
