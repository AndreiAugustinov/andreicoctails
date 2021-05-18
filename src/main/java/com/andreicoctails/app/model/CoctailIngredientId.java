package com.andreicoctails.app.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;


@Embeddable

public class CoctailIngredientId  implements Serializable{
	
	@Column(name = "cocktailId")
	private Long cocktailId;

	@Column(name = "ingredientId")
	private Long ingredientId;

	

	public CoctailIngredientId(Long cocktailId, Long ingredientId) {
		super();
		this.cocktailId = cocktailId;
		this.ingredientId = ingredientId;
	}



	public CoctailIngredientId() {
		super();
		
	}


}
