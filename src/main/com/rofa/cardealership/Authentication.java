package com.rofa.cardealership;

import java.util.Scanner;

public class Authentication {

    private static final Scanner userInput = new Scanner(System.in);

    public static Seller login(){

        System.out.print("\nE-Mail Address:");
        String userEmail = userInput.nextLine();
        System.out.print("\nPassword:");
        String userPassword = userInput.nextLine();

        if(DbStatements.isSellerExists(userEmail,userPassword)){
            return Seller.getSellerFromDB(userEmail,userPassword);
        }else{
            System.out.println("Wrong email and password!\nTry again, or register");
            MainScreen.openScreen();
            return null;
        }

    }


}
