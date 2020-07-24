package com.rofa.cardealership;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBase {

    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/cardealership";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";

    private static Connection dbConn = null;

    public  static boolean openDBConnection(){

        try {
            dbConn = DriverManager.getConnection(URL,USERNAME,PASSWORD);
            return true;
        } catch (SQLException sqlEx) {
            System.out.println(sqlEx);
            return false;
        }

    }

    public static boolean closeDBConnection(){
        try{
            dbConn.close();
            return true;
        }catch (SQLException sqlEx){
            System.out.println(sqlEx);
            return false;
        }
    }

    public static Connection getConnection(){
        openDBConnection();
        return dbConn;}
    


}
