package org.example;

import java.util.ArrayList;

public class FleetOfCars {
    public ArrayList<Car> fleet = new ArrayList<>();
    void addCar(Car car){
    fleet.add(car);
    }

    int getTotalRegistrationFeeForFleet() {
        int totalRegistrationFeeForFleet = 0;
        for (Car s : fleet) {
            totalRegistrationFeeForFleet += s.getRegistrationFee();

        }
        return totalRegistrationFeeForFleet;
    }

    @Override
    public String toString()
    {
        StringBuilder NameofFleet = new StringBuilder();
        for (Car s : fleet) {
            NameofFleet.append(s);
        }
        return NameofFleet.toString();
    }
}