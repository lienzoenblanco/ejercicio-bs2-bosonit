package com.bosonit.bs2.entities;

public class Persona {
    public String nombre;
    public String poblacion;
    public int edad;


    public Persona(String nombre, String poblacion, int edad) {
        this.nombre = nombre;
        this.poblacion = poblacion;
        this.edad = edad;
    }

    public void envejecer() {
        this.edad = this.edad * 2;
    }
}
