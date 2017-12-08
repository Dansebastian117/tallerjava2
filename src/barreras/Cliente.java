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
import java.net.Socket;

/**
 *
 * @author Edgar Moctezuma
 */
public class Cliente {
    public static void main(String[] args) {
        String host = "localhost";
       int port = 2242;
       try (Socket socket = new Socket(host, port);
                PrintWriter print = new PrintWriter(socket.getOutputStream(), true);
           BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        )
       
       
       {
          String line = "Soy el cliente y quiero algo";
          print.println(line); //envia al servidor.
           System.out.println(in.readLine()); //leyendo al servidor.
        
    }catch (IOException ex){
           System.out.println(ex.toString());
        }
       
    }
}
