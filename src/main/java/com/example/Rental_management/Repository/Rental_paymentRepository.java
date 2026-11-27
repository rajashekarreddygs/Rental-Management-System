package com.example.Rental_management.Repository;

import com.example.Rental_management.Entity.Rental_payments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Rental_paymentRepository extends JpaRepository<Rental_payments,Integer> {
}

