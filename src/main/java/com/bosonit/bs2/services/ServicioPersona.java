package com.bosonit.bs2.services;

import com.bosonit.bs2.entities.Persona;
import org.springframework.stereotype.Service;

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
