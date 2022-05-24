package com.bosonit.bs2.configuration;

import com.bosonit.bs2.beans.CiudadBean;
import com.bosonit.bs2.beans.CiudadBeanImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfiguration {

    @Bean
    public CiudadBean ciudadBean() {
        return new CiudadBeanImpl();
    }
}
