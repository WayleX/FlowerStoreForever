package com.example.demo.flowers.filters;

import com.example.demo.flowers.Item;

public interface Filter {
    boolean match(Item item);
}
