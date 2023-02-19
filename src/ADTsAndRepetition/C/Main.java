package ADTsAndRepetition.C;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Article mandag = new Article("Hans Christian Hansen", "Mandag");
        Article tirsdag = new Article("Hans Christian Hansen", "tirsdag");
        Article onsdag = new Article("Hans Christian Hansen", "onsdag");
        Article torsdag = new Article("Hans Christian Hansen", "torsdag");
        Article fredag = new Article("Hans Christian Hansen", "fredag");

        ArrayList<Article> articles = new ArrayList<>();

        articles.add(mandag);
        articles.add(tirsdag);
        articles.add(onsdag);
        articles.add(torsdag);
        articles.add(fredag);

        System.out.println(articles);

    }
}
