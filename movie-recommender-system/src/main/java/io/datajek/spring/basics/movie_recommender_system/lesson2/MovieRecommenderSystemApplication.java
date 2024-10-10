package io.datajek.spring.basics.movie_recommender_system.lesson2;

import java.util.Arrays;

public class MovieRecommenderSystemApplication {
	public static void main(String[] args) {
		//loosely coupled
		RecommenderImplementation recommender = new RecommenderImplementation(new CollaborativeFilter());
		String[] results = recommender.recommendMovies("Dear");
		System.out.println(Arrays.toString(results));
	}
}
