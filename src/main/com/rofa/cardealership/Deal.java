package com.rofa.cardealership;

public class Deal {

    private Car carForSale;
    private String sellerName;
    private String sellersPhone;
    private String sellersEmail;

    public Deal(){ }

    public Deal(Car cCar, String cSName, String sPhone, String sMail){
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

    public String getSellersPhone() {
        return sellersPhone;
    }

    public void setSellersPhone(String sellersPhone) {
        this.sellersPhone = sellersPhone;
    }

    public String getSellersEmail() {
        return sellersEmail;
    }

    public void setSellersEmail(String sellersEmail) {
        this.sellersEmail = sellersEmail;
    }
}
