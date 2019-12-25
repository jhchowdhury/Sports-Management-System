package Model;

public class BasketballTraining {

    private int pointScore;
    private int layups;
    
    public BasketballTraining() {
        pointScore = 0;
        layups = 0;
    }
    public BasketballTraining(int pointScore, int layups) {
        this.pointScore = pointScore;
        this.layups = layups;
    }
    public void setPointScore(int pointScore) {
        this.pointScore = pointScore;
    }
    public void setLayups(int layups) {
        this.layups = layups;
    }
    public int getPointScore() {
        return pointScore;
    }
    public int getLayups() {
        return layups;
    }
}
