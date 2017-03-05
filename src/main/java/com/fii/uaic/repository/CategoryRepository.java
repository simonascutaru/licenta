package com.fii.uaic.repository;

import com.fii.uaic.model.Category;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Simona on 05.03.2017.
 */
@Repository
@Transactional
public class CategoryRepository extends AbstractRepository<Category>{

        protected CategoryRepository() {super(Category.class);}
        public List<Category> getAll() {
            return em().createNamedQuery(Category.GET_ALL_CATEGORIES).getResultList();
        }

}
