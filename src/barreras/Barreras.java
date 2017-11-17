/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barreras;

import java.util.concurrent.CyclicBarrier;

/**
 *
 * @author Edgar Moctezuma
 */
public class Barreras {
    
    public static void main(String[] args) {
      
       
        Runnable saludos = new Runnable() {

            @Override
            public void run() {
                System.out.println("Imagenes Listas");
            }
        };
          CyclicBarrier barrera = new CyclicBarrier(10, saludos);
          Thread[]arreglo = new Thread[10];
          for (int i = 0; i < 10; i++) {
              arreglo[i] = new Thread(new Factorial(i+1, barrera));
              arreglo[i].start();
            
        }
    
    }
  
    
    
}
