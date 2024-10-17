package io.datajek.springdatajpa.e_book;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
@Transactional
public class EbookRepository{
    @PersistenceContext
    EntityManager entityManager;

    public void deleteEbookById(int id){
        Ebook ebook = entityManager.find(Ebook.class,id);
        entityManager.remove(ebook);
    }

    public Ebook updateEbook(Ebook ebook){
        return entityManager.merge(ebook);
    }

    public Ebook insertEbook(Ebook ebook){
        return entityManager.merge(ebook);
    }

    public Ebook getEbookById(int id) {
        return entityManager.find(Ebook.class,id);
    }

    public List<Ebook> getAllEbooks() {
        TypedQuery<Ebook> getAll = entityManager.createNamedQuery("get_all_ebooks", Ebook.class);
        return getAll.getResultList();
    }


}
