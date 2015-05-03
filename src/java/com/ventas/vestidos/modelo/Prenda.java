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
public class Prenda {
    private int idPrenda;
    private String codigoUnico;
    private String descripcion;
    private double precioCompra;
    private double precioVenta;
    private int tipoPrenda;
    private int color;
    private int categoriaPrenda;
    private String talla;
    private int viaje;
    private boolean estado;

    public Prenda() {
    }

    public Prenda(int idPrenda, String codigoUnico, String descripcion, double precioCompra, double precioVenta, int tipoPrenda, int color, int categoriaPrenda, String talla, int viaje, boolean estado) {
        this.idPrenda = idPrenda;
        this.codigoUnico = codigoUnico;
        this.descripcion = descripcion;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.tipoPrenda = tipoPrenda;
        this.color = color;
        this.categoriaPrenda = categoriaPrenda;
        this.talla = talla;
        this.viaje = viaje;
        this.estado = estado;
    }

    public Prenda(String codigoUnico, String descripcion, double precioCompra, double precioVenta, int tipoPrenda, int color, int categoriaPrenda, String talla, int viaje, boolean estado) {
        this.codigoUnico = codigoUnico;
        this.descripcion = descripcion;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.tipoPrenda = tipoPrenda;
        this.color = color;
        this.categoriaPrenda = categoriaPrenda;
        this.talla = talla;
        this.viaje = viaje;
        this.estado = estado;
    }

    public int getIdPrenda() {
        return idPrenda;
    }

    public void setIdPrenda(int idPrenda) {
        this.idPrenda = idPrenda;
    }

    public String getCodigoUnico() {
        return codigoUnico;
    }

    public void setCodigoUnico(String codigoUnico) {
        this.codigoUnico = codigoUnico;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public int getTipoPrenda() {
        return tipoPrenda;
    }

    public void setTipoPrenda(int tipoPrenda) {
        this.tipoPrenda = tipoPrenda;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getCategoriaPrenda() {
        return categoriaPrenda;
    }

    public void setCategoriaPrenda(int categoriaPrenda) {
        this.categoriaPrenda = categoriaPrenda;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public int getViaje() {
        return viaje;
    }

    public void setViaje(int viaje) {
        this.viaje = viaje;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }   
}
