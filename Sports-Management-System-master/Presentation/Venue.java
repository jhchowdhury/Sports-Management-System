import Presentation.*;

public class Venue extends FacilitySystem {

    @Override
    String scheduleEvent() {
        return "Event scheduled for Venue!";

    }

    @Override
    String cleanFacility() {
        return "Facility cleaned for Venue!";
    }

    @Override
    String prepareBeforeEvent() {
        return "Event prepared before for Venue!";
    }

    @Override
    String maintainenceDuringEvenet() {
        return "Maintainence during event for Venue!";
    }

    @Override
    String prepareAfterEvent() {
        return "Event prepared after for Venue!";
    }

}