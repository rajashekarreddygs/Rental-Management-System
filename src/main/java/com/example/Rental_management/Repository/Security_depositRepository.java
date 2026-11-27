package com.example.Rental_management.Repository;

import com.example.Rental_management.Entity.Security_deposit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Security_depositRepository extends JpaRepository<Security_deposit,Integer> {
}
