package com.company;

public class Main {

    public static void main(String[] args) {
        Planet planet = new Planet("Earth");
        Star star = new Star("Sun");
        Comet comet = new Comet("Halley");

        SolarSystem solarSystem = new SolarSystem(comet,planet,star);

        HeavenlyBodyIterator iterator = new HeavenlyBodyIterator(solarSystem);

        iterator.next();
        System.out.println(iterator.hasNext());
        iterator.next();
        System.out.println(iterator.hasNext());
        iterator.remove();
        System.out.println(iterator.hasNext());
        iterator.next();


    }
}
