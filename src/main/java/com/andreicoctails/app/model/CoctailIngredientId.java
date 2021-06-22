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

	@Column(name = "coctail_id")
	private Long coctail_id;

	@Column(name = "ingredient_id")
	private Long ingredient_id;

	
	

	public CoctailIngredientId(Long coctail_id, Long ingredient_id) {
		super();
		this.coctail_id = coctail_id;
		this.ingredient_id = ingredient_id;
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
