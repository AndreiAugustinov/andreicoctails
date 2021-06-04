package com.andreicoctails.app.model;

import java.util.Arrays;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class IngredientFormModel {
	
	private Long [] ingredient_ids;

	public IngredientFormModel() {
		super();
		
	}

	public Long[] getIngredient_ids() {
		return ingredient_ids;
	}

	public void setIngredient_ids(Long[] ingredient_ids) {
		this.ingredient_ids = ingredient_ids;
	}

	@Override
	public int hashCode() {
		
		return HashCodeBuilder.reflectionHashCode(this);
	}

	@Override
	public boolean equals(Object obj) {
	
		return EqualsBuilder.reflectionEquals(this,obj);
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}
