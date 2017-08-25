/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DriverDB;



/**
 *
 * @author Edgar Moctezuma
 */
public class Concrete extends Creator{
    public void create(String TypeDriver) {
        if(TypeDriver.compareTo("MongoDB")== 0){
            driver = new DriverDBMongo();
            ((DriverDBMongo)driver).AbrirConexion();
           ((DriverDBMongo)driver).EstablecerPropiedades();
            ((DriverDBMongo)driver).EstablecerPropiedades();
        }
    }
}
