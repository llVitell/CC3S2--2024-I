package org.example;

public class Air {
    private int airSpeed;
    private int pressure;
    private Alert alert;
    public Air(int airSpeed, int pressure){
        this.airSpeed = airSpeed;
        this.pressure = pressure;
        this.alert = new Alert();
    }
    public boolean isAirFast() {
        return airSpeed >= 50 ;
    }
    public boolean isTooMuchPressure(){
        return pressure >= 35;
    }
    public String[] getAlerts() {
        if (isAirFast() && isTooMuchPressure()) {
            return new String[] {
                    alert.event("Cerrar persianas y activar sistema de presion"),
                    alert.event("Llevar cortavientos y antipresion")};
        }
        if (isAirFast()) {
            return new String[] {
                    alert.event("Cerrar persianas"),
                    alert.event("Llevar cortavientos")};
        }
        if (isTooMuchPressure()) {
            return new String[] {
                    alert.event("Activar sistema de presion"),
                    alert.event("Llevar antipresion")};
        }
        return new String[] {""};
    }

}
