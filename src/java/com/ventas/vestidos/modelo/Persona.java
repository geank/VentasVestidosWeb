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
public class Persona {
    private int idPersona;
    private String nombrePersona;
    private String apPaterno;
    private String apMaterno;
    private String email;

    public Persona(){}
    public Persona(int idPersona, String nombrePersona, String apPaterno, String apMaterno, String email) {
        this.idPersona = idPersona;
        this.nombrePersona = nombrePersona;
        this.apPaterno = apPaterno;
        this.apMaterno = apMaterno;
        this.email = email;
    }
    public Persona(String nombrePersona, String apPaterno, String apMaterno, String email) {
        this.nombrePersona = nombrePersona;
        this.apPaterno = apPaterno;
        this.apMaterno = apMaterno;
        this.email = email;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public String getApPaterno() {
        return apPaterno;
    }

    public void setApPaterno(String apPaterno) {
        this.apPaterno = apPaterno;
    }

    public String getApMaterno() {
        return apMaterno;
    }

    public void setApMaterno(String apMaterno) {
        this.apMaterno = apMaterno;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
