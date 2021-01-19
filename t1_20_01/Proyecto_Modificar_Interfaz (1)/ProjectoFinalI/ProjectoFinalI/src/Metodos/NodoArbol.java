/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;

/**
 *
 * @author HP
 */
public class NodoArbol {

    private String nombre;
    private NodoArbol iz;
    private NodoArbol der;

    public NodoArbol(String nombre, NodoArbol iz, NodoArbol der) {
        this.nombre = nombre;
        this.iz = iz;
        this.der = der;
    }

    public NodoArbol(String nombre) {
        this.nombre = nombre;
        iz = der = null;
    }

    public NodoArbol() {
        nombre = "";
        iz = der = null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public NodoArbol getIz() {
        return iz;
    }

    public void setIz(NodoArbol iz) {
        this.iz = iz;
    }

    public NodoArbol getDer() {
        return der;
    }

    public void setDer(NodoArbol der) {
        this.der = der;
    }

}
