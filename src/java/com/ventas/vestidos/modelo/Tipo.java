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
public class Tipo {
    private int idTipo;
    private String nombreTipo;
    private String codigoTipo;

    public Tipo() {
    }

    public Tipo(int idTipo, String nombreTipo, String codigoTipo) {
        this.idTipo = idTipo;
        this.nombreTipo = nombreTipo;
        this.codigoTipo = codigoTipo;
    }

    public Tipo(String nombreTipo, String codigoTipo) {
        this.nombreTipo = nombreTipo;
        this.codigoTipo = codigoTipo;
    }

    public int getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(int idTipo) {
        this.idTipo = idTipo;
    }

    public String getNombreTipo() {
        return nombreTipo;
    }

    public void setNombreTipo(String nombreTipo) {
        this.nombreTipo = nombreTipo;
    }

    public String getCodigoTipo() {
        return codigoTipo;
    }

    public void setCodigoTipo(String codigoTipo) {
        this.codigoTipo = codigoTipo;
    }
    
}
