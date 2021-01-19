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
public class Hora {

    private String usuario;
    private int hora;
    private int minuto;
    private int segundo;

    public Hora(String usuario, int hora, int minuto, int segundo) {
        this.usuario = usuario;
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public Hora() {

    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

    @Override
    public String toString() {
        return "Usuario:" + usuario + "\nHora: " + hora + ":" + minuto + ":" + segundo;
    }

}
