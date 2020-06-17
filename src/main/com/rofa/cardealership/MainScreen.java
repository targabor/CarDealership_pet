package com.rofa.cardealership;

import java.util.Scanner;

public class MainScreen {

    private final static Scanner userInput = new Scanner(System.in);

    public static void startPosition(){

        System.out.println("\t\t\tCar DealerShip");
        System.out.println("\nChoose what you want to do!");
        System.out.println("\nU - Upload a new car");
        System.out.println("S - Search for a car");
        MainScreen.userChoose(userInput.next());
    }

    public static void userChoose(String uChoose){
        clearScreen();
        switch (uChoose){
            case "U":{

            }
        }

    }

    public static void clearScreen(){
        System. out. print("\033[H\033[2J");
        System. out. flush();
    }
}
