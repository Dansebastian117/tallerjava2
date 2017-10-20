/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MedioTermino;

/**
 *
 * @author Edgar Moctezuma
 */
public class Iterador<T> {
     protected Diccionario<T> diccionario;
    int cont;
    public Iterador(Diccionario<T> diccionario){
        this.diccionario = diccionario;
        cont = 0;
    }
    public boolean hasNext(){
        if(cont < diccionario.lenght()){
            return true;
            
        }
        return false;
    }
    T next(){
        return diccionario.at(cont++);
    }

   
    
}
