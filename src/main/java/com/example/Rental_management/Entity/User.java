package com.example.Rental_management.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
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