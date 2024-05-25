package com.main;

import jakarta.persistence.*;

@Entity
public class Products {

    @Id
    @SequenceGenerator(
            name = "products_id_sequence",
            sequenceName = "products_id_sequence"
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "products_id_sequence"
    )
    @Column(
            name = "id",
            updatable = false
    )
    private Integer id;

    @Column(
            name = "productName",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String productName;

    @Column(
            name = "price",
            nullable = false
    )
    private Integer price;

    @Column(
            name = "qty",
            nullable = false
    )
    private Integer qty;

    // Constructors
    public Products() {
    }

    public Products(String productName, Integer price, Integer qty) {
        this.productName = productName;
        this.price = price;
        this.qty = qty;
    }

    // Getters and Setters
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

    @Override
    public String toString() {
        return "Products{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                ", qty=" + qty +
                '}';
    }
}
