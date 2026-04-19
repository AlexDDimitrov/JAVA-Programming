package Enum;

public enum Day {

    SUNDAY(1), MONDAY(2), TUESDAY(3), WEDNESDAY(4), THURSDAY(5), FRIDAY(6), SATURDAY(7);

    private final int dayNumber;

    Day(int i) {
        this.dayNumber = i;
    }

    public int getDayNumber() {
        return this.dayNumber;
    }
}
