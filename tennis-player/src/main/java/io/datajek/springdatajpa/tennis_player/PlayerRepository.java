package io.datajek.springdatajpa.tennis_player;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public class PlayerRepository {
    @PersistenceContext
    EntityManager entityManager;
    //merge()
    public Player insertPlayer(Player player){
        return entityManager.merge(player);
    }
    public Player updatePlayer(Player player){
        return entityManager.merge(player);
    }
    //find()
    public Player getPlayerById(int id) {
        return entityManager.find(Player.class, id);
    }

    //remove()
    public void deletePlayerById(int id){
        Player player = entityManager.find(Player.class,id);
        entityManager.remove(player);
    }

    //getResultList()
    public List<Player> getAllPlayers(){
        TypedQuery<Player> getAll = entityManager.createNamedQuery("get_all_players", Player.class);
        return getAll.getResultList();
    }


}
