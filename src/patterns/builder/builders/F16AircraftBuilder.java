package patterns.builder.builders;

import patterns.builder.aircraft.Aircraft;
import patterns.builder.aircraft.F16Aircraft;

public class F16AircraftBuilder implements AircraftBuilder{

    private final Aircraft aircraft;

    public F16AircraftBuilder() {
        aircraft = new F16Aircraft();
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
