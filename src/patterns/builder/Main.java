package patterns.builder;

import patterns.builder.aircraft.Aircraft;
import patterns.builder.builders.AircraftBuilder;
import patterns.builder.builders.F16AircraftBuilder;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        AircraftBuilder aircraftBuilder = new F16AircraftBuilder();
        aircraftBuilder.buildEngine("6-stroke diesel engine");
        aircraftBuilder.buildBody("rigid body");
        aircraftBuilder.buildCockpit("solid glass rigid cockpit");
        aircraftBuilder.buildSeats("upright seats");
        aircraftBuilder.buildWings("small and rigid wings");

        Aircraft aircraft = aircraftBuilder.getAircraft();
        System.out.println(aircraft.toString());
    }
}