package com.rofa.cardealership;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.List;

public class SearchEngine {


        private final Scanner userInput = new Scanner(System.in);

        private DataBase db = null;
        private Connection dbConn = null;
        private PreparedStatement psmt = null;
        private ResultSet rs = null;


        public void searchOption(String userInput) {
                String userInputL = userInput.toUpperCase(); //Converted into upper case, to avoid problems
                //with upper-lower cases
                switch (userInputL) {
                        case "B" -> {
                        }
                       /* case "C" -> {
                                searchByColor();
                        }
                        case "Y" -> {
                                searchByManYear();
                        }
                        case "K" -> {
                                searchByTravK();
                        }
                        case "N" -> {
                                searchBySellerN();
                        }*/
                        default -> {
                                System.out.println("Bad input character, try again!");
                                DealActions.searchDeal();
                        }
                }
        }


}






