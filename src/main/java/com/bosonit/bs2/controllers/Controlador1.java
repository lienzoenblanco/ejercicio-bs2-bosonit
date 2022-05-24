package com.bosonit.bs2.controllers;

import com.bosonit.bs2.beans.CiudadBean;
import com.bosonit.bs2.entities.Ciudad;
import com.bosonit.bs2.entities.Persona;
import com.bosonit.bs2.services.ServicioPersona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/controlador1")
public class Controlador1 {
    @Autowired
    private ServicioPersona servicioPersona;

    @Autowired
    private CiudadBean ciudadBean;

    @GetMapping("/addPersona")
    public Persona addPersona(
            @RequestHeader("nombre") String nombre,
            @RequestHeader("poblacion") String poblacion,
            @RequestHeader("edad") int edad
    ) {
        return this.servicioPersona.crearUsuario(nombre,poblacion,edad);
    }

    @PostMapping("/addCiudad")
    public ResponseEntity addCiudad(@RequestBody Ciudad nuevaCiudad) {
        this.ciudadBean.addCiudad(nuevaCiudad);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
