/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barreras;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 *
 * @author Edgar Moctezuma
 */
public class Factorial extends Thread{
    int num;
    CyclicBarrier barrera;
    int resultado;

    public Factorial(int num, CyclicBarrier barrera) {
        this.barrera = barrera;
        this.num = num;
        
        
    }

    public int getResultado() {
        
        return resultado;
    }

    
    
    @Override
    public void run() {
     factorial(num);
        try {
            System.out.println("Calculo Factorial");
            resultado = factorial(num);
            barrera.await();
            System.out.println("Terminó la ejecución");
            
        } catch (InterruptedException ex) {
         
        } catch (BrokenBarrierException ex) {
     
        }
    }
    
    int factorial(int n){
        int accum = 1;
        for (int i = n; i > 0; i--) {
            accum *= i ; 
        }
        return accum;
       
    }
    
}
