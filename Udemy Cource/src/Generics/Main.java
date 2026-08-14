package Generics;

interface Player {
    String name();
}

record BaseballPlayer(String name, String position) implements Player {}

record FootballPlayer(String name, String position) implements Player {}

record VolleyballPlayer(String name, String position) implements Player {}

public class Main {

    public static void main(String[] args) {
        var philly = new Affilation("city", "Philadelphia PA", "US");

        BaseballTeam phillies1 = new BaseballTeam("Philadelphia Phillies");
        BaseballTeam astros1 = new BaseballTeam("Houston Astros");
        scoreResult(phillies1, 3, astros1, 5);

        SportsTeam phillies = new SportsTeam("Philadelphia Phillies");
        SportsTeam astros = new SportsTeam("Houston Astros");

        Team<BaseballPlayer, Affilation> phillies2 = new Team<>("Philadelphia Phillies2", philly);
        Team<BaseballPlayer, Affilation> astros2 = new Team<>("Houston Astros2");

        scoreResult(phillies2, 2, astros2, 5);
        phillies2.listTeamMembers();

        var harper = new BaseballPlayer("B Harper", "Right Fielder");
        var marsh = new BaseballPlayer("B Marsh", "Right Fielder");
        phillies.addTeamMember(harper);
        phillies.addTeamMember(marsh);

        var guthrie = new BaseballPlayer("D Guthrie", "Center Fielder");
        phillies.addTeamMember(guthrie);
        phillies.listTeamMembers();

        SportsTeam afc1 = new SportsTeam("Adelaide Crows");
        Team<FootballPlayer, Affilation> afc = new Team<>("Adelaide Crows");
        var tex = new FootballPlayer("Tex Walker", "Center half forward");
        afc.addTeamMember(tex);

        var rory = new FootballPlayer("Rory Laird", "Midfield");
        afc.addTeamMember(rory);

        afc.listTeamMembers();

//        Team<String> adelaide = new Team<>("Adelide storm");
//        adelaide.addTeamMember("N Roberts");
//        adelaide.listTeamMembers();
//
//        var canberra = new Team<String>("Canberra Heat");
//        canberra.addTeamMember("B Black");
//        canberra.listTeamMembers();
//        scoreResult(canberra, 0, adelaide, 1);
//
//        Team<Integer> melbourneVB = new Team<>("Melbourne Vipers");
//        when we type (T extends Player) in Team.java file it trows an error due to String and Integer not being the same type: T is subtype of Player

        Team<VolleyballPlayer, Affilation> adelaide = new Team<>("Adelaide Storm");
        adelaide.addTeamMember(new VolleyballPlayer("N Roberts", "Setter"));
        adelaide.listTeamMembers();

        var canberra = new Team<VolleyballPlayer, Affilation>("Canberra Heat");
        canberra.addTeamMember(new VolleyballPlayer("B Black", "Opposite"));
        canberra.listTeamMembers();

        scoreResult(canberra, 0, adelaide, 1);
    }

    public static void scoreResult(BaseballTeam baseballTeam1, int t1_score,
                                   BaseballTeam baseballTeam2, int t2_score) {
        String message = baseballTeam1.getScore(t1_score, t2_score);
        baseballTeam2.getScore(t2_score, t1_score);
        System.out.printf("%s %s %s %n", baseballTeam1, message, baseballTeam2);

    }

    public static void scoreResult(SportsTeam baseballTeam1, int t1_score,
                                   SportsTeam baseballTeam2, int t2_score) {
        String message = baseballTeam1.getScore(t1_score, t2_score);
        baseballTeam2.getScore(t2_score, t1_score);
        System.out.printf("%s %s %s %n", baseballTeam1, message, baseballTeam2);

    }

    public static void scoreResult(Team Team1, int t1_score,
                                   Team Team2, int t2_score) {
        String message = Team1.getScore(t1_score, t2_score);
        Team2.getScore(t2_score, t1_score);
        System.out.printf("%s %s %s %n",Team1, message, Team2);

    }
}
