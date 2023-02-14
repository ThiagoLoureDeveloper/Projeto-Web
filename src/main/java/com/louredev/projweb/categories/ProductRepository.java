package com.louredev.projweb.categories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.louredev.projweb.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

	
}
