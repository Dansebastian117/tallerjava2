/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MCFuture;

/**
 *
 * @author Edgar Moctezuma
 */
public class HawaiBuilder extends Builder{


    @Override
    public void BPan() {
      
      burger.setPan(new Pan());
    }

    @Override
    public void BTomato() {
       burger.setTomato(new Tomato());
    }

    @Override
    public void BPiña() {
        burger.setPiña(new Piña());
       
    }

    @Override
    public void BCarne() {
        burger.setCarne(new Carne());
    }

    @Override
    public Burger BBurger() {
     return new Hawai1();    
    }


    
    
}
