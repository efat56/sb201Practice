package com.eval;

public class OLA {
    public Car bookCar(int numberOfPassenger,int numberOfKMs){
        if(numberOfPassenger<=3){
            HachBack hachBack = new HachBack();
            hachBack.setNumberOfKms(numberOfKMs);
            hachBack.setNumberOfPassenger(numberOfPassenger);

            return hachBack;
        }
        else {
            Sedan sedan = new Sedan();
            sedan.setNumberOfPassenger(numberOfPassenger);
            sedan.setNumberOfKms(numberOfKMs);
            return sedan;
        }
    }
    public int calculateBill(Car car){
//        int total = car.numberOfKms*car.numberOfPassenger;
//        car.numberOfKms=12;
        if(car instanceof Sedan){
           Sedan sedan=(Sedan)car;
           int numberOfKms=sedan.getNumberOfKms();
           int farePerKm=sedan.farePerKm;
           int total = numberOfKms*farePerKm;
           return total;


        }
        else if(car instanceof HachBack){
            HachBack hack=(HachBack)car;
            int numberOfKms=hack.getNumberOfKms();
            int farePerKm=hack.farePerKm;
            int total2 = numberOfKms*farePerKm;
            return total2;


        }
        return 0;
    }
}
