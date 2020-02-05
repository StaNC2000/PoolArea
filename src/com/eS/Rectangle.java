package com.eS;

public class Rectangle {

    private double width;
    private double length;

    public Rectangle(double width, double length) {
        // in case when parameters are less then 0 set fields to 0;

        if (width < 0) {
            this.width = 0;
        }
        else {
            this.width = width;
        }
        if (length < 0) {
            this.length = 0;
        }
        else {
            this.length = length;
        }
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getArea() {
        return width * length;
    }
}
