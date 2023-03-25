package com.example.myfirstserver.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/taxes")
public class TaxesController {

    enum TaxType {
        VAT(0.23f),
        INCOME(0.12f),
        FLAT(0.19f);

        private float taxValue;

        TaxType(float taxValue) {
            this.taxValue = taxValue;
        }

        public float getTaxValue() {
            return taxValue;
        }
    }

    // /taxes/count?amount=700&taxType=VAT -> 700*0.23
    @GetMapping("/count")
    public float count (@RequestParam int amount, @RequestParam TaxType taxType) {
       return amount * taxType.getTaxValue();
    }

    // /taxes?taxType=VAT -> 0.23
    @GetMapping
    public float get(@RequestParam TaxType taxType) {
        return taxType.getTaxValue();
    }
}
