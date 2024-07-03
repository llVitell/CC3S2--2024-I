package org.example;

public class Temperature {
    private int temperature;
    private Alert alert;
    public Temperature(int temperature){
        this.temperature = temperature;
        this.alert = new Alert();
    }
    public boolean isTooHot(){
        return temperature >= 35;
    }
    public String[] getAlerts() {
        if (isTooHot()) {
            return new String[] {
                    alert.event("Activar sistema de alta temperatura"),
                    alert.event("Llevar ropa veraniega")};
        }
        return new String[] {""};
    }
}
