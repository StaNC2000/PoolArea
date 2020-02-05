package com.eS;

public class Cuboid extends Rectangle{
    private double height;

    public Cuboid(double width, double length, double height) {
        // in case when height parameter is less then 0 set fields to 0;
        super(width, length);
        if (height < 0) {
            this.height = 0;
        }
        else {
            this.height = height;
        }
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return getArea() * height;
    }
}
