package com.dev.java10x.Fridge.Service;

import com.dev.java10x.Fridge.Model.Food;
import com.dev.java10x.Fridge.Repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//esta classe é um serviço que será injetado no controlador.
//Aqui é onde terá toda a regra de negócio.
//Todas as ações que o Model irá fazer.
//Aqui é onde terá toda a lógica de programação.
@Service//Anotação que diz que essa classe é um serviço do Spring Boot.
public class FoodService {
    //Injetando o repositório.
    //Iremos chamar o repositório para fazer as operações de banco de dados.

    private final FoodRepository repository;

    public FoodService(FoodRepository repository) {
        this.repository = repository;
    }
    //Podemos usar agora todos os metodos do JpaRepository, que são os metodos de CRUD.
    //O JpaRepository já tem todos os metodos de CRUD implementados.
    //Criando o metodo getAll.
    //LISTAR
    //Criando o metodo para listar todos os alimentos.
     public List<Food> getAll() {
        return repository.findAll();
    }
    //CRIAR
    //Criando o metodo save.
    public Food save(Food food) {
        return repository.save(food);
    }
    //DELETAR
    //Criando o metodo delete.
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
