package com.bosonit.bs2.beans;

import com.bosonit.bs2.entities.Ciudad;

import java.util.ArrayList;

public interface CiudadBean {
    public void addCiudad(Ciudad nuevaCiudad);
    public ArrayList<Ciudad> listarCiudades();
}
