package com.niit.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Category {
	
	@Id
	@GeneratedValue
	int categoryID;
	
	String CategoryName;
	String CategoryDesc;
	public int getCategoryID() {
		return categoryID;
	}
	public void setCategoryID(int categoryID) {
		this.categoryID = categoryID;
	}
	public String getCategoryName() {
		return CategoryName;
	}
	public void setCategoryName(String categoryName) {
		CategoryName = categoryName;
	}
	public String getCategoryDesc() {
		return CategoryDesc;
	}
	public void setCategoryDesc(String categoryDesc) {
		CategoryDesc = categoryDesc;
	}
}
