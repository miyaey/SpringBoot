package com.example.fruits.data.dto;

import com.example.fruits.entity.FruitsEntity;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class FruitDto {
    private long fruitId;
    private String fruitName;
    private int fruitWeight;

    public FruitsEntity toEntity(){
        return FruitsEntity.builder()
                .fruitName(fruitName)
                .fruitWeight(fruitWeight)
                .build();
    }
}
