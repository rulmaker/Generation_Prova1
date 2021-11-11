package com;

import com.adress.Adress;
import com.brand.Brand;
import com.car.Car;
import com.Owner.Owner;

public class Main {
    public static void main(String[] args){

    //Brand class
    Brand Brand1 = new Brand("Volkswagen", "Pointer", 2000, "JAH1230123");

    //Adress class
    Adress Adress1 = new Adress("Road 1",
            "Down Town",
            "Los Angeles",
            "California",
            1001);

        System.out.println("-------Owner------");
    //Owner class
    Owner Owner1 = new Owner("John Deer",
            "JD1234fc",
            "JD123INE",
            Adress1);
    System.out.println("Owner1 : " + Owner1.toString());

        System.out.println("--------Car-------");
    //Car class
    Car Car1 = new Car(Brand1,
            2,
            5,
            6,
            Owner1,
             40,
              18);

    System.out.println("Car 1: " + Car1.toString());

    System.out.println("----Accelerating----");

    Car1.gearShift();
    Car1.accelerate();
    Car1.gearShift();
    Car1.accelerate();
    Car1.gearShift();
    Car1.accelerate();
    Car1.gearShift();
    Car1.accelerate();
    Car1.gearShift();
    Car1.accelerate();
    Car1.gearShift();
    Car1.accelerate();
    Car1.gearShift();
    Car1.accelerate();

    System.out.println("----Slow speed----");
    Car1.downShift();
    Car1.downShift();
    Car1.downShift();
    Car1.downShift();
    Car1.downShift();

    System.out.println("----Breaking----");

    Car1.breakCar();

    System.out.println("----Reverse----");
    Car1.reverse();

    Car1.breakCar();

    }

}
