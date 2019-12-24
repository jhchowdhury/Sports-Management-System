import Model.*;

public class Player extends Profile{
    private String position;
    private String role;
    private String condition;
    private int motivation;
    private double marketValue;

    public Player() {
        position = "";
        role = "";
        condition = "";
        motivation = 0;
        marketValue = 0.0;
    }
    public Player(String position, String role, String condition, int motivation, double marketValue) {
        this.position = position;
        this.role = role;
        this.condition = condition;
        this.motivation = motivation;
        this.marketValue = marketValue;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public void setRole(String role) {
        this.role = role;
    }
    public void setCondition(String condition) {
        this.condition = condition;
    }
    public void setMotivation(int motivation) {
        this.motivation = motivation;
    }
    public void setMarketValue(double marketValue) {
        this.marketValue = marketValue;
    }
    public String getPosition() {
        return position;
    }
    public String getRole() {
        return role;
    }
    public String getCondition() {
        return condition;
    }
    public int getMotivation() {
        return motivation;
    }
    public double getMarketValue() {
        return marketValue;
    }
}
