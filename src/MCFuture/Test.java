/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MCFuture;

/**
 *
 * @author Edgar Moctezuma
 */
public class Test {
    public static void main(String[] args) {
        Director d = new Director();
        
       Burger b = (Hawai1)d.orderHamb("Hawaiana");
       Burger b1 = (Double)d.orderHamb("Doble");
       b.GetBurgerType();
       b1.GetBurgerType();
    }
}
