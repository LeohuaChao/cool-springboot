package me.leohuachao.service.config;

import net.sf.log4jdbc.sql.jdbcapi.DataSourceSpy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@Configuration
@EnableTransactionManagement
@PropertySource("classpath:datasource.properties")
public class AppConfig {

    @Value("${source.driverClassName}")
    private String driverClassName;

    @Value("${source.url}")
    private String url;

    @Value("${source.username}")
    private String username;

    @Value("${source.password}")
    private String password;

    @Bean
    DataSource realDataSource() {
        DataSource dataSource = DataSourceBuilder
                .create(driverClassName)
                .url(url)
                .username(username)
                .password(password)
                .build();
        return dataSource;
    }

    @Bean
    @Primary
    DataSource dataSource() {
        return new DataSourceSpy(realDataSource());
    }
}