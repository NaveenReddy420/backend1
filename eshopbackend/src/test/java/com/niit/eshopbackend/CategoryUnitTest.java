package com.niit.eshopbackend;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.dao.CategoryDao;
import com.niit.model.Category;

public class CategoryUnitTest {

@Autowired
	static CategoryDao categoryDao;
	
	@BeforeClass
	public static void executeFirst()
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
	    
	    context.scan("com.niit");
	    context.refresh();
	    
	    categoryDao=(CategoryDao) context.getBean("categoryDao");
	}
    @Ignore
	@Test
	public void addCategoryTest()
	{
		Category category=new Category();
		category.setCategoryName("Panasonic");
		category.setCategoryDesc("Electronics");
		
		assertTrue("Problem in adding the category",categoryDao.addCategory(category));
	}
	@Ignore
	@Test
	public void deleteCategoryTest()
	{
		Category category=categoryDao.getCategory(65);
		
		assertTrue("Problem in deleting category",categoryDao.deleteCategory(category));
	}
	@Ignore
	@Test
	public void updateCategoryTest()
	{
		Category category=categoryDao.getCategory(66);
		category.setCategoryDesc("Electroncs");
		
		assertTrue("Problem in updating category",categoryDao.updateCategory(category));
	}

}
