package com.company;

public class Star implements HeavenlyBody {
    private String name;

    Star(String name){
        this.name = name;
    }

    @Override
    public String getHeavenlyBodyName() {
        return name;
    }
}
