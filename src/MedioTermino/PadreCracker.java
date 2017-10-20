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
public abstract class PadreCracker {
    protected String host;
    protected String IP;
    protected Diccionario diccionario;
    
    public abstract void setHost(String host);
    public abstract void setIP(String IP);
     public abstract void SetDiccionario(Diccionario diccionario);
     public abstract String crackPWD();
    
}
