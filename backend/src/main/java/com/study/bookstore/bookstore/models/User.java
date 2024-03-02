package com.study.bookstore.bookstore.models;

import java.util.Date;
import java.util.Set;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_users")
public class User {
    //TODO: implement User
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name="user_id")
    UUID id;
    @Column(name = "user_name", nullable = false)
    String userName;
    @Column(name = "user_email", nullable = false, unique = true)
    String userEmail;
    @CreationTimestamp
    @Column(name= "user_account_createdAt")
    Date createdAt;

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

    public Set<Review> getUserReviews() {
        return userReviews;
    }

    public void setUserReviews(Set<Review> userReviews) {
        this.userReviews = userReviews;
    }

    public User() {
    }

    @OneToMany(mappedBy = "user", cascade = CascadeType.REMOVE)
    Set<Review> userReviews;

}
