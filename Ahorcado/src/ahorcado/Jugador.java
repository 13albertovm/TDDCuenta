/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahorcado;

import java.util.Scanner;

/**
 *
 * @author injun
 */
public class Jugador {
    public String Nombre;
    Scanner sc= new Scanner(System.in);
    public Jugador(String n){
        this.Nombre=n;
    }
    
    public char ProbarLetra(){
        System.out.println("Escriba una letra: ");
        char letra= sc.next().charAt(0);
        return letra;
    }
    
    public String ProbarPalabra(){
        System.out.println("Escriba la palabra: ");
        String pal= sc.next();
        return pal;
    }
}
