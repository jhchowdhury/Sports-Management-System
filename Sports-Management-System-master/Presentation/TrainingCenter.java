import Presentation.*;

public class TrainingCenter extends FacilitySystem {

    @Override
    String scheduleEvent() {
        return "Event scheduled for TrainingCenter!";

    }

    @Override
    String cleanFacility() {
        return "Facility cleaned for TrainingCenter!";
    }

    @Override
    String prepareBeforeEvent() {
        return "Event prepared before for TrainingCenter!";
    }

    @Override
    String maintainenceDuringEvenet() {
        return "Maintainence during event for TrainingCenter!";
    }

    @Override
    String prepareAfterEvent() {
        return "Event prepared after for TrainingCenter!";
    }

}