/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ventas.vestidos.controlador;
import java.sql.*;
/**
 *
 * @author Geank
 */
public class BDController {
    private static BDController instance=null;
    //BaseDatos* instance;
    private Connection conexion;
    private ResultSet rpta;
    
    public BDController ()
    {
        
    }
    public ResultSet getRespuesta()
    {
        return rpta;
    }
    /**
     * @brief Método estático que devuelve la misma Base de Datos si está creada sino creará una pero sólo una vez
     * @return 
     */        
    public static BDController inicializar()
    {
        if(instance == null)
            instance = new BDController();
        
        return instance;    
    }
    /**
     * @brief Permite realizar consultas a la base de datos, mediante comandos sql
     * @param consul
     * @return boolean
     */
    public boolean consulta(String consul)
    {
        System.out.println(consul);
        try
        {
            Statement statement = conexion.createStatement();
            rpta =statement.executeQuery(consul);
            return true;
        }
        catch(SQLException sqle) 
        {
            return false;
        }

    }
    /**
     * @brief Método que se conecta a la Base de Datos, en éste caso a Postgresql
     * @return 
     */
    public String conectar()
    {
        try 
        {
            // Load the driver class
            Class.forName("org.postgresql.Driver");

            // Define the data source for the driver
            String sourceURL = "jdbc:postgresql://localhost:5432/BDVentas";

            // Create a connection through the DriverManager 
            conexion = DriverManager.getConnection(sourceURL, "postgres", "triko12");
            //Connection databaseConnection = DriverManager.getConnection(sourceURL);
            
            return "Connection is: "+conexion;
        } 
        catch(ClassNotFoundException cnfe ) 
        {
            return "Error 1: "+cnfe;
        } 
        catch(SQLException sqle) 
        {
            return "Error 2: "+sqle;
        }
    }

}
