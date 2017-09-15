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
public class Iterator1<T> {
    protected Collection<T> collection;
    int cont;
    public Iterator1(Collection<T> collection) {
        this.collection = collection;
        cont = 0;
    }
    public boolean hasNext(){
        if(cont < collection.lenght()){
            return true;
            
        }
        return false;
    }
    T next(){
        return collection.at(cont++);
    }
    
}
