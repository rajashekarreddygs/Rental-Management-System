package com.example.Rental_management.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
<<<<<<< HEAD
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
 private Integer user_id;

    @Column(name = "full_name",nullable = false)
 private String full_name;

    @Column(name = "email", nullable = false)
 private String email;

    @Column(name = "password", nullable = false)
 private String password;

    @Column(name = "phon_number",nullable = false)
 private String phon_number;

    @Column(name = "trust_score")
 private BigDecimal trust_score;
}
=======
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "User")
public class User {

    @Id
    @Column(name = "user_id")
    private Integer user_id;

    @Column(name = "full_name")
    private String full_name;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "phone_number")
    private String phone_number;

    @Column(name = "trust_score")
    private BigDecimal trust_score;
}
>>>>>>> origin/main
