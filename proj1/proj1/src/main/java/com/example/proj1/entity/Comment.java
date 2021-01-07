package com.example.proj1.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;

@JsonIgnoreProperties(value = "hibernateLazyInitializer")
@Data
@EqualsAndHashCode(of = "comNo")
@ToString
@Entity
@Table(name = "comment")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "comno", nullable = false)
    private Long comNo;

    @Column(name = "id", nullable = false)
    private String id;

    @Column(name = "boardNo", nullable = false)
    private Long boardNo;

    @Column(name = "comtxt", nullable = false)
    private String comtxt;
}
