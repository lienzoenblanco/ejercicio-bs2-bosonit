package com.bosonit.bs2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/controlador1")
public class Controlador1 {
    @Autowired
    private ServicioPersona servicioPersona;

    @GetMapping("/addPersona")
    public Persona addPersona(
            @RequestHeader("nombre") String nombre,
            @RequestHeader("poblacion") String poblacion,
            @RequestHeader("edad") int edad
    ) {
        return this.servicioPersona.crearUsuario(nombre,poblacion,edad);
    }
}
