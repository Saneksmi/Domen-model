package com.company;

public abstract class Ship extends Vehicle implements Sailable {

    public Ship(String engine, String model, int weight, int speed) {
        super(engine, model, weight, speed);
    }

    public abstract void sail ();

    public class Boat extends Ship {

        public Boat(String engine, String model, int weight, int speed) {
            super(engine, model, weight, speed);
        }

        @Override
        public void sail() {
            System.out.println("Лодка плывёт");
        }
    }

    private class Barge extends Ship {

        public Barge(String engine, String model, int weight, int speed) {
            super(engine, model, weight, speed);
        }

        @Override
        public void sail() {
            System.out.println("Баржа плывёт");
        }
    }

    public static class WaterBike extends Ship {

        public WaterBike(String engine, String model, int weight, int speed) {
            super(engine, model, weight, speed);
        }

        @Override
        public void sail() {
            System.out.println("Водный мотоцикл плывёт");
        }
    }
}
