package com.rofa.cardealership;

import java.util.LinkedList;
import java.util.Scanner;

public class DealActions {

    private final static Scanner userInput = new Scanner(System.in);


    public static Deal newDeal() {

        //Get the information about the car and seller
        Seller carSeller = new Seller();
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
                System.out.println("\nYou can only give numbers, as traveled kilometers!");
            }
        }
        //Get the sellers data
        newDeal.setCarForSale(carForSale);
        System.out.println("\nSeller's data:");
        System.out.print("\nName: ");
        carSeller.setName(userInput.nextLine());
        //Sellers Phone number
        //it is only number, but it can starts with 0, so I can't store it in a int :(
        //but in the setter, i check that, the text contains only digits
        //if not, it can drop NumberFormatException
        isNum = false;
        while(!isNum)
        try {
            System.out.print("\nPhone number: ");
            carSeller.setPhoneNumber(userInput.nextLine());
            isNum = true;
        }catch (NumberFormatException nEx){
            System.out.println("\nYou can only give numbers as phone number!");
        }
        //Sellers email address
        System.out.print("\nE-mail address: ");
        carSeller.setEmailAddress(userInput.nextLine());
        newDeal.setCarSeller(carSeller);

        System.out.print("\nThe new deal was added to the server!\n\n\n ");

        return newDeal;
    }

    public static void searchDeal(){
        LinkedList<Deal> resultDeals = null;
        MainScreen.clearScreen();
        System.out.println("What do you looking for?");
        System.out.println("-----Car-----");
        System.out.println("\tB - Brand");
        System.out.println("\tC - Color");
        System.out.println("\tK - Traveled kilometer is less than");
        System.out.println("-----Seller-----");
        System.out.println("\tN - Name");
        System.out.println("\tE - E-mail address");

        SearchEngine userSearchEngine = new SearchEngine();
        userSearchEngine.searchOption(userInput.nextLine());

    }
}