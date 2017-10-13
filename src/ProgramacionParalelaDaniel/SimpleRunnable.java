/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgramacionParalelaDaniel;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Edgar Moctezuma
 */
public class SimpleRunnable implements Runnable {

    Thread t;

    @Override

    public void run() {
        System.out.println("Nombre del hilo" + t.getName());
        System.out.println("El Hilo " + t.getName() + "Tiene Prioridad " + t.getPriority());
        System.out.println("El Hilo " + t.getName() + "Está esperando");
        try{
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            Logger.getLogger(SimpleRunnable.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("El Hilo " + t.getName() + "terminó");
            
        }
     public SimpleRunnable(String name) {
        t = new Thread(this, name);
       t.start();
    }
     
     public static void main(String[] args) {
        SimpleRunnable S1 = new SimpleRunnable("uno");
        SimpleRunnable S2 = new SimpleRunnable("dos");
        SimpleRunnable S3 = new SimpleRunnable("tres");
        SimpleRunnable S4 = new SimpleRunnable("cuatro");
        SimpleRunnable S5 = new SimpleRunnable("cinco");
       
        
        
    }

    }

   

