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
public class Log {
    private int idUsuario;
    private String timestampinicio;
    private String timestampfin;

    public Log() {
    }

    
    public Log(int idUsuario, String timestampinicio, String timestampfin) {
        this.idUsuario = idUsuario;
        this.timestampinicio = timestampinicio;
        this.timestampfin = timestampfin;
    }

    
    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getTimestampinicio() {
        return timestampinicio;
    }

    public void setTimestampinicio(String timestampinicio) {
        this.timestampinicio = timestampinicio;
    }

    public String getTimestampfin() {
        return timestampfin;
    }

    public void setTimestampfin(String timestampfin) {
        this.timestampfin = timestampfin;
    }
    
    
}
