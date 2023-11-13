package com.springboot.test.repository;

import com.springboot.jpa.data.entity.Product;
import org.springframework.util.Assert;

import java.util.Optional;

public class ProductRepository {

    @Override
    public Product getById(Long id) {
        Assert.notNull(id, ID_MUST_NOT_BE_NULL);
        return em.getReference(getDomainClass(), id ); 
    }

    public void delete(Product product) {
        
    }

    public Optional<Product> findById(Long number) {
        
    }

    public Product save(Product product) {
    }
}
