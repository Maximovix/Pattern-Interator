package com.company;

public class Planet implements HeavenlyBody {
    private String name;

     Planet(String name){
        this.name = name;
    }

    @Override
    public String getHeavenlyBodyName() {
        return name;
    }
}
