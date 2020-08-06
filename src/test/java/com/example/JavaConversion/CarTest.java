package com.example.JavaConversion;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CarTest {
    @Test
    public void testFill(){
        Car car = new Car(10);

       assertEquals(0,car.getGallons());

       car.fill(5);
       assertEquals(5,car.getGallons());

       car.fill(6);
       assertEquals(11,car.getGallons());
    }

    @Test
    public void testDrive(){
        Car car = new Car(10);

        car.fill(10);
        assertEquals(10,car.getGallons());

        car.drive(50);
        assertEquals(5,car.getGallons());
    }

    @Test
    public void testOdo(){
        Car car = new Car(25);

        assertEquals(0,car.getOdometer());

        car.drive(50);

        assertEquals(50,car.getOdometer());

        car.drive(25);

        assertEquals(75,car.getOdometer());
    }

    @Test
    public void testTrips(){
        Car car = new Car(10);

        ArrayList<String> trips = new ArrayList<String>();

        assertEquals(trips,car.getTrips());

        trips.add("50 miles");
        car.drive(50);
        assertEquals(trips,car.getTrips());

        trips.add("25 miles");
        car.drive(25);
        assertEquals(trips,car.getTrips());


    }
}
