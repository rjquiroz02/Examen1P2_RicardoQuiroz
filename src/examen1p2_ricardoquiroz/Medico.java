/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1p2_ricardoquiroz;

/**
 *
 * @author rjqer
 */
public class Medico extends Personaje{

    public Medico() {
    }

    public Medico(String nombre, Arma arma, int vida, int escudo) {
        super(nombre, arma, vida, escudo);
    }

    @Override
    public String toString() {
        return "Medico{" + '}';
    }

    @Override
    public int danotipo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
