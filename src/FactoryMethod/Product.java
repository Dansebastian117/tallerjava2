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
public class Product extends Padrino{
    void ConstruirParte1(){
        System.out.println("Estoy Construyendo la parte no tan compleja pero un poco compleja numero 1");
    } 
    
    void ContruirParte2(){
        System.out.println("Estoy Construyendo la parte compleja 2");
    }
    
    
}
