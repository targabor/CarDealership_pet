package com.rofa.cardealership;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Seller {

    private String sellerName;
    private String sellerPhoneNumber;
    private String sellerEmail;



    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public String getSellerPhoneNumber() {
        return sellerPhoneNumber;
    }

    public boolean setSellerPhoneNumber(String sSellerPhoneNumber) {
        if(Math.isNumber(sSellerPhoneNumber)){
            this.sellerPhoneNumber = sSellerPhoneNumber;
            return true;
        }
        return false;
    }

    public String getSellerEmail() {
        return sellerEmail;
    }

    public void setSellerEmail(String sellerEmail) {
        this.sellerEmail = sellerEmail;
    }

    public static Seller getSellerFromDB(String loginEmail, String loginPassword){


        Seller returnSeller = null;

        String sql = "select name,phoneNumber,emailAddress from seller where emailAddress = ? and password = ?;";
        try{
            PreparedStatement psmt = DataBase.getConnection().prepareStatement(sql);
            psmt.setString(1,loginEmail);
            psmt.setString(2,loginPassword);

            ResultSet sellerResult = psmt.executeQuery();
            returnSeller = new Seller();
            sellerResult.next();
            returnSeller.setSellerName(sellerResult.getString("name"));
            returnSeller.setSellerEmail(sellerResult.getString("emailAddress"));
            returnSeller.setSellerPhoneNumber(sellerResult.getString("phoneNumber"));

        }catch (SQLException sqlEX){
            System.out.println("There is an error at the getSellerFromDB method\n"+sqlEX);
        }


        return returnSeller;

    }
}
