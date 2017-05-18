package com.fii.uaic.model;

import javax.persistence.*;

/**
 * Created by sscutaru on 1/25/2017.
 */


@Table(name="answer")
public class Answer {
  private String answer_text;
  private Long user_id;
  private Long question_id;

  public String getAnswer_text() {
    return answer_text;
  }

  public void setAnswer_text(String answer_text) {
    this.answer_text = answer_text;
  }

  public Long getUser_id() {
    return user_id;
  }

  public void setUser_id(Long user_id) {
    this.user_id = user_id;
  }

  public Long getQuestion_id() {
    return question_id;
  }

  public void setQuestion_id(Long question_id) {
    this.question_id = question_id;
  }
}
