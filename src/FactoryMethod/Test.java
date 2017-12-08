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
public class Test {
    public static void main(String[] args) {
        Creator c = new ConcreteClass();
        Padrino p = c.FactoryMethod("Product1");
        Padrino p1 = c.FactoryMethod("Product2");
        
        
       
    }
}
