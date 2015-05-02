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
public class Usuario {
    private int idUsuario;
    private int idPersona;
    private int rol;
    private String username;
    private String password;

    public Usuario() {
    }

    public Usuario(int idUsuario, int idPersona, int rol, String username, String password) {
        this.idUsuario = idUsuario;
        this.idPersona = idPersona;
        this.rol = rol;
        this.username = username;
        this.password = password;
    }

    public Usuario(int idPersona, int rol, String username, String password) {
        this.idPersona = idPersona;
        this.rol = rol;
        this.username = username;
        this.password = password;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public int getRol() {
        return rol;
    }

    public void setRol(int rol) {
        this.rol = rol;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
