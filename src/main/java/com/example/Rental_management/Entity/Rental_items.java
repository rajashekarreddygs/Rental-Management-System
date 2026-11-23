package com.example.Rental_management.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Rental_items")
public class Rental_items {

    @Id
    @Column(name = "item_id")
    private Integer item_id;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Categories category_id;

    @Column(name = "item_name")
    private String item_name;

    @Column(name = "item_description")
    private String item_description;

    @Column(name = "item_image_url")
    private String item_image_url;

    @Column(name = "daily_rent_price")
    private Double daily_rent_price;

    @Column(name = "security_deposit")
    private Double security_deposit;

    @Column(name = "item_condition")
    private String item_condition;

    @Column(name = "availability_status")
    private String availability_status;
}