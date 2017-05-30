package com.fii.uaic.model;

import javax.persistence.*;

/**
 * Created by sscutaru on 1/25/2017.
 */

@Entity
@Table(name="comment")
public class Comment {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  private Long comment_id;
  private String comment_body;
  private Long user_id;
  private Long activity_id;

  public Comment() {}
  public Comment(String comment_body, Long user_id, Long activity_id) {
    this.comment_body = comment_body;
    this.user_id = user_id;
    this.activity_id = activity_id;
  }

  public Long getComment_id() {
    return comment_id;
  }

  public void setComment_id(Long comment_id) {
    this.comment_id = comment_id;
  }

  public String getComment_body() {
    return comment_body;
  }

  public void setComment_body(String comment_body) {
    this.comment_body = comment_body;
  }

  public Long getUser_id() {
    return user_id;
  }

  public void setUser_id(Long user_id) {
    this.user_id = user_id;
  }

  public Long getActivity_id() {
    return activity_id;
  }

  public void setActivity_id(Long activity_id) {
    this.activity_id = activity_id;
  }
}
