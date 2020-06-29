package com.rofa.cardealership;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBase {

    private  final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private  final String URL = "jdbc:mysql://localhost:3306/cardealership";
    private  final String USERNAME = "root";
    private  final String PASSWORD = "";

    private  Connection dbConn = null;

    public  boolean openDBConnection(){

        try {
            dbConn = DriverManager.getConnection(URL,USERNAME,PASSWORD);
            return true;
        } catch (SQLException sqlEx) {
            System.out.println(sqlEx);
            return false;
        }

    }

    public  boolean closeDBConnection(){
        try{
            dbConn.close();
            return true;
        }catch (SQLException sqlEx){
            System.out.println(sqlEx);
            return false;
        }
    }

    public  Connection getConnection(){
        openDBConnection();
        return dbConn;}
    


}
