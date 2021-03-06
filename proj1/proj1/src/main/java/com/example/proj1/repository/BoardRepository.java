package com.example.proj1.repository;

import com.example.proj1.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BoardRepository extends JpaRepository<Board, Long>{
    List<Board> findBy();
    List<Board> findByBoardNo(Long boardNo);
}