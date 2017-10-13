/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgramacionParalelaDaniel;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Edgar Moctezuma
 */
public class DaemonThread extends JFrame implements Runnable{
    private Thread t;

    public DaemonThread() {
        setUndecorated(true);
        setSize(new Dimension(150,150));
        getContentPane().add(new JLabel("Tazmanian devil"), BorderLayout.CENTER);
        pack();
        setLocation(50,50);
        setVisible(true);
        t = new Thread(this, "Demonio");
        t.setDaemon(true);
        t.start();
       
    }
    public static void main(String[] args) {
         DaemonThread Daemon = new DaemonThread();
         
    }

    @Override
    public void run() {
        while(true){
            setVisible(true);
            try
            {
                Thread.sleep(2000);
                setVisible (false);
                Thread.sleep(5000);
            }catch(InterruptedException ex)
            {
        }
    }
    
}
    
}
