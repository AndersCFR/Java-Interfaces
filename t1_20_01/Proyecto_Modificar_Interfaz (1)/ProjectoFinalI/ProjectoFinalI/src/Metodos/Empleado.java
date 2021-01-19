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
public class Empleado {

    private String Usuario;
    private String Contraseña;
    private String Nombre;
    private String Cedula;
    private String tipoEquipo;

    public Empleado(String Usuario, String Contraseña) {
        this.Usuario = Usuario;
        this.Contraseña = Contraseña;
    }
    
    public Empleado(String Nombre, String Cedula, String tipoEquipo) {
        this.Nombre=Nombre;
        this.Cedula = Cedula;
        this.tipoEquipo = tipoEquipo;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    @Override
    public String toString() {
        return "Usuario: " + Usuario + "\nContraseña: " + Contraseña;
    }

}
