package com.hc.datasource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {

    @Primary  //表示当某一个类存在多个实例时，优先使用哪个实例
    @Bean(name = "test1DataSource")
    @ConfigurationProperties(prefix="spring.datasource.test1")
    public DataSource test1DataSource() {
        return DataSourceBuilder.create().build();
    }
    @Bean(name = "test1JdbcTemplate")
    public JdbcTemplate test1JdbcTemplate(@Qualifier("test1DataSource") DataSource dataSource){
        return  new JdbcTemplate(dataSource);
    }

    /////////////////
    @Bean(name = "test2DataSource")
    @ConfigurationProperties(prefix="spring.datasource.test2")
    public DataSource test2DataSource() {
        return DataSourceBuilder.create().build();
    }
    @Bean(name = "test2JdbcTemplate")
    public JdbcTemplate test2JdbcTemplate(@Qualifier("test2DataSource") DataSource dataSource){
        return  new JdbcTemplate(dataSource);
    }
}