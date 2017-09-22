package com.medhack.MedHack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;


import java.util.List;

/**
 * Created by SunimalM on 9/20/2017.
 */
@RestController
@RequestMapping(value = "/invoice")
public class InvoiceController {
    /*
    @Autowired
    MongoTemplate mongoTemplate;

    @RequestMapping("/all")
    public ResponseEntity<List<Invoice>> InvoiceAll(){
        List<Invoice> allinvoices = mongoTemplate.findAll(Invoice.class);
        return new ResponseEntity<List<Invoice>>(allinvoices,HttpStatus.CREATED);
    }

    @RequestMapping(value = "/{In}",method = RequestMethod.GET)
    public ResponseEntity oneInvoice(@PathVariable("In")String  invNo){
        Query query = new Query();
        query.addCriteria(Criteria.where("inv_no").is(invNo));
        Invoice invoices = mongoTemplate.findOne(query,Invoice.class);
        return new ResponseEntity(invoices,HttpStatus.OK);
    }
    */

}
