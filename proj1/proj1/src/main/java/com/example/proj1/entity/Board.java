package com.example.proj1.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;

@JsonIgnoreProperties(value = "hibernateLazyInitializer")
@Data
@EqualsAndHashCode(of = "boardNo")
@ToString
@Entity
@Table(name = "board")
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "boardno", nullable = false)
    private Long boardNo;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "views", nullable = false)
    private int views = 0;

    @Column(name = "id", nullable = false)
    private String id;

    @Column(name = "txt", columnDefinition = "TEXT", nullable = false)
    private String txt;

}
