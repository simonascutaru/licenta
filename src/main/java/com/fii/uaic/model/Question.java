package com.fii.uaic.model;

import javax.persistence.*;

/**
 * Created by sscutaru on 1/25/2017.
 */

@Entity
@Table(name="question")
public class Question {
  private Long question_id;
  private String question_title;
  private String question_body;
  private Long user_id;

  public Long getQuestion_id() {
    return question_id;
  }

  public void setQuestion_id(Long question_id) {
    this.question_id = question_id;
  }

  public String getQuestion_title() {
    return question_title;
  }

  public void setQuestion_title(String question_title) {
    this.question_title = question_title;
  }

  public String getQuestion_body() {
    return question_body;
  }

  public void setQuestion_body(String question_body) {
    this.question_body = question_body;
  }

  public Long getUser_id() {
    return user_id;
  }

  public void setUser_id(Long user_id) {
    this.user_id = user_id;
  }
}
