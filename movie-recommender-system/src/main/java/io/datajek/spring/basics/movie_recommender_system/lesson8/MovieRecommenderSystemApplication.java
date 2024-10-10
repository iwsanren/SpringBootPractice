package io.datajek.spring.basics.movie_recommender_system.lesson8;

import io.datajek.spring.basics.movie_recommender_system.lesson6.RecommenderImplementation2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class MovieRecommenderSystemApplication {
	public static void main(String[] args) {
		ApplicationContext appContext = SpringApplication.run(MovieRecommenderSystemApplication.class,args);
//
//		System.out.println("Test for Singleton scope");
//
//		ContentBasedFilter cbf1 = appContext.getBean(ContentBasedFilter.class);
//		ContentBasedFilter cbf2 = appContext.getBean(ContentBasedFilter.class);
//		ContentBasedFilter cbf3 = appContext.getBean(ContentBasedFilter.class);
//
//		String[] result1 = cbf1.getRecommendations("Finding Dory");
//		String[] result2 = cbf2.getRecommendations("Finding Dory");
//		String[] result3 = cbf3.getRecommendations("Finding Dory");
//		System.out.println(cbf1);
//		System.out.println(cbf2);
//		System.out.println(cbf3);
//		System.out.println(Arrays.toString(result1));
//		System.out.println(Arrays.toString(result2));
//		System.out.println(Arrays.toString(result3));
//
//		System.out.println("test for prototype scope");
//		CollaborativeFilter cf1 = appContext.getBean(CollaborativeFilter.class);
//		CollaborativeFilter cf2 = appContext.getBean(CollaborativeFilter.class);
//		CollaborativeFilter cf3 = appContext.getBean(CollaborativeFilter.class);
//
//		System.out.println(cf1);
//		System.out.println(cf2);
//		System.out.println(cf3);
//
//		String[] result4 = cf1.getRecommendations("Finding Dory");
//		String[] result5 = cf2.getRecommendations("Finding Dory");
//		String[] result6 = cf3.getRecommendations("Finding Dory");
//
//		System.out.println(Arrays.toString(result4));
//		System.out.println(Arrays.toString(result5));
//		System.out.println(Arrays.toString(result6));

	}

}
