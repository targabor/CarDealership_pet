package com.rofa.cardealership;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DbStatements {

    private static DataBase db = null;
    private final Statement stmt = null;
    private static PreparedStatement psmt = null;
    private static ResultSet rs = null;


    private static void addCarToDB(Car newCar,Connection dbConn) {

        String sql = "insert into cars values (?,?,?,?,?,?);";
        try {
            psmt = dbConn.prepareStatement(sql);
            int carIndex = GetDataBaseData.getTableLength(db.getConnection(),"cars")+1;
            newCar.setID(carIndex);
            psmt.setInt(1,carIndex);
            psmt.setString(2,newCar.getBrand());
            psmt.setString(3,newCar.getModel());
            psmt.setInt(4,newCar.getYearOfMan());
            psmt.setString(5,newCar.getColor());
            psmt.setInt(6,newCar.getKmeterTrav());
            psmt.execute();
        }catch (SQLException sqlEX){
            System.out.println(sqlEX.getMessage());

        }

    }

    private static void addSellerToDB(Seller newSeller,Connection dbConn){

        String sql = "insert into seller values (?,?,?,?);";
        try {
            psmt = dbConn.prepareStatement(sql);
            int sellerIndex = GetDataBaseData.getTableLength(db.getConnection(),"seller")+1; //I add +1 to the value
            newSeller.setID(sellerIndex);
            psmt.setInt(1,sellerIndex);                                                   //cuz it cant be 0
            psmt.setString(2,newSeller.getName());
            psmt.setString(3,newSeller.getPhoneNumber());
            psmt.setString(4,newSeller.getEmailAddress());
            psmt.execute();

        }catch (SQLException sqlEx){
            System.out.println("There is an error, at the addSellerToDB method\n"+sqlEx);
        }
    }

    public static void addDealToDB(Deal newDeal){

        db = new DataBase();
        db.openDBConnection();

        if(!isSellerExists(newDeal.getCarSeller(),db.getConnection())) //if the seller isn't exists, then i have to add it to the database
        {                                                              //else i have to skip that step
            addSellerToDB(newDeal.getCarSeller(),db.getConnection());
        }

        addCarToDB(newDeal.getCarForSale(),db.getConnection()); //in any case i have to add the car to the database

        String sql = "insert into deals values (?,?,NOW());";
        try{

            psmt = db.getConnection().prepareStatement(sql);
            psmt.setInt(1,newDeal.getCarForSale().getID());
            psmt.setInt(2,newDeal.getCarSeller().getID());
            psmt.execute();

            db.closeDBConnection();
        }catch (SQLException sqlEx){
            System.out.println("There is an error, at the addDealToDB method\n" + sqlEx);
            db.closeDBConnection();
        }

    }

    private static boolean isSellerExists(Seller exSeller, Connection dbConn){
        //I created this method, because if the same person will upload more cars
        //the database wont create multiple ID for the same person
        //I store the sellers data in here,

        String sellerEmail = exSeller.getEmailAddress();

        String sql = "select count(*),sellerID from seller where emailAddress = ?;";
        try {
            psmt = dbConn.prepareStatement(sql);
            psmt.setString(1,sellerEmail);
            rs = psmt.executeQuery();
            rs.next();
            int sellerCount =  rs.getInt("count(*)");
            int sellerID = rs.getInt("sellerID");

            exSeller.setID(sellerID);

            if(sellerCount == 1){
                return true;
            } else {
                return false;
            }

        }catch (SQLException sqlEx){
            System.out.println("There is an error, at the seller exists method\n" + sqlEx);
            return false;
        }

    }

}
