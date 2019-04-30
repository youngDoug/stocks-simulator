package com.dougyoung.stockssimulator.controller;

import com.dougyoung.stockssimulator.model.Order;
import com.dougyoung.stockssimulator.model.Side;
import com.dougyoung.stockssimulator.model.Stock;
import com.dougyoung.stockssimulator.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {
    // TODO: make the controller do literally anything cooler than this.

    @Autowired
    StockService stockService;

    @GetMapping("{acronym}")
    public Order order(@RequestParam(value="acronym") String name) {
        Stock dummyStock = stockService.getStock("AMD");
        return new Order(dummyStock, Side.BUY, 41.0);
    }
}
