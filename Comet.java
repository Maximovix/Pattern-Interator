package com.company;

public class Comet implements HeavenlyBody{
    private String name;

    Comet(String name){
        this.name = name;
    }

    @Override
    public String getHeavenlyBodyName() {
        return name;
    }
}
