package com.andreicoctails.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.andreicoctails.app.model.IngredientsFormModel;
import com.andreicoctails.app.repository.IIngredientRepository;

@Controller

public class IngredientController {
	
	@Autowired
	private IIngredientRepository ingredientRepository;
	
	
	@GetMapping("/ingredients") // local url: http://localhost:8080/AndreiCoctails/ingredients
	public String getIngredients(Model model) {

		model.addAttribute("ingredients", ingredientRepository.findAll());
		model.addAttribute("ingredientsFormModel", new IngredientsFormModel());
		
		return "ingredients";  // return ingredients.html from /templates
	}
	

}
