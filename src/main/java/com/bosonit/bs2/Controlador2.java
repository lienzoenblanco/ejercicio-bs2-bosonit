package com.bosonit.bs2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(path = "/controlador2")
public class Controlador2 {

    @Autowired
    private ServicioPersona servicioPersona;

    @GetMapping("/getPersona")
    public ResponseEntity<Persona> getPersona() {
        Persona persona = this.servicioPersona.getUltimaPersona();
        if (persona == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        persona.envejecer();

        return new ResponseEntity<>(persona, HttpStatus.OK);
    }
}
