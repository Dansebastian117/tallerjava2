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
public class ConcreteClass extends Creator{

    @Override
    public void create(String TypeProduct) {
        if(TypeProduct.compareTo("Product1")== 0){
            product = new Product();
            ((Product)product).ConstruirParte1();
            ((Product)product).ContruirParte2();
            
        }
        
         if(TypeProduct.compareTo("Product2")== 0){
             product = new Product2();
            ((Product2)product).Complejo1();
            ((Product2)product).Complejo2();
            
        }
    }
    
}
