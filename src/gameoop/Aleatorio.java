/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gameoop;

import java.util.Random;

/**
 *
 * @author tutu5
 */
public class Aleatorio {
    public static boolean acierto(final double hr)
    {
        Random rnd = new Random();
        int resultado = rnd.nextInt(100);
        boolean flag= (resultado< (int)(hr*100));
        
        return flag;
    }
}
