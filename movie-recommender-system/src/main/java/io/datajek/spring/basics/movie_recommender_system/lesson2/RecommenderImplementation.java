package io.datajek.spring.basics.movie_recommender_system.lesson2;

public class RecommenderImplementation {
    private Filter filter;

    public RecommenderImplementation(){}

    public RecommenderImplementation(Filter filter){
        super();
        this.filter = filter;
    }

    public String[] recommendMovies(String movie){
        System.out.println("Name of the filter in use is: "+ filter + "\n");
        String[] results = filter.getRecommendations(movie);
        return results;
    }
}
