/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semaforos;

import java.util.concurrent.Semaphore;

/**
 *
 * @author Edgar Moctezuma
 */
public class Semaforo implements Runnable{
String s;

    public Semaforo(String s, Semaphore silla, Semaphore cuchillo, Semaphore tenedor) {
        this.s = s;
        this.sm = sm;
    }
    
    public static void main(String[] args) {
        
        Semaphore silla = new Semaphore(6);
        Semaphore cuchillo = new Semaphore(4);
        Semaphore tenedor = new Semaphore(5);
        
        
        Thread tq0 = new Thread(new Semaforo("Chino 1", silla));
        Thread tq1 = new Thread(new Semaforo("hilo 2", silla));
        Thread tq2 = new Thread(new Semaforo("hilo 3", silla));
        Thread tq3 = new Thread(new Semaforo("hilo 4", silla));
        Thread tq4 = new Thread(new Semaforo("hilo 5", silla));
        Thread tq5 = new Thread(new Semaforo("hilo 6", silla));
        
        tq0.start();
        tq1.start();
        tq2.start();
        tq3.start();
        tq4.start();
        tq5.start();
    }

    
    @Override
    public void run() {
        
      
        try{
              
              silla.acquire();
              tenedor.aquire();
              cuchillo.aquire();
              
              
            Thread.sleep(5000);
            System.out.println("El hilo dice:" + s);
            sm.release();
          
        } catch (InterruptedException ex){
            
        }
      
    }
    
}
