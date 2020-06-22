package com.rofa.cardealership;

import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.List;

public class SearchEngine {


        private List<Deal> searchResult;
        private final Scanner userInput = new Scanner(System.in);


        public void searchOption(String userInput) {
                String userInputL = userInput.toUpperCase(); //Converted into upper case, to avoid problems
                switch (userInputL) {                        //with upper-lower cases
                        case "B": {
                                searchByBrand();
                                writeTheResultOut();
                                break;
                        }
                        case "C":{
                                searchByColor();
                                writeTheResultOut();
                                break;
                                }
                        case "Y":{
                                searchByManYear();
                                writeTheResultOut();
                                break;
                        }
                        case "K" : {
                                searchByTravK();
                                writeTheResultOut();
                                break;
                        }
                        case "N" : {
                                searchBySellerN();
                                writeTheResultOut();
                                break;
                        }
                        default: {
                                System.out.println("Bad input character, try again!");
                                DealActions.searchDeal();
                        }


                }
        }

        public void writeTheResultOut(){
                if (searchResult.size() != 0) { //if the results length is 0, then there is no result xd
                        System.out.println("Search Result:");
                        writeTheResultOut();
                } else {
                        System.out.println("There is no result, try again!");
                }
                searchResult = null;
        }


        private void searchByBrand(){

                searchResult = new LinkedList<>();
                MainScreen.clearScreen();
                System.out.println("Enter the brand, what you search:");
                String keyword = userInput.nextLine().toLowerCase(); //Get the keyword, from the user, converted into lowercase to avoid problems

                for(Deal currentDeal : MainScreen.getDeals()){
                        Car currentCar = currentDeal.getCarForSale();
                        String currentBrand = currentCar.getBrand().toLowerCase();

                        if(currentBrand.equals(keyword))
                                searchResult.add(currentDeal);
                }

        }

        private void searchByColor(){
                searchResult = new LinkedList<>();
                MainScreen.clearScreen();
                System.out.println("Enter the color, what you search:");
                String keyword = userInput.nextLine().toLowerCase(); //Get the keyword, from the user, it will be lowercase
                                                                     //to avoid the upper-lower case problem
                for(Deal currentDeal : MainScreen.getDeals()){

                        Car currentCar = currentDeal.getCarForSale();
                        String carColor = currentCar.getColor().toLowerCase();

                        if(carColor.equals(keyword))
                                searchResult.add(currentDeal);
                        }
        }

        private void searchByManYear(){

                searchResult = new LinkedList<>();
                MainScreen.clearScreen();
                System.out.println("Enter the year from which we will search for cars: ");

                //Now the input will be a number, so we need to check the value of it

                boolean isNum = false;
                int keyYear = 1;        //I did this, cuz the input must be a positive number
                while(!isNum && keyYear>0) {
                       try {
                        keyYear = userInput.nextInt(); //If the user input is not a number, then it makes error
                        isNum = true;                  //If the input is correct, it makes the condition true

                       }catch (InputMismatchException iEx) {
                       System.out.println("The year can only be a number.");
                       }
                }

                for(Deal currentDeal : MainScreen.getDeals()){
                        Car currentCar = currentDeal.getCarForSale();

                        if(currentCar.getYearOfMan() >= keyYear)
                                searchResult.add(currentDeal);
                }
        }

        private void searchByTravK(){
                searchResult = new LinkedList<>();
                MainScreen.clearScreen();
                System.out.println("What should be the maximum mileage?");

                boolean isNum = false;
                int keyNum = 1;
                while(!isNum && keyNum >= 0){ //Traveled kilometers can be 0 or more than that
                        try {
                                keyNum = userInput.nextInt();
                                isNum = true;
                        }catch (InputMismatchException iEx){
                                System.out.println("The input should be a number!");
                        }
                }

                for(Deal currentDeal : MainScreen.getDeals()){
                        Car currentCar = currentDeal.getCarForSale();
                        if(currentCar.getKmeterTrav() <= keyNum)
                                searchResult.add(currentDeal);
                }
        }

        private void searchBySellerN(){

                System.out.println("Enter the current owner's name:");
                String keyword = userInput.nextLine().toLowerCase();

                for(Deal currentDeal : MainScreen.getDeals()){
                        String sellerName = currentDeal.getCarSeller().getName();
                        if(sellerName.equals(keyword))
                                searchResult.add(currentDeal);
                }

        }


}






