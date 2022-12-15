package com.example.demo.dao;

import com.example.demo.domain.Curso;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;


public class CursoDao implements ICursoDao{
    @Override
    public Curso cadastrar(Curso curso) {
        EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory("ExemploJPA");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        entityManager.persist(curso);
        entityManager.getTransaction().commit();        // faz o insert

        entityManager.close();
        entityManagerFactory.close();

        return curso;
    }
}
