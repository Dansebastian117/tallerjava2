/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamenAriel.FinalAriel;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Edgar Moctezuma
 */
public class ProcessRequest implements Runnable{
    StringBuffer mensaje;
Vector vector = new Vector();
    Socket clientes;
    ProcessRequest(Socket clientes, Vector vector) {
       this.clientes = clientes;
       this.vector = vector;
       
    }

   

    @Override
    public void run() {
       int c;
       mensaje = new StringBuffer();
      
      
        try {
            BufferedInputStream bis = new BufferedInputStream(clientes.getInputStream());
            InputStreamReader isr = new InputStreamReader(bis);
            
            BufferedOutputStream bos = new BufferedOutputStream(clientes.getOutputStream());
            OutputStreamWriter osw = new OutputStreamWriter(bos);
            
            while((c = isr.read())!= (char)13)
            {
               mensaje.append((char)c);
                
            
        }
            System.out.println("Cliente dice " + mensaje);
            vector.add(mensaje);
           
            System.out.println();
            osw.write("Request Accepted " + (char)13);
            osw.flush();
            
            clientes.close();
        } catch (IOException ex) {
            
        }
       
    }
    
}
