package com.productsService;

import com.ProductsMapper.ProductsMapper;
import com.ProductsRepository.ProductsRepository;
import com.main.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductsService2 implements ProductsService {

    @Autowired
    private ProductsRepository productsRepository;

    @Override
    public Products saveProducts(ProductsMapper productsMapper) {
        Products products1 = new Products();
        products1.setProductName(productsMapper.getProductName());
        products1.setPrice(productsMapper.getPrice());
        products1.setQty(productsMapper.getQty());
        return productsRepository.save(products1);
    }

    @Override
    public ProductsMapper fetchProductsById(Integer id) {
        Products products1 = productsRepository.findById(id).orElse(null);
        ProductsMapper prod = new ProductsMapper();
        if (products1 != null) {
            prod.setId(products1.getId());
            prod.setProductName(products1.getProductName());
            prod.setPrice(products1.getPrice());
            prod.setQty(products1.getQty());
        }
        return prod;
    }

    @Override
    public String deleteProductsById(Integer id) {
        productsRepository.deleteById(id);
        return "product deleted successfully";
    }

    @Override
    public ProductsMapper updateProducts(ProductsMapper productsMapper) {
        Products products1 = productsRepository.findById(productsMapper.getId()).orElse(null);
        if (products1 != null) {
            products1.setProductName(productsMapper.getProductName());
            products1.setPrice(productsMapper.getPrice());
            products1.setQty(productsMapper.getQty());
            productsRepository.save(products1);
        }
        return productsMapper;
    }

    @Override
    public List<ProductsMapper> getProductsList() {
        List<Products> prodList = productsRepository.findAll();
        List<ProductsMapper> resultList = new ArrayList<>();
        for (Products product : prodList) {
            ProductsMapper productsMapper = new ProductsMapper();
            productsMapper.setId(product.getId());
            productsMapper.setProductName(product.getProductName());
            productsMapper.setPrice(product.getPrice());
            productsMapper.setQty(product.getQty());
            resultList.add(productsMapper);
        }
        return resultList;
    }
}
