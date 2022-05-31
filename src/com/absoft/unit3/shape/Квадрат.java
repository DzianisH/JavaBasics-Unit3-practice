package com.absoft.unit3.shape;

public class Квадрат extends Rectangle {

    private double side1;


    public Квадрат(double side) {
        super(side, side); // sadasd
        this.side1 = 1000.1;
//        super.side1 = 100;
    }

    public double getSquareSide() {
        return side1;
    }

}
