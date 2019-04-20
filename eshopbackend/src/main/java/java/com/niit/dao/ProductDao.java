package com.niit.dao;

import java.util.List;

import com.niit.model.Product;

public interface ProductDao 
{
	   public boolean addProduct(Product product);
	   public boolean deleteProduct(Product product);
	   public boolean updateProduct(Product product);
	   public List<Product> listProducts();
	   public Product getProduct(int proId);

}
