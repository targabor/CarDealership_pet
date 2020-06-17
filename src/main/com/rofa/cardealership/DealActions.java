package com.rofa.cardealership;

import java.util.Scanner;

public class DealActions {

    private final static Scanner userInput = new Scanner(System.in);


    public static Deal newDeal() {

        //Get the information about the car and seller
        Car carForSale = new Car();
        Deal newDeal = new Deal();

        System.out.println("\t\tCar Upload Form");
        //Brand of the car
        System.out.print("\nCar's brand: ");
        carForSale.setBrand(userInput.nextLine());
        //Model of the car
        System.out.print("\nCar's model: ");
        carForSale.setModel(userInput.nextLine());
        //Year of manufacture, loop until the year is correct
        boolean isNum = false;
        while (!isNum) {
            try {
                System.out.print("\nYear of manufacture: ");
                carForSale.setYearOfMan(Integer.parseInt(userInput.nextLine()));
                isNum = true;
            } catch (NumberFormatException nEx) { //If the user's input isn't a number
                System.out.println("\nCsak számot adhat meg!");
            }
        }
        //Color of the car
        System.out.print("\nCar's color: ");
        carForSale.setColor(userInput.nextLine());
        //Kilometers traveled, loop until the number is correct
        isNum = false;
        while (!isNum) {
            try {
                System.out.print("\nKilometers traveled: ");
                carForSale.setKmeterTrav(Integer.parseInt(userInput.nextLine()));
                isNum = true;
            } catch (NumberFormatException nEx) {
                System.out.println("\nCsak számot adhat meg!");
            }
        }
        //Get the sellers data
        newDeal.setCarForSale(carForSale);
        System.out.println("\nSeller's data:");
        System.out.print("\nName: ");
        newDeal.setSellerName(userInput.nextLine());
        //Sellers phone
        System.out.print("\nPhone number: ");
        newDeal.setSellersPhone(userInput.nextLine());
        //Sellers email address
        System.out.print("\nE-mail address: ");
        newDeal.setSellersEmail(userInput.nextLine());

        System.out.print("\nThe new deal was added to the server!\n\n\n ");

        return newDeal;
    }
}