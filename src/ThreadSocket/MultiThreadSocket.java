/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreadSocket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Edgar Moctezuma
 */
public class MultiThreadSocket {
    public static void main(String[] args) {
        try{
          int port = 1111;
        ServerSocket Server = new ServerSocket(port); 
        Socket clientes;
        while(true){
            clientes = Server.accept();
            ProcessRequest p = new ProcessRequest(clientes);
            Thread t = new Thread();
            t.start();
        }
        }catch(IOException ex){
            
        }
        
    }
         
}
