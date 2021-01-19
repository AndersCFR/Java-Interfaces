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
public class Dispositivos {
    private String Nombre;
    private String Tipo;
    private String IP;
    private String Mascara;
    private String Servidor;
    private String Host;
    private String puerto;
    private String dns;
    //private String Usuario;

    public Dispositivos(String Nombre,String Tipo, String IP, String Mascara, String Servidor) {
        this.Nombre = Nombre;
        this.Tipo = Tipo;
        this.IP = IP;
        this.Mascara = Mascara;
        this.Servidor = Servidor;
        //this.Usuario = Usuario;
    }
    
    public Dispositivos(String Tipo, String IP, String Host, String Servidor, String puerto, String dns) {
        this.Tipo = Tipo;
        this.IP = IP;
        this.Mascara = Mascara;
        this.Servidor = Servidor;
        this.puerto = puerto;
        this.dns = dns;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public void setIP(String IP) {
        this.IP = IP;
    }

    public void setMascara(String Mascara) {
        this.Mascara = Mascara;
    }


    public void setServidor(String Servidor) {
        this.Servidor = Servidor;
    }
    
    public String getTipo() {
       return Tipo;
    }

    public String getHost() {
        return Host;
    }

    public String getPuerto() {
        return puerto;
    }
    
     public String getIP() {
        return IP;
    }
    public String getMascara() {
        return Mascara;
    }
    public String getServidor() {
        return Servidor;
    }
    
    public String getDNS() {
        return dns;
    }
    
    public String getNombre() {
        return Nombre;
    }
    
    

    @Override
    public String toString() {
        return "\nTipo: " + Tipo + "\nIP: " + IP + "\nMascara: " + Mascara + "\nServidor: " + Servidor;
    }

}
