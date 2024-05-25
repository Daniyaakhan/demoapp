package com.ProductsMapper;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ProductsMapper {
    @JsonProperty("id")
    private Integer id;

    @JsonProperty("productName")
    private String productName;

    @JsonProperty("price")
    private Integer price;

    @JsonProperty("qty")
    private Integer qty;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }
}
