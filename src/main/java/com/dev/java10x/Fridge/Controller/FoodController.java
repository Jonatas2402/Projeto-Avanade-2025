package com.dev.java10x.Fridge.Controller;

import com.dev.java10x.Fridge.Model.Food;
import com.dev.java10x.Fridge.Service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/food")
public class FoodController {
    private final FoodService foodService;

    public FoodController(FoodService foodService) {
        this.foodService = foodService;
    }

    @GetMapping()
    public List<Food> getAll() {
        return foodService.getAll();
    }
    @PostMapping
    public Food create(@RequestBody Food food) {
        return foodService.save(food);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        foodService.delete(id);
    }
}
