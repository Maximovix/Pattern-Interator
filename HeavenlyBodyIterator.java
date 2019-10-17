package com.company;

public class HeavenlyBodyIterator {
    private SolarSystem solarSystem;
    private int countHeavenlyBody;

    HeavenlyBodyIterator (SolarSystem solarSystem){
        this.solarSystem = solarSystem;
        this.countHeavenlyBody = solarSystem.getCountHeavenBody();
    }

    public boolean hasNext(){
        if(countHeavenlyBody == 3){
            return solarSystem.hasComet() || solarSystem.hasPlanet() || solarSystem.hasStar();
        }
        if(countHeavenlyBody == 2){
            return solarSystem.hasPlanet() || solarSystem.hasStar();
        }
        if(countHeavenlyBody == 1){
            return solarSystem.hasStar();
        }
        return false;
    }

    public void next() {
        if (countHeavenlyBody == 0) {
            System.out.println("The heavenly bodies are not found");
        }
        try {
            if (countHeavenlyBody == 3) {
                System.out.println(solarSystem.getComet().getHeavenlyBodyName());
            }
            if (countHeavenlyBody == 2) {
                System.out.println(solarSystem.getPlanet().getHeavenlyBodyName());
            }
            if (countHeavenlyBody == 1) {
                System.out.println(solarSystem.getStar().getHeavenlyBodyName());
            }
            countHeavenlyBody--;
        } catch (Exception e) {
            System.err.println("Error");
        }
    }

    public void remove(){
        if(countHeavenlyBody == 1){
            solarSystem.setStar(null);
            countHeavenlyBody--;
        }
        if(countHeavenlyBody == 2){
            solarSystem.setPlanet(null);
            countHeavenlyBody--;
        }
        if(countHeavenlyBody == 3){
            solarSystem.setComet(null);
            countHeavenlyBody--;
        }
    }
}
