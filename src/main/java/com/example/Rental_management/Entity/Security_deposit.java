package com.example.Rental_management.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Security_deposit")
public class Security_deposit {
    @Id
    @Column(name="deposit_id")
    private Integer deposit_id;
    @JoinColumn(name="rental_id")
    private Integer rental_id;
    @Column(name="deposit_amount")
    private double deposit_amount;
    @Column(name="refund_status")
    private String refund_status;
}
