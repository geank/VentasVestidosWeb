/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ventas.vestidos.modelo;

/**
 *
 * @author Geank
 */
public class Rol {
    private int idRol;
    private int nombreRol;

    public Rol(int idRol, int nombreRol) {
        this.idRol = idRol;
        this.nombreRol = nombreRol;
    }

    public Rol(int nombreRol) {
        this.nombreRol = nombreRol;
    }

    public Rol() {
    }

    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }

    public int getNombreRol() {
        return nombreRol;
    }

    public void setNombreRol(int nombreRol) {
        this.nombreRol = nombreRol;
    }
    
}
