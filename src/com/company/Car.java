package com.company;

public abstract class Car extends Vehicle implements Rideable {

    public Car(String engine, String model, int weight, int speed) {
        super(engine, model, weight, speed);
    }

    public abstract void ride();

    public class Truck extends Car {

        public Truck(String engine, String model, int weight, int speed) {
            super(engine, model, weight, speed);
        }

        @Override
        public void ride() {
            System.out.println("Грузовик едет");
        }
    }

    private class Cabriolet extends Car {

        public Cabriolet(String engine, String model, int weight, int speed) {
            super(engine, model, weight, speed);
        }

        @Override
        public void ride() {
            System.out.println("Кабриолет едет");
        }
    }

    public static class MotorBike extends Car {

        public MotorBike(String engine, String model, int weight, int speed) {
            super(engine, model, weight, speed);
        }

        @Override
        public void ride() {
            System.out.println("Мотоцикл едет");
        }
    }
}
