/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Package;

import java.util.List;

/**
 *
 * @author usuario
 */
public class Vector {
    protected List<Movimiento> vect;
    
    public Vector(){
        //posible fallo
        vect=null;
    }
    
    public void add(Movimiento m){
        vect.add(m);
    }
}
