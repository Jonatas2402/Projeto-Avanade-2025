package com.dev.java10x.Fridge.Repository;

import com.dev.java10x.Fridge.Model.Food;
import org.springframework.data.jpa.repository.JpaRepository;

//Essa classe é um repositório que será injetado no controlador.
//O repositório é a camada de acesso a dados, onde terá todas as operações de CRUD.
//Aqui é onde terá todas as operações de banco de dados.
public interface FoodRepository extends JpaRepository<Food,Long> {
    //Os parametros genericos são o tipo da entidade e o tipo da chave primária.
    //Ela será uma interface que irá extender a interface JpaRepository.
    //Ela precisará ser implementada.
}
