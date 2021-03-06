package com.rofa.cardealership;

public class Deal {

    private int ID;
    private Car carForSale;
    private Seller carSeller;

    public Deal(){ }

    public Deal(Car cCar, Seller cSeller){
        this.carForSale = cCar;
        this.carSeller = cSeller;
    }

    public Car getCarForSale() {
        return carForSale;
    }

    public void setCarForSale(Car carForSale) {
        this.carForSale = carForSale;
    }

    public Seller getCarSeller() {return carSeller;}

    public void setCarSeller(Seller carSeller){this.carSeller = carSeller;}

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override //Override the toString method, to get a readable version :)
    public String toString() {

        return
       "-----------Car's Details-----------" +
       "\nCar's brand: " + this.carForSale.getBrand()+
       "\nCar's model: " + this.carForSale.getModel()+
       "\nCar's color: " + this.carForSale.getColor()+
       "\nYear of the manufacture: " + this.carForSale.getYearOfMan()+
       "\nTraveled kilometers: " + this.carForSale.getKmeterTrav() + " km" +
       "\n----------Seller's Details----------"+
       "\nSeller's name: " + this.carSeller.getSellerName()+
       "\nSeller's e-mail: " + this.carSeller.getSellerEmail()+
       "\nSeller's phone number: " + this.carSeller.getSellerPhoneNumber()+
       "\n-----------------------------------";


    }
}
