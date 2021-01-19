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
public class Cola {

    private NodoCola inicio;
    private NodoCola fin;

    public Cola() {
        inicio = fin = null;
    }

    public boolean esVacia() {
        return inicio == null;
    }

    public NodoArbol desencolar() {
        NodoCola aux = inicio;
        inicio = inicio.getSiguiente();
        if (inicio == null) {
            fin = null;
        }
        return aux.getDato();

    }

    public void encolar(NodoArbol dato) {
        NodoCola nuevo = new NodoCola(dato, null);
        if (inicio == fin && inicio == null) {
            inicio = fin = nuevo;
        } else {
            fin.setSiguiente(nuevo);
            fin = nuevo;

        }
    }

    public void imprimir() {
        NodoCola aux = inicio;
        while (aux != null) {
            System.out.println(aux.getDato().getNombre());
            aux = aux.getSiguiente();
        }

    }

}
