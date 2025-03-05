package com.dev.java10x.Fridge.Controller;

import com.dev.java10x.Fridge.Model.Food;
import com.dev.java10x.Fridge.Service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

//Essa classe é um controlador do Spring Boot.
//Essa classe serve como um ponto de entrada para a aplicação.
//Onde terá varias rotas que serão acessadas pelo cliente.
@RestController //Anotação que diz que essa classe é um controlador do Spring Boot.
@RequestMapping("/food")//Essa anotação fará o mapeamento da rota.
public class FoodController {
    //injeção de dependência.
    //Iremos chamar o service para fazer a lógica de programação.
    //Usaremos a anotação @Autowired para injetar a dependência ou podemos usar o construtor.
    private final FoodService foodService;

    public FoodController(FoodService foodService) {
        this.foodService = foodService;
    }

    @GetMapping//Anotação que diz que esse método lista todos os alimentos.
    public List<Food> getAll() {
        return foodService.getAll();
    }
    @PostMapping//Anotação que diz que esse método cria um alimento.
    public Food create(@RequestBody Food food) {
        return foodService.save(food);
    }
}
