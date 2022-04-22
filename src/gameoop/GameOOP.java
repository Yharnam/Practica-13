/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameoop;

import static gameoop.Aleatorio.acierto;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;
import static gameoop.Juego.*;

/**
 *
 * @author Amanda
 * @editor Christopher Alarcón
 * Proyecto: Juego POO
 * Fecha: 20/04/2022
 * Version: 1.1
 * Comentario: Se refactorizo parte de el cofigo para una mejor comprensión de el mismo
 */
public class GameOOP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String role = "";
        String opponent = "";
        Scanner /*ef*/ scanner = new Scanner(System.in);
        
        System.out.println("Por favor seleccione un personaje e ingrese el literal del personaje: " ) ; 
	System.out.println( "A: Guerrero") ; 
	System.out.println( "B: Caballero" ) ; 
	System.out.println( "C: Mago " ) ; 
	role = scanner.nextLine();
        
        System.out.println("Por favor seleccione un oponente e ingrese el literal del personaje: " ) ; 
	System.out.println( "A: Guerrero") ; 
	System.out.println( "B: Caballero" ) ; 
	System.out.println( "C: Mago " ) ; 
        System.out.println( "D: Computadora " ) ; 
	opponent = scanner.nextLine();
        
        if(role.equals(opponent))
        {
            System.out.println( "El personaje principal y el oponente no pueden ser el mismo... Elija otro oponente" ); 
            opponent = scanner.nextLine();
        }
        
        Juego.Jugar(role + opponent);

    }
    
}
