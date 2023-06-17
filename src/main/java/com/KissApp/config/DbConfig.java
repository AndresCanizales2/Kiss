package com.KissApp.config;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

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

}
