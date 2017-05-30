package com.fii.uaic.model;

import javax.persistence.*;

/**
 * Created by sscutaru on 1/25/2017.
 */

@Entity
@Table(name="habit")
public class Habit {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "habit_id")
  private Long habitId;

  @Column (name = "habit_name")
  private String habitName;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name="category_id")
  private Category category;

  public Habit() {}

  public Habit(String habitName, Category category) {
    this.habitName = habitName;
    this.category = category;
  }

  public Long getHabitId() {
    return habitId;
  }

  public void setHabitId(Long habitId) {
    this.habitId = habitId;
  }

  public String getHabitName() {
    return habitName;
  }

  public void setHabitName(String habitName) {
    this.habitName = habitName;
  }

  public Category getCategory() {
    return category;
  }

  public void setCategory(Category category) {
    this.category = category;
  }
}
