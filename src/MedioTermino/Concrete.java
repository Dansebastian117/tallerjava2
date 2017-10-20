/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MedioTermino;

/**
 *
 * @author Edgar Moctezuma
 */
public class Concrete extends Creator{
     
    @Override
    public void create(Diccionario diccionario, String IP, String host) {
        {
            Cracker cracker1 = new Cracker();
            ((Cracker)cracker1).setHost(host);
             ((Cracker)cracker1).setIP(IP);
             ((Cracker)cracker1).SetDiccionario(diccionario);
            
            
        }
        
}
    
}
