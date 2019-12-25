import Presentation.*;

public class Gym extends FacilitySystem {

    @Override
    String scheduleEvent() {
        return "Event scheduled for Gym!";

    }

    @Override
    String cleanFacility() {
        return "Facility cleaned for Gym!";
    }

    @Override
    String prepareBeforeEvent() {
        return "Event prepared before for Gym!";
    }

    @Override
    String maintainenceDuringEvenet() {
        return "Maintainence during event for Gym!";
    }

    @Override
    String prepareAfterEvent() {
        return "Event prepared after for Gym!";
    }

}