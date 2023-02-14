package com.company;

public class truck extends car{
    double bedWidth;
    double bedHeight;

    truck(String type, String colour, double price, int stock, double bedWidth, double bedHeight) {
        super(type, colour, price, stock);
        this.bedWidth=bedWidth;
        this.bedHeight=bedHeight;
    }
}
