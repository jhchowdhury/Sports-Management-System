import Presentation.*;

public abstract class TrainingCenter implements FacilitySystem {

    private String centerName;

    public TrainingCenter() {
        centerName = "";
    }
    public TrainingCenter(String centerName) {
        this.centerName = centerName;
    }
    public void setCenterName(String centerName) {
        this.centerName = centerName;
    } 
    public String getCenterName() {
        return centerName;
    }
}
