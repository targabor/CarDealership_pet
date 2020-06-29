package com.rofa.cardealership;

public class Seller {

    private int ID;
    private String name;
    private String phoneNumber;
    private String emailAddress;

    public Seller(){}

    public Seller(String cName, String cPhoneNumber, String cEmailAddress){
        this.name = cName;
        this.phoneNumber = cPhoneNumber;
        this.emailAddress = cEmailAddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) throws NumberFormatException{

        //In here, I check that, is the given phone number, contains only digits
        String regex = "\\d+";
        if(phoneNumber.matches(regex))
            this.phoneNumber = phoneNumber;
        else
            throw new NumberFormatException();
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}
