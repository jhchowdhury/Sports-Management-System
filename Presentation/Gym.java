import Presentation.*;

public abstract class Gym implements FacilitySystem {
    private String gymName;

    public Gym() {
        gymName = "";
    }
    public Gym(String gymName) {
        this.gymName = gymName;
    }
    public void setGymName(String gymName) {
        this.gymName = gymName;
    }
    public String getGymName() {
        return gymName;
    }
}
