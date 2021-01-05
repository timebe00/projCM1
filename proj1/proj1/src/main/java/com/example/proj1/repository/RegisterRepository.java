package com.example.proj1.repository;

import com.example.proj1.entity.Register;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public class RegisterRepository extends JpaRepository<Register, Long> {
}
