package com.andreicoctails.app.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andreicoctails.app.model.TCoctailXIngredient;
import com.andreicoctails.app.repository.ICoctailXIngredientRepository;
import com.andreicoctails.app.service.ICoctailXIngredientService;


@Service

public class ICoctailXIngredientServiceImpl implements ICoctailXIngredientService
{
@Autowired
ICoctailXIngredientRepository coctailXIngredientRepository;

@Override
public List<TCoctailXIngredient> findAllCocktailsByIngredientIds(List<Long> ingredientIds) {

	return coctailXIngredientRepository.findAll().stream()
			.filter(record -> ingredientIds.contains(record.getIngredient().getIngredient_id())).distinct()
			.collect(Collectors.toList());
}
}
