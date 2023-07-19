package patterns.builder.builders;

import patterns.builder.aircraft.Aircraft;

public interface AircraftBuilder {

    void buildEngine(String engine);

    void buildWings(String wings);

    void buildCockpit(String cockpit);

    void buildBathroom(String bathroom);

    void buildSeats(String seats);

    void buildBody(String body);

    Aircraft getAircraft();
}
