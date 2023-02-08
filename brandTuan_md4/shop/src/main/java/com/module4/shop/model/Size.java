package com.module4.shop.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Size {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String size;
}

