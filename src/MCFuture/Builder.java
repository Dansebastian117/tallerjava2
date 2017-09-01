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
public abstract class Builder {
    
    protected Burger burger;
    public abstract Burger BBurger();
    public abstract void  BPan();
    public abstract void BTomato();
    public abstract void BPiña();
    public abstract void BCarne();
    
    public Burger GetBurger(){
        return burger;
    }
    public void createBurger(){
        burger = BBurger();
      
        BPan();
        BTomato();
        BPiña();
        BCarne();
        
    }
    
}
