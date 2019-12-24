import Model.*;

public class Manager extends Profile {
    private double budget;
    private String responsibility;

    public Manager() {
        budget = 0.0
        responsibility = "";
    }
    public Manager(double budget, String responsibility) {
        this.budget = budget;
        this.responsibility = responsibility;
    }
    public void setBudget(double budget) {
        this.budget = budget;
    }
    public void setResponsibility(String responsibility) {
        this.responsibility = responsibility;
    }
    public double getBudget() {
        return budget;
    }
    public String getResponsibility() {
        return responsibility;
    }
}
