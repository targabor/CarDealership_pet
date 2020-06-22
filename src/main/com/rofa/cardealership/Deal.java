package com.rofa.cardealership;

public class Deal {

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
       "\nSeller's name: " + this.carSeller.getName()+
       "\nSeller's e-mail: " + this.carSeller.getEmailAddress()+
       "\nSeller's phone number: " + this.carSeller.getPhoneNumber()+
       "\n-----------------------------------";


    }
}
