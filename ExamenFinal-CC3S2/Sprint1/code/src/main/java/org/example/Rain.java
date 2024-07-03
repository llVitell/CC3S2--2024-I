package org.example;

public class Rain {
    private int rain;
    private int humidity;
    private Alert alert;
    public Rain(int rain, int humidity) {
        this.rain = rain;
        this.humidity = humidity;
        this.alert = new Alert();
    }
    public boolean isTooMuchRain() {
        return rain >= 20;
    }
    public boolean isTooMuchHumidity() {
        return humidity >= 70;
    }
    public String[] getAlerts() {
        if (isTooMuchHumidity() && isTooMuchRain()) {
            return new String[] {
                    alert.event("Activar sistema de humedad y riego"),
                    alert.event("Llevar paraguas y abrigarse bien")};
        }
        if (isTooMuchRain()) {
            return new String[] {
                    alert.event("Activar sistema de riego"),
                    alert.event("Llevar paraguas")};
        }
        if (isTooMuchHumidity()) {
            return new String[] {
                    alert.event("Activar sistema de humedad"),
                    alert.event("Llevar paraguas")};
        }
        return new String[] {""};
    }
}
