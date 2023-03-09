package com.practice;

public class Car  {
    String model;
    String companyName;
    String color;
    Engine engine;

    public Car(String model, String companyName, String color, Engine engine ) {
        this.model = model;
        this.companyName = companyName;
        this.color = color;
        this.engine = engine;


    }
    Car (){

    }







    public  void fun1(){
        System.out.println("Car Model "+model);
        System.out.println("Car companyName "+companyName);
        System.out.println("Car color "+color);
        System.out.println("Car power "+engine.power);
        System.out.println("Car Engine Manufacture "+engine.manufacturer);
        System.out.println("Car hasTurbo "+engine.hasTurbo);
    }
}
