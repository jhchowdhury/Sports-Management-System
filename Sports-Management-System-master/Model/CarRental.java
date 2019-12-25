import java.util.Date;

public class CarRental implements BookingSystem {
    String carType;
    int carCapacity;

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

    @Override
    public String book() {
        return "Booked for Car rental!";
    }

    @Override
    public String cancelBook() {
        return "Book canceled for Car rental!";
    }

    @Override
    public String updateBook(Date booktime) {
        return "Book updated for Car rental!";
    }

}
