package com.rofa.cardealership;

import javax.xml.crypto.Data;
import java.util.LinkedList;
import java.util.Scanner;

public class DealActions {

    private final static Scanner userInput = new Scanner(System.in);


    public static void newDeal() {

        //Get the information about the car and seller
        Seller carSeller = Seller.newSeller();
        Car carForSale = Car.newCar();
        Deal newDeal = new Deal(carForSale,carSeller);

        DbStatements.addDealToDB(newDeal);
    }

    public static void searchDeal(){
        LinkedList<Deal> resultDeals = null;
        System.out.println("What do you looking for?");
        System.out.println("-----Car-----");
        System.out.println("\tB - Brand");
        System.out.println("\tC - Color");
        System.out.println("\tY - The car manufactured after (year)");
        System.out.println("\tK - Traveled kilometer is less than");
        System.out.println("-----Seller-----");
        System.out.println("\tN - Name");

        SearchEngine userSearchEngine = new SearchEngine();
        userSearchEngine.searchOption(userInput.nextLine());

    }
}