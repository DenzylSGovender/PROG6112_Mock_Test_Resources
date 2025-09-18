
package com.mycompany.deviceapp;


// (c) Implement the Projector class
public class Projector implements iDevice {
    private String deviceName;
    private String location;
    private int hoursUsed;

    public Projector(String deviceName, String location, int hoursUsed) {
        this.deviceName = deviceName;
        this.location = location;
        this.hoursUsed = hoursUsed;
    }

   
    public String getDeviceName() { return deviceName; }
    public String getLocation() { return location; }

    public boolean needsService() {
       
        if (hoursUsed > 500) {
            return true;
        }
        return false;
    }
}
