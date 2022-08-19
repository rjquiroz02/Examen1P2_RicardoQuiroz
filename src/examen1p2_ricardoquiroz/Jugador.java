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
public class Jugador {
    private String nombre, id, contrasena;
    private Personaje personaje;

    public Jugador() {
    }

    public Jugador(String nombre, String id, String contrasena, Personaje personaje) {
        this.nombre = nombre;
        this.id = id;
        this.contrasena = contrasena;
        this.personaje = personaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public Personaje getPersonaje() {
        return personaje;
    }

    public void setPersonaje(Personaje personaje) {
        this.personaje = personaje;
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", id=" + id + ", contrasena=" + contrasena + ", personaje=" + personaje + '}';
    }
    
    
    
    
}
