package com.niit.dao;

import java.util.List;

import com.niit.model.Supplier;

public interface SupplierDao {

		   public boolean addSupplier(Supplier supplier);
		   public boolean deleteSupplier(Supplier supplier);
		   public boolean updateSupplier(Supplier supplier);
		   public List<Supplier> listSuppliers();
		   public Supplier getSupplier(int supplierId);

	}

