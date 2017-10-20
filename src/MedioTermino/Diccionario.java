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
public class Diccionario<T> {
    public static Diccionario dic;
    public String[] abc;
    protected int contador;
    private Diccionario(){
        contador = 0;
        abc = new String[5];
    }
    public static Diccionario get(){
        if(dic == null){
            dic = new Diccionario();
        }
        return dic;
        
    }
     
    public void agregarPalabra(String palabras){
        
         abc[contador] = palabras;
         contador = contador + 1;
         }
    
    public T at(int idx){
        
        return (T)abc[idx];
        
    }
    
    public int lenght(){
        return contador;
    }
    
    public Iterador getIterador(){
        return new Iterador<T>(this);
    }
    
}
