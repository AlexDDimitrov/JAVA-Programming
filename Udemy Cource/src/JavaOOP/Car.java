package JavaOOP;

public class Car {

    private String make;
    private String model;
    private String color;
    private int doors;
    private boolean isConvertable;

    Car() {

    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConvertable() {
        return isConvertable;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setConvertable(boolean convertable) {
        isConvertable = convertable;
    }

    public void describeCar() {
        System.out.println(doors + "-Door " +
                color + " " + make + " " + model + " " +
                (isConvertable ? "Convertable" : ""));
    }
}
