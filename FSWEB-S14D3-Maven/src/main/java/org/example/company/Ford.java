package org.example.company;

public class Ford extends Car{
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String brake() {
        return super.brake();
    }

    @Override
    public String accelerate() {
        return super.accelerate();
    }

    @Override
    public String startEngine() {
        return super.startEngine();
    }
}
