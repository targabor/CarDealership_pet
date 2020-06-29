package com.rofa.cardealership;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GetDataBaseData {

    public static int getTableLength(Connection dbConn, String tableName){

        try{
            String sql = "select count(*) from $tableName;";
            String query = sql.replace("$tableName",tableName);
            PreparedStatement psmt = dbConn.prepareStatement(query);
            ResultSet rs = psmt.executeQuery();
            rs.next();
            return rs.getInt(1);
        }catch (SQLException sqlEx){
            System.out.println(sqlEx);
            return 0;
        }

    }
}
