package com.regi.backend.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String name;
    private String description;
    private double price;
}
