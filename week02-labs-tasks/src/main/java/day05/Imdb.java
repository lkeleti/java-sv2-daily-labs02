package day05;

public class Imdb {
    public static void main(String[] args) {
        Viewer viewer = new Viewer();
        Movie titanic = new Movie("Titanic",1997);
        Movie transformers = new Movie("Transformers", 2007);

        viewer.watchMovie(titanic,5);
        viewer.watchMovie(titanic,5);
        viewer.watchMovie(titanic,5);
        viewer.watchMovie(titanic,4);
        viewer.watchMovie(titanic,4);
        viewer.watchMovie(transformers,5);
        viewer.watchMovie(transformers,3);

        System.out.printf("A(z) %s című filmre %d szavazat érkezett, ezek alapján az átlagos értékelés %.2f %n" ,
                titanic.getTitle(),titanic.getVoterNumber(),titanic.getAverageRating());

        System.out.printf("A(z) %s című filmre %d szavazat érkezett, ezek alapján az átlagos értékelés %.2f %n",
                transformers.getTitle(),transformers.getVoterNumber(),transformers.getAverageRating());
    }
}
