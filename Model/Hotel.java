public class Hotel {
    private String roomType;
    private double roomPrice;

    public Hotel() {
        roomType = "";
        roomPrice = 0.0;
    }
    public Hotel(String roomType, double roomPrice) {
        this.roomType = roomType;
        this.roomPrice = roomPrice;
    }
    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }
    public void setRoomPrice(double roomPrice) {
        this.roomPrice = roomPrice;
    }
    public String getRoomType() {
        return roomType;
    }
    public double getRoomPrice() {
        return roomPrice;
    }
}
