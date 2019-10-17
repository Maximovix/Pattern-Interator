package com.company;

public class SolarSystem {
    private Planet planet;
    private Star star;
    private Comet comet;
    private int countHeavenBody;

    SolarSystem(Comet comet,Planet planet,Star star){
        this.comet = comet;
        this.planet = planet;
        this.star = star;
        countHeavenBody = 3;
    }

    SolarSystem(Planet planet,Star star){
        this.planet = planet;
        this.star = star;
        countHeavenBody = 2;
    }

    SolarSystem(Planet planet,Comet comet){
        this.planet = planet;
        this.comet = comet;
        countHeavenBody = 2;
    }

    SolarSystem(Star star,Comet comet){
        this.star = star;
        this.comet = comet;
        countHeavenBody = 2;
    }

    SolarSystem(Planet planet){
        this.planet = planet;
        countHeavenBody = 1;
    }

    SolarSystem(Star star){
        this.star = star;
        countHeavenBody = 1;
    }

    SolarSystem(Comet comet){
        this.comet = comet;
        countHeavenBody = 1;
    }

    public Planet getPlanet(){
        return planet;
    }

    public Star getStar(){
        return star;
    }

    public Comet getComet(){
        return comet;
    }

    public int getCountHeavenBody(){
        return countHeavenBody;
    }

    public void setComet(Comet comet){
        this.comet = comet;
    }

    public void setPlanet(Planet planet){
        this.planet = planet;
    }

    public void setStar(Star star){
        this.star = star;
    }

    public boolean hasPlanet(){
        return this.planet != null;
    }

    public boolean hasStar(){
        return this.star != null;
    }

    public boolean hasComet(){
        return this.comet != null;
    }
}
