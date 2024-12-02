package com.introduccion.config;

import com.introduccion.repository.ProductRepositoryA;
import com.introduccion.repository.ProductRepositoryB;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansInjector {

    @Bean
    public ProductRepositoryA createProductRepository(){
        return new ProductRepositoryA();
    }

    @Bean
    public ProductRepositoryB createProductRepositoryB(){
        return new ProductRepositoryB();
    }

}
