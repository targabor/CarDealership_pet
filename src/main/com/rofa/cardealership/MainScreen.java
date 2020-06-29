package com.rofa.cardealership;

import java.util.LinkedList;
import java.util.Scanner;

public class MainScreen {

    private final static Scanner userInput = new Scanner(System.in);
    private static  LinkedList<Deal> deals = new LinkedList<>();

    public static void startPosition() {
        clearScreen();
        System.out.println("\t\t\tCar DealerShip");
        System.out.println("\nChoose what you want to do!");
        System.out.println("\nU - Upload a new car");
        System.out.println("S - Search for a car");
        MainScreen.userChoose(userInput.next());
    }

    public static void userChoose(String uChoose) {
        clearScreen();
        switch (uChoose.toUpperCase()) {
            case "U": {
                Deal newDeal = DealActions.newDeal();
                deals.add(newDeal);

                startPosition();
                break;
            }
            case "S":{

                DealActions.searchDeal();
                startPosition();
                break;
            }
            default: {
                System.out.println("You entered wrong character, try again!");
                startPosition();
                break;
            }
        }

    }

    public static void clearScreen(){
        System. out. print("\033[H\033[2J");
        System. out. flush();
    }

    public static LinkedList<Deal> getDeals(){return deals;}


}
