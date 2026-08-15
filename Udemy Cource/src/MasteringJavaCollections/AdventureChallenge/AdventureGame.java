package MasteringJavaCollections.AdventureChallenge;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class AdventureGame {

    private static final String DEFAULT_MAP_DATA = """
            road,at the end of the road, W: hill, E:well house,S:valley,N:forest
            hill,on top of hill with a view in all directions,N:forest, E:road
            well house,inside a well house for a small spring,W:road,N:lake,S:stream
            valley,in a forest valley beside a tumbling stream,N:road,W:hill,E:stream
            forest,at the edge of a thick dark forest,S:road,E:lake
            lake,by an alpine lake surrounded by wildflowers,W:forest,S:well house
            stream,near a stream with a rocky bed,W:valley, N:well house
            """;

    private enum Heading {
        E("East"), N("North"), S("South"), W("West");

        private final String fullText;

        Heading(String fullText) {
            this.fullText = fullText;
        }

        public String getFullText() {
            return fullText;
        }
    }

    private record Scene(String description, Map<Heading, String> exits) {}

    private String currentPosition;
    private final Map<String, Scene> worldMap = new HashMap<>();

    public AdventureGame() {
        this(null);
    }

    public AdventureGame(String overrideData) {
        buildMap(DEFAULT_MAP_DATA);
        if (overrideData != null) {
            buildMap(overrideData);
        }
    }

    private void buildMap(String dataSource) {
        dataSource.lines()
                .map(String::trim)
                .filter(line -> !line.isEmpty())
                .forEach(line -> {
                    String[] segments = line.split(",", 3);
                    String name = segments[0].trim();
                    String desc = segments[1].trim();
                    Map<Heading, String> exits = parseExits(segments[2]);
                    worldMap.put(name, new Scene(desc, exits));
                });
    }

    private Map<Heading, String> parseExits(String exitString) {
        return Arrays.stream(exitString.split(","))
                .map(String::trim)
                .map(pair -> pair.split(":"))
                .collect(Collectors.toMap(
                        tokens -> Heading.valueOf(tokens[0].trim()),
                        tokens -> tokens[1].trim(),
                        (oldVal, newVal) -> newVal,
                        () -> new EnumMap<>(Heading.class)
                ));
    }

    private void describeScene(Scene scene) {
        System.out.printf("*** You're standing %s *** %n", scene.description());
        System.out.println("\tFrom here, you can see:");

        scene.exits().forEach((heading, destination) ->
                System.out.printf("\t• A %s to the %s (%s) %n", destination, heading.getFullText(), heading.name())
        );
        System.out.print("Select Your Compass (Q to quit) >> ");
    }

    public void move(String directionInput) {
        var activeExits = worldMap.get(currentPosition).exits();

        try {
            Heading heading = Heading.valueOf(directionInput.toUpperCase().trim());
            String nextDestination = activeExits.get(heading);

            if (nextDestination != null) {
                play(nextDestination);
            } else {
                System.out.println("!! Invalid direction, try again!!");
            }
        } catch (IllegalArgumentException | NullPointerException e) {
            System.out.println("!! Invalid direction, try again!!");
        }
    }

    public void play(String targetLocation) {
        Scene nextScene = worldMap.get(targetLocation);

        if (nextScene != null) {
            currentPosition = targetLocation;
            describeScene(nextScene);
        } else {
            System.out.println(targetLocation + " is an invalid location");
        }
    }
}