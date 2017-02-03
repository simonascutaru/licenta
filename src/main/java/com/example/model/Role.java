package com.example.model;

import javax.persistence.*;

/**
 * Created by sscutaru on 1/25/2017.
 */

@Entity
@Table(name="role")
public class Role {
  private Long role_id;
  private Long role_name;

  public Long getRole_id() {
    return role_id;
  }

  public void setRole_id(Long role_id) {
    this.role_id = role_id;
  }

  public Long getRole_name() {
    return role_name;
  }

  public void setRole_name(Long role_name) {
    this.role_name = role_name;
  }
}
