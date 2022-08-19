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
public class Rastreador extends Personaje{

    public Rastreador() {
    }

    public Rastreador(String nombre, Arma arma, int vida, int escudo) {
        super(nombre, arma, vida, escudo);
    }

    @Override
    public String toString() {
        return "Rastreador{" + '}';
    }
    
    
    
}
