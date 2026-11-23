package com.example.Rental_management.Repository;
import com.example.Rental_management.Entity.Rental_items;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Rental_itemsRepository extends JpaRepository<Rental_items,Integer> {
}
