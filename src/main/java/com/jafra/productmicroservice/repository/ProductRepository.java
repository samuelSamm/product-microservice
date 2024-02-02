package com.jafra.productmicroservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.jafra.productmicroservice.entity.ProductEntity;

public interface ProductRepository extends MongoRepository<ProductEntity, String> {

}
