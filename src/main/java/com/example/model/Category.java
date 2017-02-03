package com.example.model;

import javax.persistence.*;

/**
 * Created by sscutaru on 1/25/2017.
 */

@Entity
@Table(name="category")
public class Category {
  private Long category_id;
  private String category_name;

  public Long getCategory_id() {
    return category_id;
  }

  public void setCategory_id(Long category_id) {
    this.category_id = category_id;
  }

  public String getCategory_name() {
    return category_name;
  }

  public void setCategory_name(String category_name) {
    this.category_name = category_name;
  }
}
