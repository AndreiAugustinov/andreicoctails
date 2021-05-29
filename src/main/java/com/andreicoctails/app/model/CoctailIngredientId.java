package com.andreicoctails.app.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;


@Embeddable

public class CoctailIngredientId  implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4913645603800278573L;

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
