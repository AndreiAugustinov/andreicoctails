package com.andreicoctails.app.service;

import java.util.List;

import com.andreicoctails.app.model.TCoctailXIngredient;


public interface  ICoctailXIngredientService {
	
	public List<TCoctailXIngredient> findAllCocktailsByIngredientIds(List<Long> ingredientIds);

}
