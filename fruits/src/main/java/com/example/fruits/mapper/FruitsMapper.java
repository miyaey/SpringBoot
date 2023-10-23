package com.example.fruits.mapper;

import com.example.fruits.data.dto.FruitDto;
import com.example.fruits.entity.FruitsEntity;
import org.springframework.stereotype.Component;

@Component
public class FruitsMapper implements EntityMapper<FruitDto, FruitsEntity>{
    @Override
    public FruitsEntity toEntity(FruitDto fruitDto){
        FruitsEntity fruitsEntity = new FruitsEntity();
        fruitsEntity.setFruitName(fruitDto.getFruitName());
        fruitsEntity.setFruitWeight(fruitDto.getFruitWeight());
        return fruitsEntity;
    }
}
