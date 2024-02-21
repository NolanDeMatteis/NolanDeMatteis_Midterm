package com.nolan.midterm;

/**
 * Inheritance Lab - Midterm Exam
 * Spring 2024 ITEC 2150
 *
 */
public class CarDisplay {

    public static void main(String[] args) {
        Car car = new Car("Father", "Large", "ABC123");
        System.out.println(car);

        Truck truck = new Truck("Company", "Extra Large", "TRK999",5000);
        System.out.println(truck);

        Sedan sedan = new Sedan("Mother", "Medium", "TRK991", 4, 2000);
        System.out.println(sedan);

        SportsCar sportsCar = new SportsCar("I", "Small", "TRK992", 2, 3000, "Red");
        System.out.println(sportsCar);
    }
}


class Car {

    // new attribute
    private String licensePlate;
    private String name; //owner name e.g. mother, father, son, daughter
    private String size;

    public Car(String name, String size, String licensePlate) {
        this.name = name;
        this.size = size;
        this.licensePlate = licensePlate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "My " + name + " has/have a most luxurious car in my family. The license plate number is " + getLicensePlate();
    }

    // license getters and setters

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }
}


class SportsCar extends Sedan{

    private String color;


    public SportsCar(String name, String size, String licensePlate, int doors, int engineCapacity, String color) {
        super(name, size, licensePlate, doors, engineCapacity);
        this.color = color;
    }

    @Override
    public String toString(){
        return super.getName() + " has/have a Sports Car with " + super.getDoors() + " doors and " + super.getEngineCapacity() + " engine capacity and " + color + " color";
    }
}

class Sedan extends Car{
    private int doors;
    private int engineCapacity;

    public Sedan(String name, String size, String licensePlate, int doors, int engineCapacity) {
        super(name, size, licensePlate);
        this.doors = doors;
        this.engineCapacity = engineCapacity;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    @Override
    public String toString(){
        return super.getName() + " has/have a Sedan with " + doors + " doors and " + engineCapacity + " engine capacity";
    }
}


class Truck extends Car{

    private int cargoCapacity; // in kilos

    public Truck(String name, String size, String licensePlate, int cargoCapacity) {
        super(name, size, licensePlate);
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public String toString() {
        return "This Truck belongs to " + getName() + " and it is " + getSize() + " and the cargo capacity is " + getCargoCapacity() + "kg and a license plate with the numbers " + getLicensePlate();
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }
}


