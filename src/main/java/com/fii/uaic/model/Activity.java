package com.fii.uaic.model;

import javax.persistence.*;

/**
 * Created by sscutaru on 1/25/2017.
 */

@Entity
@Table(name="activity")
public class Activity {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  private Long activity_id;
  private java.sql.Date activity_timestamp;
  private Long activity_streak;
  private Long activity_props;
  private Long user_id;
  private Long habit_id;
  private String activity_note;

  public Long getActivity_id() {
    return activity_id;
  }

  public void setActivity_id(Long activity_id) {
    this.activity_id = activity_id;
  }

  public java.sql.Date getActivity_timestamp() {
    return activity_timestamp;
  }

  public void setActivity_timestamp(java.sql.Date activity_timestamp) {
    this.activity_timestamp = activity_timestamp;
  }

  public Long getActivity_streak() {
    return activity_streak;
  }

  public void setActivity_streak(Long activity_streak) {
    this.activity_streak = activity_streak;
  }

  public Long getActivity_props() {
    return activity_props;
  }

  public void setActivity_props(Long activity_props) {
    this.activity_props = activity_props;
  }

  public Long getUser_id() {
    return user_id;
  }

  public void setUser_id(Long user_id) {
    this.user_id = user_id;
  }

  public Long getHabit_id() {
    return habit_id;
  }

  public void setHabit_id(Long habit_id) {
    this.habit_id = habit_id;
  }

  public String getActivity_note() {
    return activity_note;
  }

  public void setActivity_note(String activity_note) {
    this.activity_note = activity_note;
  }
}
