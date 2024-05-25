package com.ProductsRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.main.Products;

public interface ProductsRepository extends JpaRepository<Products, Integer> {
}
