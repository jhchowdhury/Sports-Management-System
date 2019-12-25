package Model;

public class BaseballTraining {

    private int runScore;
    private int hits;
    private int saves;

    public BaseballTraining() {
        runScore = 0;
        hits = 0;
        saves = 0;
    }
    public BaseballTraining(int runScore, int hits, int saves) {
        this.runScore = runScore;
        this.hits = hits;
        this.saves = saves;
    }
    public void setRunScore(int runScore) {
        this.runScore = runScore;
    }
    public void setHits(int hits) {
        this.hits = hits;
    }
    public void setSaves(int saves) {
        this.saves = saves;
    }
    public int getRunScore() {
        return runScore;
    }
    public int getHits() {
        return hits;
    }
    public int getSaves() {
        return saves;
    }
}
