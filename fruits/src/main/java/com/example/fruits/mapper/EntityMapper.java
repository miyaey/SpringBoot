package com.example.fruits.mapper;

public interface EntityMapper<DTO, Entity> {
    Entity toEntity(DTO dto);
}
