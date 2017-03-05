package com.fii.uaic.controller;

import com.fii.uaic.model.Category;
import com.fii.uaic.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Simona on 05.03.2017.
 */
@RestController
@RequestMapping("/api/category")
public class CategoryController {

        @Autowired
        private CategoryService catService;

        @RequestMapping(method = RequestMethod.GET)
        public List<Category> getAll() {
            return catService.getAll();
        }

        @RequestMapping(method = RequestMethod.POST)
        public ResponseEntity<Category> save(@RequestBody Category cat) {
            return new ResponseEntity<Category>(catService.save(cat), HttpStatus.CREATED);
        }
}