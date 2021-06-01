package com.andreicoctails.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andreicoctails.app.model.TIngredient;

public interface IIngredientRepository extends JpaRepository<TIngredient,Long>{

}
