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
public class Test {
    public static void main(String[] args) {
        Collection<String> strs = new Collection<String>(10);
        strs.add("Zapato 1");
        strs.add("Zapato 2");
        strs.add("Zapato 3");
        strs.add("Zapato 4");
        strs.add("Zapato 5");
        strs.add("Zapato 6");
        strs.add("Zapato 7");
        strs.add("Zapato 8");
        strs.add("Zapato 9");
        
        Iterator1 itt = strs.getIterator();
        
        while(itt.hasNext()){
            System.out.println(""itt.next());
        }
        
    }
}
