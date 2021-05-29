package com.andreicoctails.app.model;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Entity
@Table(name = "t_coctails_x_ingredients" ,schema ="co" )


public class TCoctailXIngredient implements Serializable {
	
	
	
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 2182894645337006972L;

	@EmbeddedId
	private CoctailIngredientId id;
	
	 @ManyToOne
	    @MapsId("coctailId")
	    @JoinColumn(name = "coctail_id", nullable = false)
	    private TCoctail coctail;
	 
	    @ManyToOne
	    @MapsId("ingredientId")
	    @JoinColumn(name = "ingredient_id", nullable = false)
	    private TIngredient ingredient;

		public TCoctailXIngredient() {
			super();
			
		}

		public CoctailIngredientId getId() {
			return id;
		}

		public void setId(CoctailIngredientId id) {
			this.id = id;
		}

		public TCoctail getCoctail() {
			return coctail;
		}

		public void setCoctail(TCoctail coctail) {
			this.coctail = coctail;
		}

		public TIngredient getIngredient() {
			return ingredient;
		}

		public void setIngredient(TIngredient ingredient) {
			this.ingredient = ingredient;
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
