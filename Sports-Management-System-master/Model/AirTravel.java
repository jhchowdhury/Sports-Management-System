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
        return this.flightClass;
    }

    @Override
    public String book() {
        return "Booked for Air Travel!";
    }

    @Override
    public String cancelBook() {
        return "Book canceled for Air Travel!";
    }

    @Override
    public String updateBook(Date booktime) {
        return "Book updated for Air Travel!";
    }

}
