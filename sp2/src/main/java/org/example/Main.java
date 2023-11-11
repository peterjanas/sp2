package org.example;


public class Main {
    public static void main(String[] args) {

        GasolineCar gcar = new GasolineCar(45, "dettererenregi", "audi", "a6", 4);
        ElectricCar ecar = new ElectricCar(50, 400, "regi123", "tesla", "CyberTruck", 4);
        DieselCar dcar = new DieselCar(4, false, "123regi", "Ford", "f150", 6);

        FleetOfCars fleet = new FleetOfCars();
        fleet.addCar(gcar);
        fleet.addCar(ecar);
        fleet.addCar(dcar);

        System.out.println(fleet);
        System.out.println("Total registration fee for fleet: " + fleet.getTotalRegistrationFeeForFleet() + "kr");
    }
}