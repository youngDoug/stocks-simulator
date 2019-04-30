package com.dougyoung.stockssimulator.service;

import com.dougyoung.stockssimulator.model.Stock;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class StockServiceImpl implements StockService{
    private HashMap<String, Stock> stocks;

    public StockServiceImpl() {
        // initialize
        stocks = new HashMap<>();

        Stock dummyStock = new Stock();
        dummyStock.setAcronym("AMD");
        dummyStock.setFullName ("Advanced Micro Devices Inc.");
        dummyStock.setVolume(123456789);
        dummyStock.setPreviousClose(50);
        dummyStock.setOpen(50);
        dummyStock.setDayRangeLow(25);
        dummyStock.setDayRangeHigh(28);
        dummyStock.setYearRangeLow(30);
        dummyStock.setYearRangeHigh(40);
        dummyStock.setPriceEarningsRatio(86.5f);
        dummyStock.setBeta(2.05f);
        dummyStock.setMarketCap(987654321);
        dummyStock.setEPS(0.23f);
        stocks.put(dummyStock.getAcronym(), dummyStock);

        dummyStock = new Stock();
        dummyStock.setAcronym("NIL");
        dummyStock.setFullName ("Not in Library");
        dummyStock.setVolume(0);
        dummyStock.setPreviousClose(0);
        dummyStock.setOpen(0);
        dummyStock.setDayRangeLow(0);
        dummyStock.setDayRangeHigh(0);
        dummyStock.setYearRangeLow(0);
        dummyStock.setYearRangeHigh(0);
        dummyStock.setPriceEarningsRatio(0);
        dummyStock.setBeta(0);
        dummyStock.setMarketCap(0);
        dummyStock.setEPS(0);
        stocks.put(dummyStock.getAcronym(), dummyStock);

        dummyStock = new Stock();
        dummyStock.setAcronym("FTP");
        dummyStock.setFullName ("Foster the Planet Inc.");
        dummyStock.setVolume(123456789);
        dummyStock.setPreviousClose(50);
        dummyStock.setOpen(50);
        dummyStock.setDayRangeLow(25);
        dummyStock.setDayRangeHigh(28);
        dummyStock.setYearRangeLow(30);
        dummyStock.setYearRangeHigh(40);
        dummyStock.setPriceEarningsRatio(86.5f);
        dummyStock.setBeta(2.05f);
        dummyStock.setMarketCap(987654321);
        dummyStock.setEPS(0.23f);
        stocks.put(dummyStock.getAcronym(), dummyStock);

        dummyStock = new Stock();
        dummyStock.setAcronym("RMN");
        dummyStock.setFullName ("Recreational McNukes Inc.");
        dummyStock.setVolume(123456789);
        dummyStock.setPreviousClose(50);
        dummyStock.setOpen(50);
        dummyStock.setDayRangeLow(25);
        dummyStock.setDayRangeHigh(28);
        dummyStock.setYearRangeLow(30);
        dummyStock.setYearRangeHigh(40);
        dummyStock.setPriceEarningsRatio(86.5f);
        dummyStock.setBeta(2.05f);
        dummyStock.setMarketCap(987654321);
        dummyStock.setEPS(0.23f);
        stocks.put(dummyStock.getAcronym(), dummyStock);
    }

    public Stock getStock(String acronym) {
        if (stocks.containsKey(acronym)) {
            return stocks.get(acronym);
        }
        else return null;
    }

    public HashMap<String, Stock> getAll() {
        return stocks;
    }
}
