package com.rofa.cardealership;


import javax.xml.crypto.Data;
import java.sql.SQLException;

public class Saver {

    public static void saveNewDeal(Deal newDeal){

        DataBase dbConn = new DataBase();
        dbConn.openDBConnection(); //Open the database connection



        dbConn.closeDBConnection();






    }

}
