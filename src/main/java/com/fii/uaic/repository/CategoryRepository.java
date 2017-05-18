package com.fii.uaic.repository;

import com.fii.uaic.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Simona on 05.03.2017.
 */
@Repository
@Transactional
public interface CategoryRepository extends JpaRepository<Category, Long> {

        List<Category> findAll();

}
