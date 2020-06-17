package com.rofa.cardealership;

public class Car {


    private String model;
    private int yearOfMan;
    private String color;
    private int speedometer;

    public Car(String cBrand, String cModel, int cYOM, String cColor, int cSM){
        this.brand = cBrand;
        this.model = cModel;
        this.yearOfMan = cYOM;
        this.color = cColor;
        this.speedometer = cSM;
    }


    private String brand;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfMan() {
        return yearOfMan;
    }

    public void setYearOfMan(int yearOfMan) {
        this.yearOfMan = yearOfMan;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeedometer() {
        return speedometer;
    }

    public void setSpeedometer(int speedometer) {
        this.speedometer = speedometer;
    }


}
