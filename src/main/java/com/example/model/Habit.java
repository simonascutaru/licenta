package com.example.model;

import javax.persistence.*;

/**
 * Created by sscutaru on 1/25/2017.
 */

@Entity
@Table(name="habit")
public class Habit {
  private Long habit_id;
  private String habit_name;
  private Long category_id;

  public Long getHabit_id() {
    return habit_id;
  }

  public void setHabit_id(Long habit_id) {
    this.habit_id = habit_id;
  }

  public String getHabit_name() {
    return habit_name;
  }

  public void setHabit_name(String habit_name) {
    this.habit_name = habit_name;
  }

  public Long getCategory_id() {
    return category_id;
  }

  public void setCategory_id(Long category_id) {
    this.category_id = category_id;
  }
}
