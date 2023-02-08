package com.module4.shop.service;

import com.module4.shop.repository.IProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
@org.springframework.stereotype.Service
public class Service {
    @Autowired
    IProductRepo productRepo;
}
