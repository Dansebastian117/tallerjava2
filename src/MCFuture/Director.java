/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MCFuture;

/**
 *
 * 
 */
public class Director {
    protected Builder builder;
    public Builder getBuilder(String tipo){
        if(tipo == "Hawaiana"){
            return new HawaiBuilder();
        }
        if(tipo == "Doble"){
            return new DoubleBuilder();
        }
        return new DoubleBuilder();
    }
        public Burger orderHamb(String tipo){
            builder = getBuilder(tipo);
            builder.createBurger();
            return builder.GetBurger();
        
    }
}
