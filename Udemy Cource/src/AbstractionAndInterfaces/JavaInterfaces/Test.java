package AbstractionAndInterfaces.JavaInterfaces;

public class Test {
    static void main(String[] args) {
        //inFlight(new Jet());
//        OrbitEarth.log("Testing " + new Satellite());

        orbit(new Satellite());
    }

    private static void inFlight(FlightEnabled flightEnabled) {
        flightEnabled.takeOff();
        FlightStages stages = FlightStages.CRUISE;
        for (int i = 0; i <= 7; i++) {
            stages = flightEnabled.transition(stages);
        }
        flightEnabled.fly();
        if (flightEnabled instanceof Trackable trackable) {
            trackable.track();
        }
        flightEnabled.land();
    }

    private static void orbit(OrbitEarth flier) {
        flier.takeOff();
        flier.fly();
        flier.land();
    }
}
