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
public abstract class Burger {
    public abstract void GetBurgerType();

    public void setPan(Pan pan) {
        this.pan = pan;
    }

    public void setTomato(Tomato tomato) {
        this.tomato = tomato;
    }

    public void setPiña(Piña piña) {
        this.piña = piña;
    }

    public void setCarne(Carne carne) {
        this.carne = carne;
    }
    protected Pan pan;
   protected Tomato tomato;
   protected Piña piña;
    protected Carne carne;
    
   
    
    
}
