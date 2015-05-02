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
public class Categoria {
    private int idCategoria;
    private String nombreCategoria;
    private String codCategoria;

    public Categoria() {
    }

    
    public Categoria(String nombreCategoria, String codCategoria) {
        this.nombreCategoria = nombreCategoria;
        this.codCategoria = codCategoria;
    }

    public Categoria(int idCategoria, String nombreCategoria, String codCategoria) {
        this.idCategoria = idCategoria;
        this.nombreCategoria = nombreCategoria;
        this.codCategoria = codCategoria;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    public String getCodCategoria() {
        return codCategoria;
    }

    public void setCodCategoria(String codCategoria) {
        this.codCategoria = codCategoria;
    }
    
    
}
