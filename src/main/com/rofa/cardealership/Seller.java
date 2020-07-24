package com.rofa.cardealership;

import java.sql.PreparedStatement;
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
        if(Math.isNumber(sellerPhoneNumber)){
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

    public Seller getSellerFromDB(String loginEmail, String loginPassword){


        Seller returnSeller = null;

        String sql = "select count(sellerID) from seller where emailAddress = ? and password = ?;";

        try{
            PreparedStatement psmt = DataBase.getConnection().prepareStatement(sql);
        }catch (SQLException sqlEX){
            System.out.println("There is an error at the getSellerFromDB method");
        }


        return returnSeller;

    }
}
