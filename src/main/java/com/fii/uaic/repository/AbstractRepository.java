package com.fii.uaic.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Simona on 05.03.2017.
 */

@Transactional
@EnableTransactionManagement
public abstract class AbstractRepository<E>{

    @PersistenceContext
    private EntityManager em;

    private final Class<E> entityClass;

    protected AbstractRepository(final Class<E> entityClass) {
        this.entityClass = entityClass;
    }

    @Transactional
    public EntityManager em() {
        return em;
    }

    @Transactional
    public E getById(final Integer entityId) {
        return em.find(entityClass, entityId);
    }

    @Transactional
    public void save(final E entityToBeSaved) {
        em.persist(entityToBeSaved);
    }

    @Transactional
    public void update(final E entityToBeUpdated) {
        em.merge(entityToBeUpdated);
    }

    @Transactional
    public void remove(final E entityToBeRemoved) {
        em.remove(entityToBeRemoved);
    }

    @Transactional
    public void delete(final Integer id) {
        em.remove(getById(id));
    }

    @Transactional
    public List<E> getAll() {
            return null;
        }
}
