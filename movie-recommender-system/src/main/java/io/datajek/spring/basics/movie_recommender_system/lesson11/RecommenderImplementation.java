package io.datajek.spring.basics.movie_recommender_system.lesson11;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import org.slf4j.Logger;
@Component
public class RecommenderImplementation {
    private Logger logger = LoggerFactory.getLogger((this.getClass()));

    private Filter filter;

    @Autowired
    public void setFilter(Filter filter) {
        logger.info("In RecommenderImplementation setter method..dependency injection");
        this.filter = filter;
    }


    @PostConstruct
    public void postConstruct() {
        //initialization code goes here
        logger.info("In RecommenderImplementation postConstruct method");
    }

    @PreDestroy
    private void preDestroy() {
        //clear movies from cache
        logger.info("In ContentBasedFilter preDestroy method");
    }
    //getRecommendations takes a movie as input and returns a list of similar movies
    public String[] getRecommendations(String movie) {

        //calculate similarity between movies

        //return movie recommendations
        return new String[] {"Happy Feet", "Ice Age", "Shark Tale"};
    }
}
