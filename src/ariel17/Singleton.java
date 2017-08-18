/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ariel17;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Edgar Moctezuma
 */
public class Singleton {
    public static Singleton instance;
    private Singleton(){
    Date date = new Date();
}
    public static Singleton getInstance()
            
    {
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
    void getHora(){
           System.out.println( new SimpleDateFormat(" HH:mm:ss").format(Calendar.getInstance().getTime()) );

    }
    void getFecha(){
        System.out.println( new SimpleDateFormat("yyyy/MM/dd ").format(Calendar.getInstance().getTime()) );
    }
}
