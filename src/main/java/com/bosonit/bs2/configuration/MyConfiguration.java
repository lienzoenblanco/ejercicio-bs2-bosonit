package com.bosonit.bs2.configuration;

import com.bosonit.bs2.beans.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfiguration {

    @Bean
    public CiudadBean ciudadBean() {
        return new CiudadBeanImpl();
    }

    @Bean("bean1")
    public PersonaBean personaBean1() {
        return new PersonaBean1();
    }

    @Bean("bean2")
    public PersonaBean personaBean2() {
        return new PersonaBean2();
    }

    @Bean("bean3")
    public PersonaBean personaBean3() {
        return new PersonaBean3();
    }
}
