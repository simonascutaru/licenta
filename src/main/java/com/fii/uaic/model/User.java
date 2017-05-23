package com.fii.uaic.model;

import javax.persistence.*;

/**
 * Created by sscutaru on 1/25/2017.
 */

@Entity
@Table(name="users")
@NamedQueries({
        @NamedQuery(
                name = User.GET_ALL_USERS,
                query = "select u from User u"),
        @NamedQuery(
                name = User.GET_USER_BY_ID,
                query = "select u from User u where u.userId = :user_id")
})
public class User {

    public static final String GET_ALL_USERS = "User.GET_ALL_USERS";
    public static final String GET_USER_BY_ID = "User.GET_USER_BY_ID";

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "user_id")
    private Long userId;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "user_email")
    private String userEmail;

    @Column(name = "user_password")
    private String userPassword;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="role_id")
    private Role role;

    public User(String userName, String userEmail, String userPassword, Role role) {
        this.userName = userName;
        this.userEmail = userEmail;
        this.userPassword = userPassword;
        this.role = role;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return String.format("Customer[id=%d, firstName='%s', email='%s']", userId, userName, userEmail);
    }
}
