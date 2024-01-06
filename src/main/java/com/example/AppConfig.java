package com.example;

import com.springmybatis.MyImportBeanDefinitionRegistrar;
import com.springmybatis.MyScan;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

import java.io.InputStream;

@ComponentScan("com.example")
@MyScan("com.example.mapper")
public class AppConfig {

    @Bean
    public SqlSessionFactory sqlSessionFactory() throws Exception{
        InputStream is = Resources.getResourceAsStream("mybatis.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        return sqlSessionFactory;
    }
}
