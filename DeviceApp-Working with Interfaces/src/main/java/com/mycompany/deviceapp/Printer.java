
package com.mycompany.deviceapp;



public class Printer implements iDevice {
    private String deviceName;
    private String location;
    private int pagesPrinted;

    public Printer(String deviceName, String location, int pagesPrinted) {
        this.deviceName = deviceName;
        this.location = location;
        this.pagesPrinted = pagesPrinted;
    }

    
    public String getDeviceName() { return deviceName; }
    public String getLocation() { return location; }

    public boolean needsService() {
        
        if (pagesPrinted > 10000) {
            return true;
        }
        return false;
    }
}

