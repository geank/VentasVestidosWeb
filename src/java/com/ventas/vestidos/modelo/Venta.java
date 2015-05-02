/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ventas.vestidos.modelo;

import java.util.Date;

/**
 *
 * @author Geank
 */
public class Venta {
    private int idVenta;
    private String numBoleta;
    private Date fecha;
    private double totalVenta;
    private double descuento;

    public Venta() {
    }

    public Venta(int idVenta, String numBoleta, Date fecha, double totalVenta, double descuento) {
        this.idVenta = idVenta;
        this.numBoleta = numBoleta;
        this.fecha = fecha;
        this.totalVenta = totalVenta;
        this.descuento = descuento;
    }

    public Venta(String numBoleta, Date fecha, double totalVenta, double descuento) {
        this.numBoleta = numBoleta;
        this.fecha = fecha;
        this.totalVenta = totalVenta;
        this.descuento = descuento;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public String getNumBoleta() {
        return numBoleta;
    }

    public void setNumBoleta(String numBoleta) {
        this.numBoleta = numBoleta;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getTotalVenta() {
        return totalVenta;
    }

    public void setTotalVenta(double totalVenta) {
        this.totalVenta = totalVenta;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
    
}
