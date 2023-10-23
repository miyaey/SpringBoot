package com.example.fruits.service;

import com.example.fruits.dao.FruitsRepository;
import com.example.fruits.data.dto.FruitDto;
import com.example.fruits.entity.FruitsEntity;
import com.example.fruits.mapper.FruitsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class FruitsService {
    private final FruitsRepository fruitsRepository;
    private final FruitsMapper fruitsMapper;

    @Autowired
    public FruitsService(FruitsRepository fruitsRepository, FruitsMapper fruitsMapper){
        this.fruitsRepository = fruitsRepository;
        this.fruitsMapper = fruitsMapper;
    }

    public FruitsEntity createFruit(FruitDto fruitDto){
        FruitsEntity fruitsEntity = fruitsMapper.toEntity(fruitDto);
        return fruitsRepository.save(fruitsEntity);
    }

    public List<FruitsEntity> getAllFruits(){
        return fruitsRepository.findAll();
    }

    public FruitsEntity getFruitbyId(long fruitId){
        return fruitsRepository.findById(fruitId).orElse(null);
    }

    public FruitsEntity updateFruit(long fruitId, FruitDto fruitDto){
FruitsEntity existFruit = fruitsRepository.findById(fruitId).orElse(null);
if (existFruit !=null){
    FruitsEntity updateFruit = fruitsMapper.toEntity(fruitDto);
updateFruit.setFruitId(fruitId);
return fruitsRepository.save(updateFruit);
}
return null;
    }

    public void deleteFruit(long fruitId){
        fruitsRepository.deleteById(fruitId);
    }

}

