package com.eventos.springapp.data;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

@Profile(value = { "dev" })
@Configuration
public class DataConfiguration {
	
	@Bean
    public DataSource dataSource(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/eventospringapp");
        dataSource.setUsername("root");
        dataSource.setPassword("root");
        return dataSource;
    }
	
	@Bean
	public JpaVendorAdapter jpaVendorAdapter(){
		HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
		adapter.setDatabase(Database.MYSQL);
		adapter.setShowSql(true);
		adapter.setGenerateDdl(true);
		adapter.setDatabasePlatform("org.hibernate.dialect.MySQL8Dialect");
		adapter.setPrepareConnection(true);
		return adapter;
	}
}


/* 

Hibernate Dialect for Mysql's

MySQL 4.xx => adapter.setDatabasePlatform("org.hibernate.dialect.MySQLDialect");
MySQL 5.xx => adapter.setDatabasePlatform("org.hibernate.dialect.MySQL(5 ou 57)Dialect");
MySQL 8.xx => adapter.setDatabasePlatform("org.hibernate.dialect.MySQL8Dialect");
 
*/