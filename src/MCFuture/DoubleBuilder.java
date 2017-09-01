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
public class DoubleBuilder extends Builder{

    @Override
    public Burger BBurger() {
        return new Double(); 
        
  }

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
        System.out.println("no piña");
    }

    @Override
    public void BCarne() {
        System.out.println("Dos Carnes");
   }
    
}
