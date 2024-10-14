package org.example.arge;

public class HybridCar extends CarSkeleton{
    private double avgKmPerLiter;
    private int batterySize;
    private int cylinders;

    public HybridCar(String name, String description, double avgKmPerLiter, int cylinders, int batterySize) {
        super(name, description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.cylinders = cylinders;
        this.batterySize = batterySize;
    }


    @Override
    public String drive() {
        return "run from Hybrid car";
    }

    @Override
    public String startEngine() {
        runEngine(this);
        return getName() + "car starting..."; }

    public double getAvgKmPerLiter() {
        return avgKmPerLiter;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public int getCylinders() {
        return cylinders;
    }
}
