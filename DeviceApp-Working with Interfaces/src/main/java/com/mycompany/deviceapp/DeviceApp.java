

package com.mycompany.deviceapp;


public class DeviceApp {

    public static void main(String[] args) {
                iDevice[] devices = new iDevice[2];

        devices[0] = new Printer("HP LaserJet", "Library", 12000);
        devices[1] = new Projector("Epson X200", "Lecture Hall 3", 450);

        System.out.println("=== Smart Device Monitoring Report ===");
        for (iDevice d : devices) {
            System.out.println(d.getDeviceName() + " | Location: " + d.getLocation());
            System.out.println("Needs Service: " + d.needsService());
            System.out.println();
        }

    }
}
