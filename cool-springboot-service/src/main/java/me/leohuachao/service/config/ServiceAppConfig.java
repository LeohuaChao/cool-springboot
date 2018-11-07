package me.leohuachao.service.config;

import net.sf.log4jdbc.sql.jdbcapi.DataSourceSpy;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@Configuration
@EnableTransactionManagement
@PropertySource("classpath:datasource.properties")
@MapperScan("me.leohuachao.service.mapper")
public class ServiceAppConfig {

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
        DataSource dataSource = DataSourceBuilder.create()
                .driverClassName(driverClassName)
                .url(url)
                .username(username)
                .password(password)
                .build();
        return new DataSourceSpy(dataSource);
    }

//    @Bean
//    @Primary
//    DataSource dataSource() {
//        return new DataSourceSpy(realDataSource());
//    }
}