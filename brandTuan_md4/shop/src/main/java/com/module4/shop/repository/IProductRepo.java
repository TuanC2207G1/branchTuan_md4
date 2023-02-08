package com.module4.shop.repository;

import com.module4.shop.model.ProductDetail;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Queue;

public interface IProductRepo extends PagingAndSortingRepository<ProductDetail,Integer> {
    @Query(nativeQuery = true,value = "select ")
}
