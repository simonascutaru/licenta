package com.fii.uaic.model;

import javax.persistence.*;
import java.util.List;

import static com.fii.uaic.model.Category.GET_ALL_CATEGORIES;

/**
 * Created by sscutaru on 1/25/2017.
 */

@Entity
@Table(name="category")
@NamedQueries({
        @NamedQuery(name = Category.GET_ALL_CATEGORIES, query = "SELECT c FROM Category c")
})
public class Category {

  public static final String GET_ALL_CATEGORIES = "Category.GET_ALL_CATEGORIES";

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "category_id")
  private Long categoryId;

  @Column(name = "category_name")
  private String category_name;

  @OneToMany(mappedBy="category")
  private List<Habit> habits;

  public Category(String category_name, List<Habit> habits) {
    this.category_name = category_name;
    this.habits = habits;
  }

  public Long getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(Long categoryId) {
    this.categoryId = categoryId;
  }

  public String getCategory_name() {
    return category_name;
  }

  public void setCategory_name(String category_name) {
    this.category_name = category_name;
  }

  public List<Habit> getHabits() {
    return habits;
  }

  public void setHabits(List<Habit> habits) {
    this.habits = habits;
  }
}
