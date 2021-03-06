package com.niit.model;

import javax.persistence.Entity;



import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;

@Entity
@Table
public class Product 
{
   @Id
   @GeneratedValue
   
   int proId;   
   String proName;
   String proDesc;
   int proprice;
   int stock;
   int categoryID;
   int supplierId;
   
   @Transient
   MultipartFile pimage;

      
public int getProId() {
	return proId;
}
public void setProId(int proId) {
	this.proId = proId;
}
public String getProName() {
	return proName;
}
public void setProName(String proName) {
	this.proName = proName;
}
public String getProDesc() {
	return proDesc;
}
public void setProDesc(String proDesc) {
	this.proDesc = proDesc;
}
public int getProprice() {
	return proprice;
}
public void setProprice(int proprice) {
	this.proprice = proprice;
}
public int getStock() {
	return stock;
}
public void setStock(int stock) {
	this.stock = stock;
}
public int getCategoryID() {
	return categoryID;
}
public void setCategoryID(int categoryID) {
	this.categoryID = categoryID;
}
public int getSupplierId() {
	return supplierId;
}
public void setSupplierId(int supplierId) {
	this.supplierId = supplierId;
}
public MultipartFile getPimage() {
	return pimage;
}
public void setPimage(MultipartFile pimage) {
	this.pimage = pimage;
}

}
