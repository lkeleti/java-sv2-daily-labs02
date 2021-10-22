package day05;

import java.util.ArrayList;
import java.util.List;

public class Movie {
    private String title;
    private int creationYear;
    private double averageRating;
    private List<Integer> ratings = new ArrayList<>();

    public Movie(String title, int creationYear) {
        this.title = title;
        this.creationYear = creationYear;
    }

    private void calcAverageRating() {
        int sumOfRating = 0;
        for (int item: ratings) {
            sumOfRating += item;
        }
        averageRating = (double)sumOfRating /ratings.size();
    }
    public double rateing(int rateValue) {
        ratings.add(rateValue);
        calcAverageRating();
        return averageRating;
    }

    public String getTitle() {
        return title;
    }

    public double getAverageRating() {
        return averageRating;
    }

    public int getVoterNumber() {
        return ratings.size();
    }
}
