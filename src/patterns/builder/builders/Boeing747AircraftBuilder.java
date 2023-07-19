package patterns.builder.builders;

import patterns.builder.aircraft.Aircraft;
import patterns.builder.aircraft.Boeing747Aircraft;

public class Boeing747AircraftBuilder implements AircraftBuilder{

    private final Aircraft aircraft;

    public Boeing747AircraftBuilder() {
        aircraft = new Boeing747Aircraft();
    }

    @Override
    public void buildEngine(String engine) {
        aircraft.setEngine(engine);
    }

    @Override
    public void buildWings(String wings) {
        aircraft.setWings(wings);
    }

    @Override
    public void buildCockpit(String cockpit) {
        aircraft.setCockpit(cockpit);
    }

    @Override
    public void buildBathroom(String bathroom) {
        aircraft.setBathroom(bathroom);
    }

    @Override
    public void buildSeats(String seats) {
        aircraft.setSeats(seats);
    }

    @Override
    public void buildBody(String body) {
        aircraft.setBody(body);
    }

    @Override
    public Aircraft getAircraft() {
        return aircraft;
    }
}
