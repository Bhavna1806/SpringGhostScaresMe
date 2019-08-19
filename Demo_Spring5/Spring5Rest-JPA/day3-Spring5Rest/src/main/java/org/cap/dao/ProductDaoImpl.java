package org.cap.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.atomic.AtomicInteger;

import org.cap.model.Product;
import org.springframework.stereotype.Repository;

@Repository("productDao")
public class ProductDaoImpl implements IProductDao{
	
	private static AtomicInteger productId=new AtomicInteger(1000);
	private static List<Product> products=dummyProductDB();
	
	private static List<Product> dummyProductDB(){
		List<Product> products=new ArrayList<>();
		products.add(new Product(productId.incrementAndGet(), "Apple Xs", 12, 450000,new Date(2025-1900, 3, 12)));
		products.add(new Product(productId.incrementAndGet(), "Apple X", 3, 34000, new Date(2019-1900, 3, 28)));
		products.add(new Product(productId.incrementAndGet(), "Sony Z1", 1, 120000, new Date(2021-1900, 2, 10)));
		products.add(new Product(productId.incrementAndGet(), "Sony ZL", 12, 560000, new Date(2020-1900, 1, 12)));
		products.add(new Product(productId.incrementAndGet(), "Samsung J7", 10, 450000, new Date(2022-1900, 7, 22)));
		products.add(new Product(productId.incrementAndGet(), "Samsung J5", 11, 2234555, new Date(2025-1900, 3, 2)));
		products.add(new Product(productId.incrementAndGet(), "ReadMe", 9, 678900, new Date(2025-1900, 3, 1)));
		
		return products;
	}

	@Override
	public List<Product> getAllProducts() {
		
		return products;
	}

	@Override
	public Product findProduct(Integer productId) {
		
		for(Product product:products) {
			if(product.getProductId()==productId)
				return product;
		}
		
		return null;
	}

	@Override
	public List<Product> deleteProduct(Integer productId) {
		
		Product product=findProduct(productId);
		if(product!=null) {
			products.remove(product);
			return products;
		}
		return null;
	}

	@Override
	public List<Product> saveProduct(Product product) {
		products.add(product);
		return products;
	}

	@Override
	public List<Product> updateProduct(Product product) {
		boolean flag=false;
		ListIterator<Product> listIterator= products.listIterator();
		while(listIterator.hasNext()) {
			Product product2=listIterator.next();
			if(product.getProductId()==product2.getProductId()) {
				flag=true;
				listIterator.set(product);
			}
		}
		if(flag)
			return products;
		else
			return null;
	}

	@Override
	public List<Product> saveAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
