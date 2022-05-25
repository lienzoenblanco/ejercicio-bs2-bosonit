package com.bosonit.bs2.controllers;

import com.bosonit.bs2.beans.PersonaBean;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/controlador")
public class Controlador {
    private PersonaBean personaBean1;
    private PersonaBean personaBean2;
    private PersonaBean personaBean3;

    public Controlador(
            @Qualifier("bean1")
            PersonaBean personaBean1,
            @Qualifier("bean2")
            PersonaBean personaBean2,
            @Qualifier("bean3")
            PersonaBean personaBean3) {
        this.personaBean1 = personaBean1;
        this.personaBean2 = personaBean2;
        this.personaBean3 = personaBean3;

    }

    @GetMapping("/bean/{bean}")
    public ResponseEntity<PersonaBean> getBean(@PathVariable String bean) {
        switch(bean) {
            case "bean1":
                return new ResponseEntity<>(personaBean1, HttpStatus.OK);
            case "bean2":
                return new ResponseEntity<>(personaBean2, HttpStatus.OK);
            case "bean3":
                return new ResponseEntity<>(personaBean3, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
