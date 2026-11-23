package com.example.Rental_management.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Rental_requests")
public class Rental_requests {
    @Id
    @Column(name = "request_id")
    private Integer request_id;

    @ManyToOne
    @JoinColumn(name = "item_id")
    private Rental_items item_id;

    @Column(name = "rental_start_date")
    private Date rental_start_date;
    @Column(name = "rental_end_date")
    private Date rental_end_date;
    @Column(name = "rental_status")
    private String rental_status;
}
