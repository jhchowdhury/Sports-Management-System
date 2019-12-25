package Model;

public class Speed {

    private double topSpeed;
    private double averageSpeed;
    
    public Speed() {
        topSpeed = 0.0;
        averageSpeed = 0.0;
    }
    public Speed(double topSpeed, double averageSpeed) {
        this.topSpeed = topSpeed;
        this.averageSpeed = averageSpeed;
    }
    public void setTopSpeed(double topSpeed) {
        this.topSpeed = topSpeed;
    }
    public void setAverageSpeed(double averageSpeed) {
        this.averageSpeed = averageSpeed;
    }
    public double getTopSpeed() {
        return topSpeed;
    }
    public double getAverageSpeed() {
        return averageSpeed;
    }
    public void calculateAverageSpeed() {

    }
}
