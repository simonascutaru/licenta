package com.fii.uaic.service;

import com.fii.uaic.model.Category;
import com.fii.uaic.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Simona on 05.03.2017.
 */
@Service
@Transactional
public class CategoryService {

    @Autowired
    private CategoryRepository catRepo;

    public Category save(Category cat){
        catRepo.save(cat);
        return cat;
    }

    public List<Category> getAll() {
        ArrayList<Category> categories =  (ArrayList<Category>) catRepo.getAll();

        return categories;
    }
}
