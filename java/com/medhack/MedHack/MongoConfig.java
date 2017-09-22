package com.medhack.MedHack;

import com.mongodb.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.core.MongoTemplate;

/**
 * Created by SunimalM on 9/22/2017.
 */
@Configuration
@ComponentScan({"com.medhack.MedHack.*"})
@PropertySource("classpath:application.properties")
public class MongoConfig extends AbstractMongoConfiguration {

    @Autowired
    Environment environment;

    @Bean
    public MongoClient mongoClient()throws Exception{
        MongoClientOptions.Builder builder = new MongoClientOptions.Builder();
        builder.connectionsPerHost(100);
        builder.writeConcern(WriteConcern.JOURNALED);

        MongoClientOptions options = builder.build();
        MongoClientURI mongoClientURI = new MongoClientURI(environment.getProperty("mongodb.uri"),builder);
        MongoClient mongoClient = new MongoClient(mongoClientURI);
        return mongoClient;
    }
    @Override
    protected String getDatabaseName() {
        return environment.getProperty("mongodb.name");
    }

    @Override
    public Mongo mongo() throws Exception {
        return mongoClient();
    }

    @Bean
    public MongoTemplate mongoTemplate() throws Exception {
        return new MongoTemplate(mongo(), getDatabaseName());
    }
}
