/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iterator;

/**
 *
 * @author Edgar Moctezuma
 */
public class Collection <T>{

    protected Object[] arreglo;
    protected int cont;
    
    
    public Collection(int size) {
        arreglo = new Object[size];
    }
    
    public T at(int idx){
        
        return (T)arreglo[idx];
        
    }
    
    public void add (T element){
        if(cont < arreglo.length){
           arreglo[cont] = element;
           cont ++;
        }
    }
    public int lenght(){
        return cont;
    }
    public Iterator1 getIterator(){
        return  new Iterator1<T>(this);
    }
}
