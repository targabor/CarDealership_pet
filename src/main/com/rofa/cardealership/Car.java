package com.rofa.cardealership;

import java.util.Scanner;

public class Car {


    private int ID;
    private String model;
    private int yearOfMan;
    private String color;
    private int kmeterTrav;
    private static final Scanner userInput = new Scanner(System.in);

    public Car(){ }

    public Car(String cBrand, String cModel, int cYOM, String cColor, int cSM){
        this.brand = cBrand;
        this.model = cModel;
        this.yearOfMan = cYOM;
        this.color = cColor;
        this.kmeterTrav = cSM;
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

    public void setYearOfMan(int yearOfMan) throws NumberFormatException {
        this.yearOfMan = yearOfMan;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getKmeterTrav() {
        return kmeterTrav;
    }

    public void setKmeterTrav(int kmeterTrav) throws NumberFormatException {
        this.kmeterTrav = kmeterTrav;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public static Car newCar(){
        Car newCar = new Car();

        System.out.println("\t\tCar Upload Form");
        System.out.print("\nCar's brand: ");
        newCar.setBrand(userInput.nextLine());
        System.out.print("\nCar's model: ");
        newCar.setModel(userInput.nextLine());
        boolean isNum = false;
        while (!isNum) {
            try {
                System.out.print("\nYear of manufacture: ");
                newCar.setYearOfMan(Integer.parseInt(userInput.nextLine()));
                isNum = true;
            } catch (NumberFormatException nEx) { //If the user's input isn't a number
                System.out.println("\nCsak számot adhat meg!");
            }
        }
        System.out.print("\nCar's color: ");
        newCar.setColor(userInput.nextLine());
        isNum = false;
        while (!isNum) {
            try {
                System.out.print("\nKilometers traveled: ");
                newCar.setKmeterTrav(Integer.parseInt(userInput.nextLine()));
                isNum = true;
            } catch (NumberFormatException nEx) {
                System.out.println("\nYou can only give numbers, as traveled kilometers!");
            }
        }

        return newCar;
    }

}
