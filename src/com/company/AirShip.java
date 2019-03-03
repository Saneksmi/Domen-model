package com.company;

public abstract class AirShip extends Vehicle implements Flyable {

    public AirShip(String engine, String model, int weight, int speed) {
        super(engine, model, weight, speed);
    }

    public abstract void fly();

    public class Helicopter extends AirShip {

        public Helicopter(String engine, String model, int weight, int speed) {
            super(engine, model, weight, speed);
        }

        @Override
        public void fly() {
            System.out.println("Вертолёт летит");
        }
    }

    private class Airplane extends AirShip {

        public Airplane(String engine, String model, int weight, int speed) {
            super(engine, model, weight, speed);
        }

        @Override
        public void fly() {
            System.out.println("Самолёт летит");
        }
    }

    public static class Jet extends AirShip {

        public Jet(String engine, String model, int weight, int speed) {
            super(engine, model, weight, speed);
        }

        @Override
        public void fly() {
            System.out.println("Реактивный самолёт летит");
        }
    }
}
