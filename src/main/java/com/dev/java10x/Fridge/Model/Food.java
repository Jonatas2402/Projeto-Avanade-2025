package com.dev.java10x.Fridge.Model;

import jakarta.persistence.*;

import java.time.LocalDate;

//Essa classe é um modelo que será injetado no controlador.
//O model é a representação de um objeto que será salvo no banco de dados, será como o objeto de negócio.
//Aqui pe onde terá todas as informações do objeto.

@Entity //Anotação que diz que essa classe é uma entidade do banco de dados.
@Table(name = "food_table")//Anotação que diz que essa classe é uma tabela do banco de dados.
public class Food {
    @Id//Anotação que diz que esse campo é uma chave primária.
    @GeneratedValue(strategy = GenerationType.IDENTITY)//Anotação que diz que esse campo é uma chave primária e que será gerada automaticamente.
    private Long id;
    private String name;
    private LocalDate expirationDate;
    private Integer quantity;

    public Food() {
    }

    public Food(Long id, String name, LocalDate expirationDate, Integer quantity) {
        this.id = id;
        this.name = name;
        this.expirationDate = expirationDate;
        this.quantity = quantity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
