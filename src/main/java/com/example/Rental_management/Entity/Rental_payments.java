package com.example.Rental_management.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Rental_payments")
public class Rental_payments {
    @Id
    @Column(name="payment_id")
    private String payment_id;
    @JoinColumn
    @Column(name="rental_id")
    private Integer rental_id;
    @Column(name="payment_amount")
    private Double payment_amount;
    @Column(name="payment_method")
    private String payment_method;
    @Column(name="payment_status")
    private String payment_status;

}
