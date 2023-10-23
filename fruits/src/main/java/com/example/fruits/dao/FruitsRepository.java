package com.example.fruits.dao;

import com.example.fruits.entity.FruitsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FruitsRepository extends JpaRepository<FruitsEntity, Long> {
}
