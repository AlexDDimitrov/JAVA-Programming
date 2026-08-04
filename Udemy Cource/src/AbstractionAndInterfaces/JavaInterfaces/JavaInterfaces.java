package AbstractionAndInterfaces.JavaInterfaces;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class JavaInterfaces {
    static void main(String[] args) {
        Bird bird = new Bird();
        Animal animal = bird;
        FlightEnabled flightEnabled = bird;
        Trackable trackable = bird;

        animal.move();
//        bird.move();
        System.out.println();
//        flightEnabled.move();
//        trackable.move();
//                 ^ERROR^
        flightEnabled.takeOff();
        flightEnabled.fly();
        trackable.track();
        flightEnabled.land();

        inFlight(flightEnabled);

        Jet jet = new Jet();
        inFlight(jet);
        Truck truck = new Truck();
        truck.track();

        double kmst = 100;
        double milest = kmst * FlightEnabled.KM_TO_MILES;
        System.out.println(milest);

        LinkedList<FlightEnabled> fliers = new LinkedList<>();
        fliers.add(bird);


        List<FlightEnabled> betterFliers = new LinkedList<>();
        betterFliers.add(bird);

        triggerFliers(fliers);
        flyFliers(fliers);
        landFliers(fliers);

        triggerFliers(betterFliers);
        flyFliers(betterFliers);
        landFliers(betterFliers);
    }

    private static void inFlight(FlightEnabled flightEnabled) {
        flightEnabled.takeOff();
        flightEnabled.fly();
        if (flightEnabled instanceof Trackable trackable) {
            trackable.track();
        }
        flightEnabled.land();
    }

    private static  void triggerFliers(List<FlightEnabled> fliers) {
        for (var flier : fliers) {
            flier.takeOff();

        }
    }

    private static  void flyFliers(List<FlightEnabled> fliers) {
        for (var flier : fliers) {
            flier.fly();

        }
    }

    private static  void landFliers(List<FlightEnabled> fliers) {
        for (var flier : fliers) {
            flier.land();

        }
    }


}
