package com.fii.uaic.model;

import javax.persistence.*;

/**
 * Created by sscutaru on 1/25/2017.
 */

@Entity
@Table(name="prop")
public class Prop {
  private Long prop_id;
  private Long prop_no;
  private Long user_id;
  private Long activity_id;

  public Long getProp_id() {
    return prop_id;
  }

  public void setProp_id(Long prop_id) {
    this.prop_id = prop_id;
  }

  public Long getProp_no() {
    return prop_no;
  }

  public void setProp_no(Long prop_no) {
    this.prop_no = prop_no;
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
