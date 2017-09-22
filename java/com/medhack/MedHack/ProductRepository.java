package com.medhack.MedHack;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by SunimalM on 9/22/2017.
 */
@Repository
public interface ProductRepository extends MongoRepository<Product,String> {



}
