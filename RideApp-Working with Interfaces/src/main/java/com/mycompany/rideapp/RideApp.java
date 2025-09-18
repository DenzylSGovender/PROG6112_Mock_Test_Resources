

package com.mycompany.rideapp;


public class RideApp {

    public static void main(String[] args) {
        Ride[] rides = new Ride[2];
        rides[0] = new CarRide("Denzyl", 3, 30.0);
        rides[1] = new BikeRide("Jackie", 50.0);

        System.out.println("=== Campus Ride Sharing Report ===");
        for (Ride r : rides) {
            System.out.println("Driver: " + r.getDriverName() +
                               " | Passengers: " + r.getPassengerCount() +
                               " | Fare: R" + r.calculateFare());
        }
    }
}
