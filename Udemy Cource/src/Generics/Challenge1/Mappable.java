package Generics.Challenge1;

import java.util.Arrays;

public interface Mappable {
    void render();

    static double[] stringToLatLon(String location) {
        var splits = location.split(",");
        double lat = Double.valueOf(splits[0]);
        double lng = Double.valueOf(splits[1]);
        return  new double[]{lat, lng};
    }
}

abstract class Point implements Mappable {

    private double[] location = new double[2];

    public Point(String location) {
        this.location = Mappable.stringToLatLon(location);
    }

    @Override
    public void render() {
        System.out.println("Render " + this + "as POINT (" + location() + ")");
    }

    private  String location() {
        return Arrays.toString(location);
    }
}

abstract class Line implements Mappable {

    private double[][] location;

    public Line(String... locations) {
        this.location = new double[locations.length][];
        int index = 0;
        for (var l : locations) {
            this.location[index++] = Mappable.stringToLatLon(l);
        }
    }

    @Override
    public void render() {
        System.out.println("Render " + this + "as POINT (" + locations() + ")");
    }

    private  String locations() {
        return Arrays.deepToString(location);
    }
}