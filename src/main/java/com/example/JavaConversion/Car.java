package com.example.JavaConversion;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;


public class Car {
    private int mpg;
    private int gallons = 0;
    private int odometer = 0;
    private ArrayList<String> trips = new ArrayList<String>();

    public Car(int mpg) {
        this.mpg = mpg;
    }

    public void fill(int gallons) {
        this.gallons += gallons;
    }

    public void drive(int miles) {
        this.gallons -= (miles / this.mpg);
        this.odometer += miles;
        this.trips.add(miles + " miles");
    }

    public int getMpg() {
        return mpg;
    }

    public void setMpg(int mpg) {
        this.mpg = mpg;
    }

    public int getGallons() {
        return gallons;
    }

    public void setGallons(int gallons) {
        this.gallons = gallons;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    public ArrayList<String> getTrips() {
        return trips;
    }

    public void setTrips(ArrayList<String> trips) {
        this.trips = trips;
    }
}
