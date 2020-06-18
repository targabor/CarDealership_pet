package com.rofa.cardealership;

public class Deal {

    private Car carForSale;
    private String sellerName;
    private int sellersPhone;
    private String sellersEmail;

    public Deal(){ }

    public Deal(Car cCar, String cSName, int sPhone, String sMail){
        this.carForSale = cCar;
        this.sellerName = cSName;
        this.sellersPhone = sPhone;
        this.sellersEmail = sMail;
    }

    public Car getCarForSale() {
        return carForSale;
    }

    public void setCarForSale(Car carForSale) {
        this.carForSale = carForSale;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public int getSellersPhone() {
        return sellersPhone;
    }

    public void setSellersPhone(int sellersPhone) throws NumberFormatException {
        this.sellersPhone = sellersPhone;
    }

    public String getSellersEmail() {
        return sellersEmail;
    }

    public void setSellersEmail(String sellersEmail) {
        this.sellersEmail = sellersEmail;
    }

    @Override //Override the toString method, to get a readable version :)
    public String toString() {

        System.out.println("-----------Car's Details-----------");
        System.out.println("Car's brand: " + this.carForSale.getBrand());
        System.out.println("Car's model: " + this.carForSale.getModel());
        System.out.println("Car's color: " + this.carForSale.getColor());
        System.out.println("Year of the manufacture: " + this.carForSale.getYearOfMan());
        System.out.println("Traveled kilometers: " + this.carForSale.getKmeterTrav());
        System.out.println("----------Seller's Details----------");
        System.out.println("Seller's name: " + this.sellerName);
        System.out.println("Seller's e-mail: " + this.sellersEmail);
        System.out.println("Seller's phone number: " + this.sellersPhone);
        System.out.println("-----------------------------------");

        return null;
    }
}
