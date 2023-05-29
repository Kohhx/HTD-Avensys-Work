package com.demo.learnspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyController {

    private final CurrencyServiceConfiguration config;

    @Autowired
    public CurrencyController(CurrencyServiceConfiguration currencyServiceConfiguration) {
        this.config = currencyServiceConfiguration;
    }

    @RequestMapping("/config")
    public CurrencyServiceConfiguration retrieveConfig() {
        return config;
    }


}
