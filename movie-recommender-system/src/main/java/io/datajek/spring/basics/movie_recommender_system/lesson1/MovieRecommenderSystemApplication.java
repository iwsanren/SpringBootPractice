package io.datajek.spring.basics.movie_recommender_system.lesson1;

import io.datajek.spring.basics.movie_recommender_system.lesson2.RecommenderImplementation;

import java.util.Arrays;


public class MovieRecommenderSystemApplication {
	public static void main(String[] args) {
		//create object of RecommenderImplementation class
		RecommenderImplementation recommender = new RecommenderImplementation();
		//call method to get recommendations
		String[] result = recommender.recommendMovies("Finding Dory");
		//display results
		System.out.println(Arrays.toString(result));

		//SpringApplication.run(MovieRecommenderSystemApplication.class, args);
	}
}
