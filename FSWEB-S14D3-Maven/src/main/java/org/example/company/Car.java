package org.example.company;

import java.util.Objects;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", cylinders=" + cylinders +
                ", name='" + name + '\'' +
                ", wheels=" + wheels +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return cylinders == car.cylinders && Objects.equals(name, car.name);
    }
    public String startEngine(){
        String className = getClass().getSimpleName();
        System.out.println("Class: " + className);
        return "the car's engine is starting";
    }
    public String accelerate(){
        String className = getClass().getSimpleName();
        System.out.println("Class: " + className);
        return "the car is accelerating";
    }
    public String brake(){
        String className = getClass().getSimpleName();
        System.out.println("Class: " + className);
        return "the car is braking";
    }

}
