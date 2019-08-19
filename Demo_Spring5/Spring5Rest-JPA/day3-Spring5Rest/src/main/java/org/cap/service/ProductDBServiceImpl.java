package org.cap.service;

import java.util.List;

import org.cap.dao.IProductDao;
import org.cap.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("productDbService")
public class ProductDBServiceImpl implements IProductService {
	
	@Autowired
	private IProductDao productDbDao;

	@Override
	public List<Product> getAllProducts() {
		
		return productDbDao.getAllProducts();
	}

	@Override
	public Product findProduct(Integer productId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> deleteProduct(Integer productId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> saveProduct(Product product) {
		// TODO Auto-generated method stub
		return productDbDao.saveProduct(product);
	}

	@Override
	public List<Product> updateProduct(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> saveAll() {
		
		return productDbDao.saveAll();
	}

}
