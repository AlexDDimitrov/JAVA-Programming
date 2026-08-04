package AbstractionAndInterfaces.MappableOutput;

public interface Mappable {
    String JSON_PROPERTY = """
            "properties:" {%s}""";

    default String toJSON() {

        return """
                "type": "%s", "label": "%s", "marker": "%s"\s""".formatted(getShape(), getLabel(), getMarker());
    }

    static void mapIt(Mappable mappable) {
        System.out.printf((JSON_PROPERTY) + "%n", mappable.toJSON());
    }

    String getLabel();
    String getMarker();
    Geometry getShape();
}
