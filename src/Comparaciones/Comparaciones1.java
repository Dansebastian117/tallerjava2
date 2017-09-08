/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comparaciones;

/**
 *
 * @author Edgar Moctezuma
 * @param <T>
 
 */
public class Comparaciones1<T> {
    
    public <N extends  Comparable> N mayor(N a, N b){
        
        if(a.compareTo(b)> 0)
        return a;
        return b;
        
    }
    
    public boolean iguales(T a, T b)
    {
        return a.equals(b);
    }
    public<E,R> boolean igualesB(E a, R b){
        return a.equals(b);
    }
    
    public static void main(String[] args) {
        Comparaciones1 c = new Comparaciones1();
        Madera m = new Madera();
        Petroleo v = new Petroleo();
        v.acerrin = 500;
        m.acerrin = 500;
        
        System.out.println("Recurso" + c.iguales(m,v));
        System.out.println("nums" + c.mayor(5, 4));
        
        
                }
}