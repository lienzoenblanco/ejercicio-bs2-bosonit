package com.bosonit.bs2.beans;

import com.bosonit.bs2.entities.Ciudad;

import java.util.ArrayList;

public class CiudadBeanImpl implements CiudadBean {
    private ArrayList<Ciudad> ciudades;

    public CiudadBeanImpl(){
        System.out.println("Creando lista de ciudades");
        this.ciudades = new ArrayList<Ciudad>();
    }

    @Override
    public void addCiudad(Ciudad nuevaCiudad) {
        this.ciudades.add(nuevaCiudad);
    }

    @Override
    public ArrayList<Ciudad> listarCiudades() {
        return ciudades;
    }
}
