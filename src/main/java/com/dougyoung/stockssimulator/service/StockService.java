package com.dougyoung.stockssimulator.service;

import com.dougyoung.stockssimulator.model.Stock;

import java.util.HashMap;

public interface StockService {
    Stock getStock(String acronym);
    HashMap<String, Stock> getAll();
}
