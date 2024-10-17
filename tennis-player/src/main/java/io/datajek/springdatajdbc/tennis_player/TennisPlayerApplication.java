package io.datajek.springdatajdbc.tennis_player;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Date;


@SpringBootApplication
public class TennisPlayerApplication implements CommandLineRunner {
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	PlayerDao dao;
	public static void main(String[] args) {
		SpringApplication.run(TennisPlayerApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
//		//2. insert a new player:
//		logger.info("Inserting Player 4: {}", dao.insertPlayer(new Player(4,"Thiem", "Austria",
//				new Date(System.currentTimeMillis()),17)));
//
//		//3. update a player:
//		logger.info("Updating Player with Id 4: {}", dao.updatePlayer(
//				new Player(4, "Thiem", "Austria",
//						new Date(93,9,3), 17)));
//		//4. delete a player:
//		logger.info("Deleting Player with Id 2: {}", dao.deletePlayer(2));
//
//		//1.1. get all players
//		logger.info("All Players Data: {}", dao.getAllPlayers());
//		//1.2 View player by Id:
//		logger.info("Players with Id 4: {}", dao.getPlayerById(4));

		//5. create a table
//		dao.createTournamentTable();

		//6. Using custom row mapper
		logger.info("French Players: {}", dao.getPlayerByNationality("France"));

	}





}
