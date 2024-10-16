package io.datajek.spring.basics.movie_recommender_system.lesson12;

import org.springframework.beans.factory.annotation.Qualifier;

import javax.inject.Named;

@Named
@Qualifier("CF")
public class CollaborativeFilter implements Filter {
    public String[] getRecommendations(String movie) {
        //logic of collaborative filter
        return new String[] {"Finding Nemo", "Ice Age", "Toy Story"};
    }
}
