package org.example;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {

        // FleetOfCars fleet = new FleetOfCars();
GasolineCar gcar = new GasolineCar(45,"dettererenregi","audi","a6",4);
ElectricCar ecar = new ElectricCar(50,400,"regi123","tesla","CyberTruck",4);
DieselCar dcar = new DieselCar(4,false,"123regi","Ford", "f150", 6);

        //System.out.println(dcar);
        FleetOfCars fleet = new FleetOfCars();
        fleet.addCar(gcar);
        fleet.addCar(ecar);
        fleet.addCar(dcar);


        System.out.println(fleet);
        System.out.println("Total registration fee for fleet: " + fleet.getTotalRegistrationFeeForFleet()+"kr");
        //System.out.println(gcar);
       // System.out.println(ecar);
       // System.out.println(dcar);
    }
}