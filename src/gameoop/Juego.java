/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gameoop;

import static gameoop.Aleatorio.acierto;
import java.util.Scanner;

/**
 *
 * @author tutu5
 */
public class Juego {
    
    public static void Jugar (String battle)
    {
        
        Soldier /*ab*/ soldado = new Soldier();
        Cavalry /*bc*/ caballero = new Cavalry();
        Magician /*cd*/ mago = new Magician();
        GameUtil /*de*/gameutil = new GameUtil();
        
        Scanner /*ef*/ scanner = new Scanner(System.in);
        switch(battle)
        {
            case "AD":{
                System.out.println( "\n Guerrero vs Computadora" ) ; 
                int num =0;
                while(gameutil.vive()&&soldado.vive())
                {
                    num++;
                    System.out.println( "Ronda #"+num ) ;
                    if(acierto(soldado.getHr())){
                        gameutil.atacado(soldado.getAttack());
                    }else{
                        gameutil.esquivo();
                    }
                    
                    if(acierto(gameutil.getHr())){
                        soldado.atacado(gameutil.getAttack());
                    }else{
                        soldado.esquivo();
                    }
                    scanner.nextLine();
                }
                break;
            }
            
            case "BD":{
                System.out.println( " \n Caballero vs Computadora" ) ; 
                int num =0;
                while(gameutil.vive()&&caballero.vive())
                {
                    num++;
                    System.out.println( "Ronda #"+num ) ;
                    if(acierto(caballero.getHr())){
                        gameutil.atacado(caballero.getAttack());
                    }else{
                        gameutil.esquivo();
                    }
                    
                    if(acierto(gameutil.getHr())){
                        caballero.atacado(gameutil.getAttack());
                    }else{
                        caballero.esquivo();
                    }
                }
                break;
            }
            
            case "CD":{
                System.out.println( "" ) ; 
                System.out.println( "Mago vs Computadora" ) ; 
                int num =0;
                while(gameutil.vive()&&mago.vive())
                {
                    num++;
                    System.out.println( "Ronda #"+num ) ;
                    if(acierto(mago.getHr())){
                        gameutil.atacado(mago.getAttack());
                    }else{
                        gameutil.esquivo();
                    }
                    
                    if(acierto(gameutil.getHr())){
                        mago.atacado(gameutil.getAttack());
                    }else{
                        mago.esquivo();
                    }
                }
                break;
            }
            
            case "BA":{
                System.out.println( "" ) ; 
                System.out.println( "Caballero vs Guerrero" ) ; 
                int num =0;
                while(soldado.vive()&&caballero.vive())
                {
                    num++;
                    System.out.println( "Ronda #"+num ) ;
                    if(acierto(caballero.getHr())){
                        soldado.atacado(caballero.getAttack());
                    }else{
                        soldado.esquivo();
                    }
                    
                    if(acierto(soldado.getHr())){
                        caballero.atacado(soldado.getAttack());
                    }else{
                        caballero.esquivo();
                    }
                }
                break;
            }
            
            case "CA":{
                System.out.println( "" ) ; 
                System.out.println( "Mago vs Guerrero" ) ; 
                int num =0;
                while(soldado.vive()&&mago.vive())
                {
                    num++;
                    System.out.println( "Ronda #"+num ) ;
                    if(acierto(mago.getHr())){
                        soldado.atacado(mago.getAttack());
                    }else{
                        soldado.esquivo();
                    }
                    
                    if(acierto(soldado.getHr())){
                        mago.atacado(soldado.getAttack());
                    }else{
                        mago.esquivo();
                    }
                }
                break;
            }
            
            case "AB":{
                System.out.println( "" ) ; 
                System.out.println( "Guerrero vs Caballero" ) ; 
                int num =0;
                while(caballero.vive()&&soldado.vive())
                {
                    num++;
                    System.out.println( "Ronda #"+num ) ;
                    if(acierto(soldado.getHr())){
                        caballero.atacado(soldado.getAttack());
                    }else{
                        caballero.esquivo();
                    }
                    
                    if(acierto(caballero.getHr())){
                        soldado.atacado(caballero.getAttack());
                    }else{
                        soldado.esquivo();
                    }
                }
                break;
            }
            
            case "CB":{
                System.out.println( "" ) ; 
                System.out.println( "Mago vs Caballero" ) ; 
                int num =0;
                while(caballero.vive()&&mago.vive())
                {
                    num++;
                    System.out.println( "Ronda #"+num ) ;
                    if(acierto(mago.getHr())){
                        caballero.atacado(mago.getAttack());
                    }else{
                        caballero.esquivo();
                    }
                    
                    if(acierto(caballero.getHr())){
                        mago.atacado(caballero.getAttack());
                    }else{
                        mago.esquivo();
                    }
                }
                break;
            }
            
            case "AC":{
                System.out.println( "" ) ; 
                System.out.println( "Guerrero vs Mago" ) ; 
                int num =0;
                while(mago.vive()&&soldado.vive())
                {
                    num++;
                    System.out.println( "Ronda #"+num ) ;
                    if(acierto(soldado.getHr())){
                        mago.atacado(soldado.getAttack());
                    }else{
                        mago.esquivo();
                    }
                    
                    if(acierto(mago.getHr())){
                        soldado.atacado(mago.getAttack());
                    }else{
                        soldado.esquivo();
                    }
                }
                break;
            }
            
            case "BC":{
                System.out.println( "" ) ; 
                System.out.println( "Caballero vs Mago" ) ; 
                int num =0;
                while(mago.vive()&&caballero.vive())
                {
                    num++;
                    System.out.println( "Ronda #"+num ) ;
                    if(acierto(caballero.getHr())){
                        mago.atacado(caballero.getAttack());
                    }else{
                        mago.esquivo();
                    }
                    
                    if(acierto(mago.getHr())){
                        caballero.atacado(mago.getAttack());
                    }else{
                        caballero.esquivo();
                    }
                }
                break;
            }
            
            
        }
    }
    
}
