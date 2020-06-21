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
                String keyword = userInput.nextLine(); //Get the keyword, from the user

                Iterator<Deal> brandIterator = MainScreen.getDeals().iterator(); //Get an iterator, to go trough in deals

                while(brandIterator.hasNext()){ //while there is a next brand
                        Deal currentDeal = brandIterator.next(); // get the Deal and Car
                        Car currentCar = currentDeal.getCarForSale();


                        //Compare the actual car's brand, with the keyword, lowercase for exclude that cases
                        //when the user use higher, lower characters
                        if(currentCar.getBrand().toLowerCase().equals(keyword.toLowerCase())){
                                searchResult.add(currentDeal);
                        }
                }

        }

        private void searchByColor(){
                searchResult = new LinkedList<>();
                MainScreen.clearScreen();
                System.out.println("Enter the color, what you search:");
                String keyword = userInput.nextLine(); //Get the keyword, from the user

                Iterator<Deal> colorIterator = MainScreen.getDeals().iterator(); //Get an iterator, to go trough in deals

                while(colorIterator.hasNext()){ //while there is a next color
                        Deal currentDeal = colorIterator.next(); // get the Deal and Car
                        Car currentCar = currentDeal.getCarForSale();

                        if(currentCar.getColor().toLowerCase().equals(keyword.toLowerCase())){  //Compare the actual car's color, with the keyword
                                searchResult.add(currentDeal);
                        }
                }
        }

        private void searchByManYear(){

                searchResult = new LinkedList<>();
                MainScreen.clearScreen();
                System.out.println("Enter the year from which we will search for cars: ");

                //Now the input will be a number, so we need to check the value of it

                boolean isNum = false;
                Integer keyYear = 1;        //I did this, cuz the input must be a positive number
                while(!isNum && keyYear>0) {
                       try {
                        keyYear = userInput.nextInt(); //If the user input is not a number, then it makes error
                        isNum = true;                  //If the input is correct, it makes the condition true

                       }catch (InputMismatchException iEx) {
                       System.out.println("The year can only be a number.");
                       }
                }

                Iterator<Deal> yearIterator = MainScreen.getDeals().iterator();

                while(yearIterator.hasNext()) //loop through the deals
                {
                        Deal currentDeal = yearIterator.next();
                        Car currentCar = currentDeal.getCarForSale();

                        if(currentCar.getYearOfMan() >= keyYear) {
                                searchResult.add(currentDeal); //if the car's year >= than the keyword, i save
                        }                                      //that into the searchResult


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

                Iterator<Deal> travIterator = MainScreen.getDeals().iterator();

                while(travIterator.hasNext()){
                        Deal currentDeal = travIterator.next();
                        Car currentCar = currentDeal.getCarForSale();

                        if(currentCar.getKmeterTrav() <= keyNum){
                                searchResult.add(currentDeal);
                        }
                }
        }
        }






