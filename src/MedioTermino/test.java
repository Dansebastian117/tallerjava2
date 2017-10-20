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
public class test {
    public static void main(String[] args) {
        Diccionario d = Diccionario.get();
        d.agregarPalabra("Hola");
        System.out.println(d.at(0));
     
     
    }
}
