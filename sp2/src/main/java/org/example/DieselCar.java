package org.example;

public class DieselCar extends AFuelCar {
    private boolean particleFilter;

    public DieselCar(int kmPrLitre, boolean particleFilter, String registrationNumber, String make, String model, int numberOfDoors) {
        super(kmPrLitre, registrationNumber, make, model, numberOfDoors);
        this.particleFilter = particleFilter;
    }


    boolean hasParticleFilter() {
        return particleFilter;
    }

    @Override
    String getFuelType() {
        return "Diesel";
    }

    @Override
    public int getRegistrationFee() {
        int registrationFee = 0;
        if (particleFilter == false) {
            registrationFee += 1000;
        }

        if (getKmPrLitre() <= 5) {
            registrationFee += 15260 + 10470;
        } else if (getKmPrLitre() <= 10) {
            registrationFee += 2770 + 5500;
        } else if (getKmPrLitre() <= 15) {
            registrationFee += 1850 + 2340;
        } else if (getKmPrLitre() <= 20) {
            registrationFee += 1390 + 1050;
        } else if (getKmPrLitre() > 20) {
            registrationFee += 130 + 330;
        }

        return registrationFee;
    }

    @Override
    public String toString() {
        return super.toString() + "\nRegistration fee: " + getRegistrationFee() + "\nFuel type: " + getFuelType() + "\nParticle fitler: "+ hasParticleFilter();
    }
}