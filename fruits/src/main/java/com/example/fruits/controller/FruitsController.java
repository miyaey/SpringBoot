package com.example.fruits.controller;

import com.example.fruits.data.dto.FruitDto;
import com.example.fruits.entity.FruitsEntity;
import com.example.fruits.service.FruitsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping ("/fruits")
public class FruitsController {
    private final FruitsService fruitsService;

    @GetMapping
    public List<FruitsEntity> getFruits(){
        return fruitsService.getAllFruits();
    }

    @GetMapping("/{fruitId}")
    public FruitsEntity getFruits(@PathVariable long fruitsId){
        return fruitsService.getFruitbyId(fruitsId);
    }

    @PostMapping
    public FruitsEntity createFruits(@RequestBody FruitDto fruitDto){
        FruitsEntity creatFruits = fruitsService.createFruit(fruitDto);
        return fruitsService.createFruit(fruitDto);
    }

    @PutMapping("/{fruitId}")
    public FruitsEntity updateFruits(@PathVariable long fruitId, @RequestBody FruitDto fruitDto){
        return fruitsService.updateFruit(fruitId, fruitDto);
    }

    @DeleteMapping("/{fruitId}")
    public void deletFruits(@PathVariable long fruitId){
        fruitsService.deleteFruit(fruitId);
    }
}
