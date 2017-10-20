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
public class Cracker extends PadreCracker{

    @Override
    public void setHost(String host) {
        this.host = "197.168.1.0";
        System.out.println(this.host);
    }

    @Override
    public void setIP(String IP) {
        this.IP = "197.168.1.1";
        System.out.println(IP);
    }

    @Override
    public void SetDiccionario(Diccionario diccionario) {
        System.out.println(diccionario);
        this.diccionario = diccionario;
    }

    @Override
    public String crackPWD() {
        return "Hola";
    }
    
    
}
