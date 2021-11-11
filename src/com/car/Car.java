package com.car;

import com.Owner.Owner;
import com.brand.Brand;


public class Car {

    private  Brand brand;
    private Owner owner;
    private Integer max_speed;
    private Integer current_speed = 0;
    private Integer Current_transmission_speed = 0;
    private Integer doors;
    private Boolean sunroof;
    private Integer transmission_speeds;
    private Boolean automatic_transmission;
    private Integer fuel_volume;
    private Integer autonomy;

    public Car(Brand brand, Integer doors, Integer transmission_speeds, Integer max_speed, Owner owner,Integer fuel_volume, Integer autonomy) {

        this.brand = brand;
        this.doors = doors;
        this.transmission_speeds = transmission_speeds;
        this.max_speed = max_speed;
        this.owner = owner;
        this.fuel_volume = fuel_volume;
        this.autonomy = autonomy;


    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public Integer getCurrent_transmission_speed() {
        return Current_transmission_speed;
    }

    public void setCurrent_transmission_speed(Integer current_transmission_speed) {
        Current_transmission_speed = current_transmission_speed;
    }



    public Owner getOwner() {
        return owner;
    }

    public Integer getMax_speed() {
        return max_speed;
    }

    public void setMax_speed(Integer max_speed) {
        this.max_speed = max_speed;
    }

    public Integer getCurrent_speed() {
        return current_speed;
    }

    public void setCurrent_speed(Integer current_speed) {
        this.current_speed = current_speed;
    }

    public Integer getDoors() {
        return doors;
    }

    public void setDoors(Integer doors) {
        this.doors = doors;
    }

    public Boolean getSunroof() {
        return sunroof;
    }

    public void setSunroof(Boolean sunroof) {
        this.sunroof = sunroof;
    }

    public Integer getTransmission_speeds() {
        return transmission_speeds;
    }

    public void setTransmission_speeds(Integer transmission_speeds) {
        this.transmission_speeds = transmission_speeds;
    }

    public Boolean getAutomatic_transmission() {
        return automatic_transmission;
    }

    public void setAutomatic_transmission(Boolean automatic_transmission) {
        this.automatic_transmission = automatic_transmission;
    }

    public Integer getFuel_volume() {
        return fuel_volume;
    }

    public void setFuel_volume(Integer fuel_volume) {
        this.fuel_volume = fuel_volume;
    }

    public void setOwner(com.Owner.Owner owner) {
        this.owner = owner;
    }

    public Integer getAutonomy() {
        return autonomy;
    }

    public void setAutonomy(Integer autonomy) {
        this.autonomy = autonomy;
    }

    public String toString(){

        return "Car [ \nModel: " + this.brand.getModel() +
                "\nYear: "+ this.brand.getYear() +
                "\nBrand: " + this.brand.getName() +
                "\nOwner: " + this.owner.getName() +
                "\nCurrent Transmission Speed: " + this.Current_transmission_speed +
                "\nFuel Volume: " + this.fuel_volume + "Liters" +
                "\nThis car will travel "+ this.autonomy() + " Km with the current fuel level " + "]";
    }

    //Methods to move the car

//accelerate car
    public void accelerate() {
        int speed = this.current_speed;
        if(Current_transmission_speed == 0){
            System.out.println("The gear transmission is on neutral, change it to start acceleration");
        }else if (speed < max_speed){
            this.setCurrent_speed(current_speed + 1);
            System.out.println("Current speed: " + this.getCurrent_speed());
        }else{
            System.out.println("You reached your car's maximum speed");
        }

    }

//Stop the car
    public void breakCar(){
    this.setCurrent_speed(0);
        System.out.println("Speed: " + this.getCurrent_speed());
    }

//Change the transmission speed
    public void gearShift() {
        int gearShift = this.Current_transmission_speed;



        if(gearShift < transmission_speeds){
            this.setCurrent_transmission_speed(Current_transmission_speed + 1);
            System.out.println("Transmission gear: " + this.getCurrent_transmission_speed());
        }else{

            System.out.println("You reached the limit of your transmission speeds");
        }
    }

//slow down car
    public void downShift(){
        int currentSpeed = this.Current_transmission_speed;
        if(currentSpeed != 0){
            this.setCurrent_transmission_speed(Current_transmission_speed - 1);
            this.setCurrent_speed(current_speed - 1);
            System.out.println("Transmission gear: " + this.getCurrent_transmission_speed());
            System.out.println("Speed: " + this.getCurrent_speed());
        }
    }

//reverse
    public void reverse(){
        int speed = this.current_speed;
        if(speed == 0 || speed < 0){
            System.out.println("Car is moving in reverse");;
            this.setCurrent_speed(current_speed - 1);
            System.out.println("Current speed: " + this.getCurrent_speed());
        }else {
            System.out.println("Reverse cannot work unless car stopped completely");
        }
    }

    //Auntonomy
    public Integer autonomy(){
        Integer KmL =  fuel_volume * autonomy;
        return KmL;


    }

}



