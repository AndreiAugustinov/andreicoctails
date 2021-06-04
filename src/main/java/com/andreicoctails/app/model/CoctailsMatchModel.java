package com.andreicoctails.app.model;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class CoctailsMatchModel {
	private String coctailName;
	private String percentageMatch;
	private String url;
	public CoctailsMatchModel(String coctailName, String percentageMatch, String url) {
		super();
		this.coctailName = coctailName;
		this.percentageMatch = percentageMatch;
		this.url = url;
	}
	public CoctailsMatchModel() {
		super();
	}
	public String getCoctailName() {
		return coctailName;
	}
	public void setCoctailName(String coctailName) {
		this.coctailName = coctailName;
	}
	public String getPercentageMatch() {
		return percentageMatch;
	}
	public void setPercentageMatch(String percentageMatch) {
		this.percentageMatch = percentageMatch;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}	@Override
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
