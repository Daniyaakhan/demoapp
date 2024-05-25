package com.productsService;

import com.ProductsMapper.ProductsMapper;
import com.main.Products;

import java.util.List;

public interface ProductsService {
    Products saveProducts(ProductsMapper productsMapper);

    ProductsMapper fetchProductsById(Integer id);

    String deleteProductsById(Integer id);

    ProductsMapper updateProducts(ProductsMapper productsMapper);

    List<ProductsMapper> getProductsList();
}
