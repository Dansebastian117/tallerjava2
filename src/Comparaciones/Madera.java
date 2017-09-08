/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comparaciones;

/**
 *
 * @author Edgar Moctezuma
 */
public class Madera extends Recursos implements Comparable{
    public int acerrin;
    
    public void talar(){
        System.out.println("Talando");
    }

    
    @Override
    public boolean equals(Object o) {
        if(o.getClass().isInstance(new Petroleo())){
           return (acerrin == ((Petroleo)o).acerrin); 
        }
        return (acerrin == ((Madera)o).acerrin);
    }

    @Override
    public int compareTo(Object t) {
        Madera temp = (Madera)t;
       if(acerrin < temp.acerrin){
           return -1;
       }
       if(acerrin > temp.acerrin){
           return 1;
       }
       return 0;
    }
}
