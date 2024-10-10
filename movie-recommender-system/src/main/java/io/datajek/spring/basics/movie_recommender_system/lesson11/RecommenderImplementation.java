package io.datajek.spring.basics.movie_recommender_system.lesson11;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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
}
