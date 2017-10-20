/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MedioTermino;

/**
 *
 * @author Edgar Moctezuma
 */
public abstract class Creator {
    public abstract void create(Diccionario diciconario, String IP, String host);
    public  PadreCracker FactoryMethod1(Diccionario diccionario, String IP, String host){
       
        create(diccionario, IP, host);
        return product;
    }
    protected PadreCracker product;
}


