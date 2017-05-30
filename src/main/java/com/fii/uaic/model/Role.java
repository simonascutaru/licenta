package com.fii.uaic.model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by sscutaru on 1/25/2017.
 */

@Entity
@Table(name="role")
public class Role {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "role_id")
  private Long roleId;

  @Column(name = "role_name")
  private String roleName;

  @OneToMany(mappedBy = "role")
  private List<User> users;

  public Role(){}

  public Role(String roleName, List<User> users) {
    this.roleName = roleName;
    this.users = users;
  }

  public Long getRoleId() {
    return roleId;
  }

  public void setRoleId(Long roleId) {
    this.roleId = roleId;
  }

  public String getRoleName() {
    return roleName;
  }

  public void setRoleName(String roleName) {
    this.roleName = roleName;
  }

  public List<User> getUsers() {
    return users;
  }

  public void setUsers(List<User> users) {
    this.users = users;
  }
}
