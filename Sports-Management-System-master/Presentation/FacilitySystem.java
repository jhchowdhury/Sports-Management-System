import Presentation.*;

interface FacilitySystem {
    abstract String[] events;

    abstract String cleanFacility();

    abstract String prepareBeforeEvent();

    abstract String maintainenceDuringEvenet();

    abstract String prepareAfterEvent();

    abstract String scheduleEvent();

    // Template method
    public final void getReadyForEvent(){
        scheduleEvent();
        cleanFacility();
        prepareBeforeEvent();
        maintainenceDuringEvenet();
        prepareAfterEvent();
    };
}
