package JavaStreams;

import java.util.Random;

public record Seat(char rowMarker, int seatNumber, double price, boolean isReserved) {

    public Seat(char rowMarker, int seatNumber) {
        Random random = new Random();
        boolean isReserved = random.nextInt(0,2) == 1;

        this(rowMarker, seatNumber,
                rowMarker > 'C' && (seatNumber <= 2 || seatNumber >= 9) ? 50 : 75, isReserved);
    }

    @Override
    public String toString() {
        return "%c%03d %.0f".formatted(rowMarker, seatNumber, price);
    }
}

