package com.medhack.MedHack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by SunimalM on 9/22/2017.
 */
@RestController
@RequestMapping(value = "/product")
public class ProductController {

    @Autowired
    MongoTemplate mongoTemplate;

    @Autowired
    ProductRepository productRepository;

    @RequestMapping("/all")
    public ResponseEntity<List<Product>> productAll(){
        List<Product> allProducts = mongoTemplate.findAll(Product.class);
        return new ResponseEntity<List<Product>>(allProducts, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/saveProduct", method = RequestMethod.PUT)
    public ResponseEntity saveProduct(@RequestBody ProductDTO prod){
        try {
            Product product = new Product();
            product.setName(prod.getName());
            product.setPrice(prod.getPrice());
            product = productRepository.save(product);
            return new ResponseEntity(HttpStatus.CREATED);
        }
        catch (Exception e)
        {
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }

    }


}
