package com.company;

/*
* 1. Родительский супер-класс "средство передвижения"
* 2. 3 интерфейса "летающий", "ездящий", "плавающий"
* 3. 3 абстрактных класса "судно", "автомобиль", "воздушное судно"
* 4. дочерние классы наследуют родительский, реализуют интерфейсы движения, но не реализуют методы движения,
* потому и абстрактные
* 5. в каждом абстрактном классе 1 внутренний и 2 вложенных класса
* */

public class Vehicle {
    String engine;
    String model;
    int weight;
    int speed;

    public Vehicle(String engine, String model, int weight, int speed) {
        this.engine = engine;
        this.model = model;
        this.weight = weight;
        this.speed = speed;
    }

    public static void main(String[] args) {

        Ship.WaterBike wBike = new Ship.WaterBike("small engine", "wB1", 250, 60);
	    wBike.sail();

	    Car.MotorBike mBike = new Car.MotorBike("small engine", "mB1", 300, 120);
	    mBike.ride();

	    AirShip.Jet jet = new AirShip.Jet("turbo engine", "jet1", 60000, 2150);
	    jet.fly();
    }
}
