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
public class Color {
    private int idColor;
    private String nombreColor;
    private String codColor;

    public Color() {
    }

    
    public Color(int idColor, String nombreColor, String codColor) {
        this.idColor = idColor;
        this.nombreColor = nombreColor;
        this.codColor = codColor;
    }
    public Color(String nombreColor, String codColor) {
        this.nombreColor = nombreColor;
        this.codColor = codColor;
    }

    public int getIdColor() {
        return idColor;
    }

    public void setIdColor(int idColor) {
        this.idColor = idColor;
    }

    public String getNombreColor() {
        return nombreColor;
    }

    public void setNombreColor(String nombreColor) {
        this.nombreColor = nombreColor;
    }

    public String getCodColor() {
        return codColor;
    }

    public void setCodColor(String codColor) {
        this.codColor = codColor;
    }
    
}
