package com.example;

import java.util.List;

public class Lion {

    private final boolean hasMane;
    private final Felinable feline;

    public Lion(String sex, Felinable feline) throws Exception {
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самец или самка");
        }
        this.feline = feline;
    }


    public int getKittens() {
        return feline.getKittens();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public java.util.List<String> getFood() throws Exception {
        return feline.getFood("Хищник");
    }
}
