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
public class Arma {
    private String nombre;
    private int dano, precision;

    public Arma() {
    }

    public Arma(String nombre, int dano, int precision) {
        this.nombre = nombre;
        this.dano = dano;
        this.precision = precision;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public int getPrecision() {
        return precision;
    }

    public void setPrecision(int precision) {
        this.precision = precision;
    }

    @Override
    public String toString() {
        return "Arma{" + "nombre=" + nombre + ", dano=" + dano + ", precision=" + precision + '}';
    }
    
    
    
    
}
