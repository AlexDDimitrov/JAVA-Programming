package AdvancedOOP;

public class AdvancedCasting {
    public static void main(String[] args) {

        Movie movie = Movie.getMovie("A", "Jaws");
        movie.watchMovie();

        Adventure jaws = (Adventure) Movie.getMovie("A", "Jaws");
        jaws.watchMovie();

        Object comedy = Movie.getMovie("C", "Airplane");
        Comedy comedyMovie = (Comedy) comedy;
        comedyMovie.watchComedy();

        var airplane = Movie.getMovie("C", "Airplane");
        airplane.watchMovie();

        var plane = new Comedy("Airplane");
        plane.watchComedy();

        var a = 3;
        a++;
        System.out.println(a);

        var b = new Double(3.2);
        b++;
        System.out.println(b);

        Object unknown = Movie.getMovie("s", "Airplane");
        if(unknown.getClass().getSimpleName().equals("Comedy")) {
            Comedy c = (Comedy) unknown;
            c.watchComedy();
        } else if (unknown instanceof Adventure) {
            ((Adventure) unknown).watchAdventure();
        } else if (unknown instanceof ScienceFiction syfy) {
            syfy.watchScienceFiction();
        }


    }
}
