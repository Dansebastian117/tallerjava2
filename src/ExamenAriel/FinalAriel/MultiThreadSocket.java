/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamenAriel.FinalAriel;

import java.io.*;
import java.net.*;

public class MultiThreadSocket
{

    private static Vector vector;
    
    public static void main(String []args)
    {
        
        
       try 
       {
           int port = 1111;
           ServerSocket server = new ServerSocket(port);
           Socket clientes;
           for (int i = 0; i < 10; i++) {
               clientes = server.accept();
               ProcessRequest other=new ProcessRequest(clientes,vector);
               Thread t = new Thread(other);
               t.start();
           }
           for(int i = 0; i<vector.size(); i++) {
                System.out.println(vector.get(i)); 
           }
        }
       
       catch (IOException ex)
       {

       }
    }
}