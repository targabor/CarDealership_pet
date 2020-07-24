package com.rofa.cardealership;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GetDataBaseData {

    public static int getTableLength(Connection dbConn, String tableName){

        try{
            String sql = "select count(*) from ?;";
            PreparedStatement psmt = dbConn.prepareStatement(sql);
            psmt.setString(1,tableName);
            ResultSet rs = psmt.executeQuery();
            rs.next();
            return rs.getInt(1);
        }catch (SQLException sqlEx){
            System.out.println("There is an error, at the getTableLenght method\n"+sqlEx);
            return 0;
        }

    }
}
