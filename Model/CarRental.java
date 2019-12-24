public class CarRental {
    private String carType;
    private int carCapacity;

    public CarRental() {
        carType = "";
        carCapacity = 0;
    }
    public CarRental(String carType, int carCapacity) {
        this.carType = carType;
        this.carCapacity = carCapacity;
    }
    public void setCarType(String carType) {
        this.carType = carType;
    }
    public void setCarCapacity(int carCapacity) {
        this.carCapacity = carCapacity;
    }
    public String getCarType() {
        return carType;
    }
    public int getCarCapacity() {
        return carCapacity;
    }
}
