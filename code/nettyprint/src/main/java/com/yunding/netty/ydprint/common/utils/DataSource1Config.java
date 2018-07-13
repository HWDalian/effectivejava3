package com.yunding.netty.ydprint.common.utils;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

/**
 * Created by Administrator on 2018/2/7.
 */
@Configuration
@MapperScan(basePackages = "com.yunding.netty.ydprint.dao", sqlSessionTemplateRef  = "printSqlSessionTemplate")
public class DataSource1Config {
    @Bean(name = "printDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.ydprint")
    @Primary
    public DataSource printDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "printSqlSessionFactory")
    @Primary
    public SqlSessionFactory printSqlSessionFactory(@Qualifier("printDataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        //bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:mybatis/mapper/test1/*.xml"));
        return bean.getObject();
    }

    @Bean(name = "printTransactionManager")
    @Primary
    public DataSourceTransactionManager printTransactionManager(@Qualifier("printDataSource") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean(name = "printSqlSessionTemplate")
    @Primary
    public SqlSessionTemplate printSqlSessionTemplate(@Qualifier("printSqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
        return new SqlSessionTemplate(sqlSessionFactory);
    }
}
