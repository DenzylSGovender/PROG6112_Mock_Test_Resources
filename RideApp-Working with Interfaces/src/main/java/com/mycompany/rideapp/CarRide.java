
package com.mycompany.rideapp;


class CarRide implements Ride {
    private String driverName;
    private int passengerCount;
    private double baseFarePerPassenger;

    public CarRide(String driverName, int passengerCount, double baseFarePerPassenger) {
        this.driverName = driverName;
        this.passengerCount = passengerCount;
        this.baseFarePerPassenger = baseFarePerPassenger;
    }

    public String getDriverName() {
        return driverName;
    }

    public int getPassengerCount() {
        return passengerCount;
    }

    public double calculateFare() {
        return passengerCount * baseFarePerPassenger;
    }
}
