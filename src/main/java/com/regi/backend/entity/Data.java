package com.regi.backend.entity;

import jakarta.persistence.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("datas")
public record Data(@Id Long id, String dataName, double price) {
}
