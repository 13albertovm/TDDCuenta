/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahorcado;

/**
 *
 * @author injun
 */
public class ahorcado {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Jugador j=new Jugador("Rodrygo");
        Master m=new Master("Eden");
        Partida p= new Partida(8);
        
        p.empezarPartida(j, m);
        
    }
    
    
}
