package com.rofa.cardealership;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DbStatements {

    private final Statement stmt = null;
    private static PreparedStatement psmt = null;
    private static ResultSet rs = null;


    private static void addCarToDB(Car newCar,Connection dbConn) {

        String sql = "insert into cars values (?,?,?,?,?,?);";
        try {
            psmt = dbConn.prepareStatement(sql);
            int carIndex = GetDataBaseData.getTableLength(DataBase.getConnection(), "cars") + 1;
            newCar.setID(carIndex);
            psmt.setInt(1, carIndex);
            psmt.setString(2, newCar.getBrand());
            psmt.setString(3, newCar.getModel());
            psmt.setInt(4, newCar.getYearOfMan());
            psmt.setString(5, newCar.getColor());
            psmt.setInt(6, newCar.getKmeterTrav());
            psmt.execute();
        } catch (SQLException sqlEX) {
            System.out.println(sqlEX.getMessage());

        } finally {
            try {
                psmt.close();
            } catch (SQLException sqlEx) {
                System.out.println("Error at closing the statement\n" + sqlEx);
            }

        }
    }

    private static void addSellerToDB(Seller newSeller,Connection dbConn){

        String sql = "insert into seller values (?,?,?,?);";
        try {
            psmt = dbConn.prepareStatement(sql);
            int sellerIndex = GetDataBaseData.getTableLength(DataBase.getConnection(),"seller")+1; //I add +1 to the value
            psmt.setInt(1,sellerIndex);                                                   //cuz it cant be 0
            psmt.setString(2,newSeller.getSellerName());
            psmt.setString(3,newSeller.getSellerPhoneNumber());
            psmt.setString(4,newSeller.getSellerEmail());
            psmt.execute();

        }catch (SQLException sqlEx){
            System.out.println("There is an error, at the addSellerToDB method\n"+sqlEx);
        }finally {
            try {
                psmt.close();
            } catch (SQLException sqlEx) {
                System.out.println("Error at closing the statement\n" + sqlEx);
            }

        }
    }

    public static void addDealToDB(Deal newDeal){



    }

    public static boolean isSellerExists(String email, String password){

        String sql = "select count(*) from seller where emailAddress = ? and password = ?;";
        try{
                DataBase.openDBConnection();
                psmt = DataBase.getConnection().prepareStatement(sql);
                psmt.setString(1,email);
                psmt.setString(2,password);

                rs = psmt.executeQuery();
                rs.next();
            return rs.getInt(1) == 1;

        }catch (SQLException sqlEx){
            System.out.println("There is an error, at the isSellerExists method!\n" + sqlEx);
        }

        return false;
    }



}
