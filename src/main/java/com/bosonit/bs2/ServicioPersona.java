package com.bosonit.bs2;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ServicioPersona {
    private Persona ultimaPersona;
    public Persona crearUsuario(String nombre, String poblacion, int edad) {
        this.ultimaPersona = new Persona(nombre, poblacion, edad);
        return this.ultimaPersona;
    }
    public Persona getUltimaPersona() {
        return this.ultimaPersona;
    }
}
