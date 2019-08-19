package org.cap.dao;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.cap.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository("productDbDao")
@Transactional
public class ProductDBDaoImpl implements IProductDao{
	
	@Autowired
	private IProductDao productDao;
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public List<Product> getAllProducts() {
		List<Product> products= em.createQuery("from Product").getResultList();
		return products;
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
		em.persist(product);
		return getAllProducts();
	}

	@Override
	public List<Product> updateProduct(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> saveAll() {
		List<Product> products= productDao.getAllProducts();
		System.out.println(products);
		
		Iterator<Product> iterator= products.iterator();
		while(iterator.hasNext()) {
			Product product=new Product();
			Product product1= iterator.next();
			product.setProductId(product1.getProductId());
			product.setProductName(product1.getProductName());
			product.setPrice(product1.getPrice());
			product.setQuantity(product1.getQuantity());
			em.persist(product);
		}
		/*
		for(Product entity:products)
			em.persist(entity);*/
		
		return getAllProducts();
	}

}
