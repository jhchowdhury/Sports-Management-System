public class BusRental {
    private int busCapacity;
    private String busModel;

    public BusRental() {
        busCapacity = 0;
        busModel = "";
    }
    public BusRental(int busCapacity, String busModel) {
        this.busCapacity = busCapacity;
        this.busModel = busModel;
    }
    public void setBusCapacity(int busCapacity) {
        this.busCapacity = busCapacity;
    }
    public void setBusModel(String busModel) {
        this.busModel = busModel;
    }
    public int getBusCapacity() {
        return busCapacity;
    }
    public String getBusModel() {
        return busModel;
    }
}
