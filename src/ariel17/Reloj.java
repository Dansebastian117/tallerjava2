/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ariel17;

/**
 *
 * @author Edgar Moctezuma
 */
public class Reloj {
    public static Reloj ins;
    String hora;
    private Reloj(){
        
    }
    public static Reloj get.(){
        if(ins == null){
            ins = new Reloj();
        }
        return ins;
    }
    
    public Reloj getFecha(){
        if(ins == null){
            ins = new Reloj();
        }
        return ins;
        
    }
    
    
}
