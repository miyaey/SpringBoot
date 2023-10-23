package com.example.fruits.entity;

import com.example.fruits.data.dto.FruitDto;
import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "Fruit")
public class FruitsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long fruitId;
    private String fruitName;
    private int fruitWeight;

    public FruitDto toDto(){
        return FruitDto.builder()
                .fruitName(fruitName)
                .fruitWeight(fruitWeight)
                .build();
    }

}
