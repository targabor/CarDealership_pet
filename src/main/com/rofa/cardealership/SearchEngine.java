package com.rofa.cardealership;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class SearchEngine {


        private LinkedList<Deal> searchResult;
        private Scanner userInput = new Scanner(System.in);


        public void searchOption(String userInput) {
                switch (userInput) {
                        case "B": {
                                searchByBrand();
                                if (searchResult != null) {
                                        System.out.println("Search Results:");
                                        writeTheResultOut();
                                } else {
                                        System.out.println("There is no result, try again!");
                                }
                                searchResult = null;
                                break;
                        }
                        case "C":{
                                searchByColor();
                                if(searchResult != null){
                                        System.out.println("Search Results:");
                                        writeTheResultOut();
                                }else {
                                        System.out.println("Tehre is no result, try again!");
                                }
                                searchResult = null;
                                break;
                                }
                        


                        default: {
                                System.out.println("Bad input character, try again!");
                                DealActions.searchDeal();
                        }


                }
        }

        public void writeTheResultOut(){

                for(Deal thisDeal: searchResult){
                        System.out.println(thisDeal.toString());
                }


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

                        if(currentCar.getColor().equals(keyword)){  //Compare the actual car's color, with the keyword
                                searchResult.add(currentDeal);
                        }
                }
        }

        private void searchByManYear(){

        }





}
