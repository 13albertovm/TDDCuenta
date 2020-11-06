/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Package;

import java.util.List;

/**
 *
 * @author injun
 */
public class Cuenta {
    
    protected String mNumero;
    protected String mTitular;
    protected Vector mMovimientos;
    private static double Saldo;

    public Cuenta(String numero, String titular) {
        mNumero = numero;
        mTitular = titular;
        mMovimientos = new Vector();
        Saldo=0;
    }

    public void ingresar(double x) throws Exception {
        if (x < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        Movimiento m = new Movimiento();
        m.setConcepto("Ingreso en efectivo");
        Saldo+=x;
        m.setImporte(x);
        //this.mMovimientos.add(m);
    }

    public void retirar(double x) throws Exception {
        if (x <= 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (getSaldo() < x) {
            throw new Exception("Saldo insuficiente");
        }
        Saldo-=x;
        Movimiento m = new Movimiento();
        m.setConcepto("Retirada de efectivo");
        m.setImporte(-x);
        //this.mMovimientos.add(m);
    }

    /**
     * @return the Saldo
     */
    public double getSaldo() {
        return Saldo;
    }

    /**
     * @param Saldo the Saldo to set
     */
    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }
}
