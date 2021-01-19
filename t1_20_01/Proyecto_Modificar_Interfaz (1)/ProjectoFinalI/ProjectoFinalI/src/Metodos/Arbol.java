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
public class Arbol {

    NodoArbol raiz;

    public NodoArbol getraiz() {
        return raiz;
    }

    public Arbol(String raiz) {
        this.raiz = new NodoArbol(raiz);
    }

    public Arbol() {
        raiz = null;
    }

    public void unir(String dato, NodoArbol iz, NodoArbol der) {

        raiz = new NodoArbol(dato, iz, der);
    }

    private void niveles(NodoArbol actual) {
        Cola cA = new Cola();
        cA.encolar(raiz);
        Cola cAux = new Cola();
        while (!cA.esVacia()) {
            NodoArbol aux = cA.desencolar();
            if (aux.getIz() != null) {
                cA.encolar(aux.getIz());
            }
            if (aux.getDer() != null) {
                cA.encolar(aux.getDer());
            }
            cAux.encolar(aux);
        }
        cAux.imprimir();
    }

    public void niveles() {
        niveles(raiz);
    }

}
