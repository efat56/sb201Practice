package com.practice;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("Harrier", "Tata", "black", new Engine(1000, 110, "Tata", true));


        car.fun1();
        System.out.println("***************************************");

        Car car2 = new Car();
        Engine engine = new Engine();

            car2.model = "Harrier";
            car2.companyName = "Tata";
            car2.color = "Black";
//            car2.engine.rmp = 1000;
//            car2.engine.power = 110;
//            car2.engine.manufacturer = "Tata";
//            car2.engine.hasTurbo = true;
            car2.fun1();



    }
}
