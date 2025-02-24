package com.i;

public class Car implements Drivable, MusicSystem {

    public void drive() {
        System.out.println("Car is driving...");
    }

    public void PlayMusic() {
        System.out.println("Playing music in the car...");
    }
}
