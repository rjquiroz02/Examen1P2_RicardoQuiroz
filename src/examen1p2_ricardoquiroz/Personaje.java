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
public class Personaje {
    protected String nombre;
    protected Arma arma;
    protected int vida, escudo;

    public Personaje() {
    }

    public Personaje(String nombre, Arma arma, int vida, int escudo) {
        this.nombre = nombre;
        this.arma = arma;
        this.vida = vida;
        this.escudo = escudo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getEscudo() {
        return escudo;
    }

    public void setEscudo(int escudo) {
        this.escudo = escudo;
    }

    @Override
    public String toString() {
        return "Personaje{" + "nombre=" + nombre + ", arma=" + arma + ", vida=" + vida + ", escudo=" + escudo + '}';
    }
    
    
    
    
}
