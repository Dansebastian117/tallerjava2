/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barreras;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Edgar Moctezuma
 */
public class Server {
    public static void main(String[] args) {
          int port = 2242;
       
        try{
           
              ServerSocket s = new ServerSocket(port);
              Socket cliente = s.accept();         
              PrintWriter out = new PrintWriter(cliente.getOutputStream());
              BufferedReader in = new BufferedReader(new InputStreamReader(cliente.getInputStream()));
        String line = "Yo digo Hola";
        while((line = in.readLine())!= null);{
            
            System.out.println(line);
            out.println("Servidor Repite"+ line);
        }
        cliente.close();
        s.close();
        }catch (IOException ex){
            
        
            
        }
       
    }
    
}
