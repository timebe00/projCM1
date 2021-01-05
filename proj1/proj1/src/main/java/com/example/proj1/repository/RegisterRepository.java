package com.example.proj1.repository;

import com.example.proj1.entity.Register;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RegisterRepository extends JpaRepository<Register, Long>{
    boolean existsById(String id);
    List<Register> findById(String id);
    List<Register> findByIdAndPw(String id, String pw);
    List<Register> findByNameAndPhoAndPn(String name, String pho, String pn);
    List<Register> findByNameAndPhoAndPnAndId(String name, String pho, String pn, String id);

}
