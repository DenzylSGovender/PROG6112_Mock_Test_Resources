
package com.mycompany.rideapp;


class BikeRide implements Ride {
    private String driverName;
    private int passengerCount;
    private double flatFare;

    public BikeRide(String driverName, double flatFare) {
        this.driverName = driverName;
        this.passengerCount = 1; // always 1 passenger
        this.flatFare = flatFare;
    }

    public String getDriverName() {
        return driverName;
    }

    public int getPassengerCount() {
        return passengerCount;
    }

    public double calculateFare() {
        return flatFare;
    }
}