import Presentation.*;

interface FacilitySystem {
    public String[] events;
    public void cleanFacility();
    public void prepareBeforeEvent();
    public void prepareAfterEvent();
    public void scheduleEvent();
}
