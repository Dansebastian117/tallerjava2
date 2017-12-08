/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semaforos;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import java.util.ArrayList;
import java.util.concurrent.Semaphore;

/**
 *
 * @author Edgar Moctezuma
 */
public class CenaChinos implements Runnable {



    Semaphore sillas;
    Semaphore tenedor;
    Semaphore cuchillos;
    String Chino;

    public CenaChinos(String Chino, Semaphore sillas, Semaphore tenedor, Semaphore cuchillos) {

        this.Chino = Chino;
        this.sillas = sillas;
        this.tenedor = tenedor;
        this.cuchillos = cuchillos;
    }

    private CenaChinos() {
  
    }
    
    ArrayList<String> NombresDeGuerra() throws FileNotFoundException{
            String filename = "Nombres.txt";
BufferedReader reader = new BufferedReader(new FileReader(filename));
ArrayList<String> lista = new ArrayList<String>();
try{
  String line;
  //as long as there are lines in the file, print them
  while((line = reader.readLine()) != null){ 
    
    lista.add(line);
  }
} catch (IOException e) {
  e.printStackTrace();
}
        return lista;

    }

    public static void main(String[] args) throws FileNotFoundException {
        CenaChinos c = new CenaChinos();
        ArrayList<String> lista = new ArrayList<String>();
        
      lista = c.NombresDeGuerra();
        
        

Semaphore sillas = new Semaphore(6);
        Semaphore tenedor = new Semaphore(5);
        Semaphore cuchillos = new Semaphore(4);
        
        

        Thread[] j = new Thread[6];
        for (int i = 0; i < 6; i++) {
           j[i] = new Thread(new CenaChinos( lista.get(i), sillas, tenedor, cuchillos));
 j[i].start();
       // }
       

    }
    
    
    }


    @Override
    public void run(){
        long r = (long) (Math.random() * 10000);
        System.out.println(r);

        try {

            sillas.acquire();
            tenedor.acquire();
            cuchillos.acquire();

            System.out.println( Chino + "  Murio en Combate");

            Thread.sleep(r);

            cuchillos.release();
            tenedor.release();
            sillas.release();

        } catch (InterruptedException ex) {

        }
    }
    }

