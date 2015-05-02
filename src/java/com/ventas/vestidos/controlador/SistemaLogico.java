/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ventas.vestidos.controlador;

/**
 *
 * @author Geank
 */
public abstract class SistemaLogico 
{
    protected BDController bd;
    
    public SistemaLogico()
    {
        bd = BDController.inicializar();
        //bd = new BaseDatos();
        bd.conectar();
    }
    /**
     * @brief Método abstracto guardar en la Base de datos 
     * @return void
     */
    public abstract void guardarBD();
    
    
    
}
