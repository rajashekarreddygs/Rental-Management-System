package com.example.Rental_management.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="Categories")
public class Categories {
    @Id
    @Column(name = "category_id")
    private Integer category_id;

    @Column(name = "category_name")
    private String category_name;

    @Column(name = "description")
    private String description;
}
