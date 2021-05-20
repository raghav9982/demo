package com.example.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
@Configuration
@EnableConfigurationProperties(DBConfiguration.class)
public class DBConnectionConfig {
/*
    private DBConfiguration dbConfiguration;
    public DBConnectionConfig(DBConfiguration dbConfiguration) {
        this.dbConfiguration = dbConfiguration;
    }

    @Profile("test")
    @Bean
    public String devTestConnection() {
        return "TEST";
    }

    @Profile("prod")
    @Bean
    public String ProdTestConnection() {
        return "PROD";
    }

    @Profile("QA")
    @Bean
    public String QATestConnection() {
        return "QA";
    }*/
}
