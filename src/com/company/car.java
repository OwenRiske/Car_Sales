package com.company;

public class car {
    String type;
    String colour;
    Double price;
    int stock;

    //constructor
    car(String type, String colour,double price, int stock){
        this.type=type;
        this.colour=colour;
        this.price=price;
        this.stock=stock;
    }

    String getType(){
        return type;
    }
    String getColour(){
        return colour;
    }
    double getPrice(){
        return price;
    }
    void setPrice(double newPrice){
        this.price=newPrice;
    }
    int getStock(){
        return stock;
    }

    void lowerStock(int amountLowered){
        if (stock>=amountLowered) {
            stock -= amountLowered;
        }
        else{
            System.out.println("Unable to lower the stock");
        }
    }
    void addStock(int amountAdded){
        stock+=amountAdded;
    }

}
