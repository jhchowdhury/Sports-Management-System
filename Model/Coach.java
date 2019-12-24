import Model.*;

public class Coach extends Profile {
    private String form;
    private GamePlan gamePlan;
    public Coach() {
        form = "";
    }
    public Coach(String form) {
        this.form = form;
    }
    public void setForm(String form) {
        this.form = form;
    }
    public String getForm() {
        return form;
    }
    public void setGamePlan(GamePlan gamePlan) {
        this.gamePlan = gamePlan;
    }
}
