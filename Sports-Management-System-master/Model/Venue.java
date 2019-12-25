import Presentation.*;

public abstract class Venue implements FacilitySystem {

    private String venueName;

    public Venue() {
        venueName = "";
    }
    public Venue(String venueName) {
        this.venueName = venueName;
    }
    public void setVenueName(String venueName) {
        this.venueName = venueName;
    }
    public String getVenueName() {
        return venueName;
    }
}
