package com.example.proj1.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@JsonIgnoreProperties(value="hibernateLazyInitializer")
@Getter
@Setter
@EqualsAndHashCode(of = "userNo")
@ToString
@Entity
@Table(name = "register")
public class Register {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userno")
    private Long userNo;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "id", nullable = false, unique = true)
    private String id;

    @Column(name = "pw", nullable = false)
    private String pw;

    @Column(name= "pho", nullable = false)
    private String pho;

    @Column(name = "pn", nullable = false)
    private String pn;
}