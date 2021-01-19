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
public class Nodo {

    private Hora tiempo;
    private Empleado Dato;
    private Dispositivos Dispositivo;
    private Nodo siguiente;
    private Nodo anterior;

    public Nodo(Hora tiempo, Nodo siguiente, Nodo anterior) {
        this.tiempo = tiempo;
        this.siguiente = siguiente;
        this.anterior = anterior;
    }

    public Nodo(Dispositivos Dispositivo, Nodo siguiente, Nodo anterior) {
        this.Dispositivo = Dispositivo;
        this.siguiente = siguiente;
        this.anterior = anterior;
    }

    public Nodo(Empleado Dato, Nodo siguiente, Nodo anterior) {
        this.Dato = Dato;
        this.siguiente = siguiente;
        this.anterior = anterior;
    }

    public Dispositivos getDispositivo() {
        return Dispositivo;
    }

    public void setDispositivo(Dispositivos Dispositivo) {
        this.Dispositivo = Dispositivo;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }

    public Empleado getDato() {
        return Dato;
    }

    public void setDato(Empleado Dato) {
        this.Dato = Dato;
    }

    public Hora getTiempo() {
        return tiempo;
    }

    public void setTiempo(Hora tiempo) {
        this.tiempo = tiempo;
    }
}
