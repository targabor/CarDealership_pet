package com.rofa.cardealership;

public class Main {

    public static void main(String[] args){

        if(DataBase.openDBConnection()){ //test the connection
            DataBase.closeDBConnection();
            MainScreen.openScreen();
        }else{
            System.out.println("Failed to create the connection to the server!");
        }
    }
}
