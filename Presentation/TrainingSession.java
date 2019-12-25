package Presentation;
import Model.*;

public class TrainingSession {

    private int sessionID;
    private double heartRate;
    private double weightBefore;
    private double weightAfter;

    public TrainingSession() {
        sessionID = 0;
        heartRate = 0.0;
        weightBefore = 0.0;
        weightAfter = 0.0;
    }
    public TrainingSession(int sessionID, double heartRate, double weightBefore, double weightAfter) {
        this.sessionID = sessionID;
        this.heartRate = heartRate;
        this.weightBefore = weightBefore;
        this.weightAfter = weightAfter;
    }
    public void setHeartRate(double heartRate) {
        this.heartRate = heartRate;
    }
    public void setWeightBefore(double weightBefore) {
        this.weightBefore = weightBefore;
    }
    public void setWeightAfter(double weightAfter) {
        this.weightAfter = weightAfter;
    }
    public double getHeartRate() {
        return heartRate;
    }
    public double getWeightBefore() {
        return weightBefore;
    }
    public double getWeightAfter() {
        return weightAfter;
    }
}
