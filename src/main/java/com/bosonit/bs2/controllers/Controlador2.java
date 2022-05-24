package com.bosonit.bs2.controllers;

import com.bosonit.bs2.beans.CiudadBean;
import com.bosonit.bs2.entities.Ciudad;
import com.bosonit.bs2.entities.Persona;
import com.bosonit.bs2.services.ServicioPersona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping(path = "/controlador2")
public class Controlador2 {

    @Autowired
    private ServicioPersona servicioPersona;

    @Autowired
    private CiudadBean ciudadBean;

    @GetMapping("/getPersona")
    public ResponseEntity<Persona> getPersona() {
        Persona persona = this.servicioPersona.getUltimaPersona();
        if (persona == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        persona.envejecer();

        return new ResponseEntity<>(persona, HttpStatus.OK);
    }

    @GetMapping("/getCiudad")
    public ResponseEntity<ArrayList<Ciudad>> getCiudad() {
        ArrayList<Ciudad> ciudades = this.ciudadBean.listarCiudades();

        return new ResponseEntity<>(ciudades, HttpStatus.OK);
    }
}
