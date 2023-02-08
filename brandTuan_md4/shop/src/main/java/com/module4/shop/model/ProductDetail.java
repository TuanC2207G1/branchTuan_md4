package com.module4.shop.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class ProductDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private long quantity;
    @ManyToOne
    Product product;
    @ManyToOne
    Size size;
}
