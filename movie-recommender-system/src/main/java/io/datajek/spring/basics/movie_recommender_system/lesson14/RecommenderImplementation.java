package io.datajek.spring.basics.movie_recommender_system.lesson14;

import org.springframework.beans.factory.annotation.Autowired;

public class RecommenderImplementation {
    @Autowired
    private Filter filter;

    public void setFilter(Filter filter) {
        this.filter = filter;
    }

    public Filter getFilter() {
        return filter;
    }


    public RecommenderImplementation() {
    }

    public RecommenderImplementation(Filter filter) {
        this.filter = filter;
    }

    //use a filter to find recommendations
    public String [] recommendMovies (String movie) {

        //print the name of interface implementation being used
        System.out.println("\nName of the filter in use: " + filter + "\n");

        String[] results = filter.getRecommendations("Finding Dory");

        return results;
    }
}
