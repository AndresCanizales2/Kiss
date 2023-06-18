package com.KissApp.config;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.util.HashMap;
import java.util.Map;

/**
 * Clase para configuraciones de base de datos.
 */
@Configuration
@EnableMongoRepositories(basePackages = "com.KissApp.component.Usuario")
public class DbConfig  extends AbstractMongoClientConfiguration {

    @Value("${spring.data.mongodb.uri}")
    private String connectionString;



    @Override
    protected String getDatabaseName() {
        return "KissApp";
    }

    @Override
    public MongoClient mongoClient() {
        return MongoClients.create(connectionString);
    }


    @Bean
    public Cloudinary cloudinary(){
        Map<String, String> config = new HashMap<>();
        config.put("cloud_name", "dtnqknltg");
        config.put("api_key","355773333583633");
        config.put("api_secret","IzdbEvLkRYt1Ed6icbvWE8Giioo");
        return new Cloudinary(config);
    }


}
