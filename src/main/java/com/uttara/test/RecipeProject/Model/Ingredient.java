package com.uttara.test.RecipeProject.Model;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class Ingredient {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String descrition;
    private BigDecimal amount;

    @ManyToOne
    private Recipe recipe;

    public Ingredient(String descrition, BigDecimal amount) {
        this.descrition = descrition;
        this.amount = amount;
    }

    public Ingredient() {
    }

    public String getDescrition() {
        return descrition;
    }

    public void setDescrition(String descrition) {
        this.descrition = descrition;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
