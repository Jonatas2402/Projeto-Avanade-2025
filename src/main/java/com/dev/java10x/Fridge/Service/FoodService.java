package com.dev.java10x.Fridge.Service;

import com.dev.java10x.Fridge.Model.Food;
import com.dev.java10x.Fridge.Repository.FoodRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service//Anotação que diz que essa classe é um serviço do Spring Boot.
public class FoodService {

    private final FoodRepository repository;

    public FoodService(FoodRepository repository) {
        this.repository = repository;
    }

    //LISTAR
    //Criando o metodo para listar todos os alimentos.
     public List<Food> getAll() {
         System.out.println("Listando todos os alimentos");
        return repository.findAll();
    }
    //CRIAR
    //Criando o metodo save.
    public Food save(Food food) {
        System.out.println("Salvando o alimento: " + food.getName());
        return repository.save(food);
    }
    //DELETAR
    //Criando o metodo delete.
    public void delete(Long id) {
        System.out.println("Deletando o alimento com id: " + id);
        repository.deleteById(id);
    }
}
