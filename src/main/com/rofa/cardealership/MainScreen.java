package com.rofa.cardealership;

import java.util.Scanner;

public class MainScreen {

    private final static Scanner userInput = new Scanner(System.in);


    public static void chooseScreen(boolean isGuest) {

        if(isGuest){
            System.out.println("\nChoose what you want to do!");
            System.out.println("S - Search for a car");
            MainScreen.userChoose(userInput.next(),isGuest);
        }else{
            System.out.println("\nChoose what you want to do!");
            System.out.println("\nU - Upload a new car");
            System.out.println("S - Search for a car");
            MainScreen.userChoose(userInput.next(),isGuest);
        }

    }

    private static void userChoose(String uChoose, boolean isGuest) {
        switch (uChoose.toUpperCase()) {
            case "U" -> {
                if(isGuest){ //if the user is a guest, can not upload cars :((
                    System.out.println("You entered wrong character, try again!");
                    chooseScreen(isGuest);
                }
                DealActions.newDeal();
                chooseScreen(isGuest);
            }
            case "S" -> {

                DealActions.searchDeal();
                chooseScreen(isGuest);
            }
            default -> {
                System.out.println("You entered wrong character, try again!");
                chooseScreen(isGuest);
            }
        }

    }



    public static void openScreen(){

        System.out.println("\t\t\tCar DealerShip");
        System.out.println("0 - GUEST" );
        System.out.println("1 - LOGIN");
        System.out.println("2 - REGISTER");
        openChoose(userInput.nextLine());
    }

    private static void openChoose(String openChoose){
        switch (openChoose){

            case "0" -> {
                chooseScreen(true);
            }

            case "1" -> {

                Authentication.login();
                chooseScreen(false);
            }


        }

    }

}
