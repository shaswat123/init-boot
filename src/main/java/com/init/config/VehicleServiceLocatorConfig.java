package com.init.config;

import com.init.registry.ServiceLocatorRegistry;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.config.ServiceLocatorFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class VehicleServiceLocatorConfig {

    @Bean
    public FactoryBean<?> factoryBean(){

        final ServiceLocatorFactoryBean serviceLocatorFactoryBean= new ServiceLocatorFactoryBean();
        serviceLocatorFactoryBean.setServiceLocatorInterface(ServiceLocatorRegistry.class);
        return  serviceLocatorFactoryBean;
    }
}
