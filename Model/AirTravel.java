public abstract class AirTravel implements BookingSystem {
    private String flightClass;
    
    public AirTravel() {
        flightClass = "";
    }
    public AirTravel(String flightClass) {
        this.flightClass = flightClass;
    }
    public void setFlightClass(String flightClass) {
        this.flightClass = flightClass;
    }
    public String getFlightClass() {
        return flightClass;
    }
    // public boolean returnFlight() {
    //     return 
    // }
}
