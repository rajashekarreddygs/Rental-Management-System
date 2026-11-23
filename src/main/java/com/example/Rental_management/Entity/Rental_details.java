package com.example.Rental_management.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Rental_details")
public class Rental_details {

    @Id
    @Column(name = "rental_id")
    private Integer rental_id;

    @ManyToOne
    @JoinColumn(name = "request_id")
    private Rental_requests Rental_requests;

    @Column(name = "total_rental_amount")
    private BigDecimal total_rental_amount;

    @Column(name = "actual_pickup_date")
    private Date actual_pickup_date;

    @Column(name = "actual_return_date")
    private Date actual_return_date;

    @Column(name = "rental_status")
    private String rental_status;
}