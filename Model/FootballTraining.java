package Model;

public class FootballTraining {

    private int goalScore;
    private int shots;

    public FootballTraining() {
        goalScore = 0;
        shots = 0;
    }
    public FootballTraining(int goalScore, int shots) {
        this.goalScore = goalScore;
        this.shots = shots;
    }
    public void setGoalScore(int goalScore) {
        this.goalScore = goalScore;
    }
    public void setShots(int shots) {
        this.shots = shots;
    }
    public int getGoalScore() {
        return goalScore;
    }
    public int getShots() {
        return shots;
    }
}
