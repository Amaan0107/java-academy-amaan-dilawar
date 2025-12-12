package com.demo.springdemo.DatabaseConfiguration;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DatabaseConfig {

    @Bean
    public DataSource dataSource() {
        BasicDataSource ds = new BasicDataSource();
        ds.setUrl("jdbc:mysql://localhost:3306/artist"); // DB = artist
        ds.setUsername("root");
        ds.setPassword("Feroze1975$");
        ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
        return ds;
    }
}

