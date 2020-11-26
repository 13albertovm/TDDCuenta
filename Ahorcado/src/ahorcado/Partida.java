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
public class Partida {
    int puntos;
    String palabra;
    char[] guiones;
    
    public  Partida(int p){
        this.puntos=p;
    }
    
    
    
    
    public void empezarPartida(Jugador j,Master m){
        boolean fin=false;
        Scanner sc= new Scanner(System.in);
        m.AnadirPalabra(this);
        while(!fin && puntos>0){
            m.mostrarAsterisco();
            boolean que=m.ComprobarLetra(j.ProbarLetra());
            if(!que)
                puntos--;
            if(puntos==0)
                fin=false;
            else{
                System.out.println("Desea probar una palabra? 0-> no");
                int hola=sc.nextInt();
                if(hola!=0)
                {if(m.ComprobarPalabra( j.ProbarPalabra())){
                      System.out.println("HAS GANADO!");
                      fin=true;
                }
                }
                
            }
        }
        if(puntos==0)
            System.out.println("Usted Perdio");
    }
}
