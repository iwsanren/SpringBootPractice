package io.datajek.spring.basics.movie_recommender_system.lesson6;

public interface Filter {
    public String[] getRecommendations(String movie);
}
