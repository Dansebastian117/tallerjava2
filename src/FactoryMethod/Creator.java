/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryMethod;

/**
 *
 * @author Edgar Moctezuma
 */
public abstract class Creator {
    public abstract void create(String TypeProduct);
    public  Padrino  FactoryMethod(String TypeProduct){
       
        create(TypeProduct);
        return product;
    }
    protected Padrino product;
}
