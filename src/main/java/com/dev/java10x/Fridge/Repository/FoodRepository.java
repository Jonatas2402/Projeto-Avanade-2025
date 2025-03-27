package com.dev.java10x.Fridge.Repository;

import com.dev.java10x.Fridge.Model.Food;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface FoodRepository extends JpaRepository<Food,Long> {
}
