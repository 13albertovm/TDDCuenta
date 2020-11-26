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
public class Master {
     public String Nombre;
     protected String adivina;
     char[] guiones,asterisco;
     Scanner sc= new Scanner(System.in);
    
    public Master(String n){
        this.Nombre=n;
    }
    
    
    public void AnadirPalabra(Partida P){
        this.adivina="kelvin";        
        guiones= adivina.toCharArray();
        asterisco=new char[guiones.length];
        for (int i = 0; i < guiones.length; i++) {
            asterisco[i]='*';
        }
    }
    
    public boolean ComprobarLetra(char a){
        boolean que=false;
        for (int i = 0; i < guiones.length; i++) {
            if(guiones[i]==a)
            {asterisco[i]=a;
            que=true;
            }
        }
        return que;
    }
    public void mostrarAsterisco(){
        for (int i = 0; i < asterisco.length; i++) {
            System.out.print(asterisco[i]); 
        }
        System.out.println("");
    }
    public boolean ComprobarPalabra(String probar){
        boolean que=false;
        System.out.println("Adivina: "+adivina);
        if(adivina.equals(probar)){
            que=true;
        }
        return que;
    }
}
