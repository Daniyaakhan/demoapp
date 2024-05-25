package com.ProductsController;

import com.ProductsMapper.ProductsMapper;
import com.main.Products;
import com.productsService.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductsController {

    @Autowired
    private ProductsService productsService;

    @PostMapping("/products")
    public Products saveProducts(@RequestBody ProductsMapper productsMapper) {
        return productsService.saveProducts(productsMapper);
    }

    @GetMapping("/products/{id}")
    public ProductsMapper fetchProductsById(@PathVariable("id") Integer id) {
        return productsService.fetchProductsById(id);
    }

    @DeleteMapping("/products/{id}")
    public String deleteProductsById(@PathVariable("id") Integer id) {
        return productsService.deleteProductsById(id);
    }

    @GetMapping("/products")
    public List<ProductsMapper> fetchProductsList() {
        return productsService.getProductsList();
    }

    @PutMapping("/products")
    public ProductsMapper updateProducts(@RequestBody ProductsMapper productsMapper) {
        return productsService.updateProducts(productsMapper);
    }
}
