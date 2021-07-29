package com.ucc.application.config;
//package com.ucc.application.configuration;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.mongodb.MongoDbFactory;
//import org.springframework.data.mongodb.core.MongoTemplate;
//
//import com.mongodb.client.MongoClient;
//
//@Configuration
//public class MongodbConfig {
//
//
//    @Bean
//    public MongoDbFactory mongoDbFactory() {
//
//        MongoClient mongoClient = new MongoClient("127.0.0.1:27017");
//
//        return new SimpleMongoDbFactory(mongoClient, "IndianFarms" );
//    }
//
//    @Bean
//    public MongoTemplate mongoTemplate() {
//        return new MongoTemplate(mongoDbFactory());
//    }
//}