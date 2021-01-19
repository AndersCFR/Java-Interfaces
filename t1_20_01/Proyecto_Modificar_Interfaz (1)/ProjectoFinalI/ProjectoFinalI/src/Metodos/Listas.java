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
public class Listas {

    Nodo inicio;
    Nodo fin;

    public boolean esVacia() {
        return inicio == null && fin == null;
    }

    public Listas() {
        inicio = fin = null;
    }

    //insertar los datos
    public void insertarFinE(Dispositivos Dispositivo) {
        Nodo nuevo = new Nodo(Dispositivo, null, fin);
        if (esVacia()) {
            inicio = fin = nuevo;
        } else {
            fin.setSiguiente(nuevo);
            fin = nuevo;
        }
    }

    public void insertarFin(Empleado Dato) {
        Nodo nuevo = new Nodo(Dato, null, fin);
        if (esVacia()) {
            inicio = fin = nuevo;
        } else {
            fin.setSiguiente(nuevo);
            fin = nuevo;
        }
    }

    //insertar tiempo
    public void insertarFinT(Hora tiempo) {
        Nodo nuevo = new Nodo(tiempo, null, fin);
        if (esVacia()) {
            inicio = fin = nuevo;
        } else {
            fin.setSiguiente(nuevo);
            fin = nuevo;
        }
    }

    //ver que no se ingrese un dispositivo igual
    public Boolean Comprobar(String ip) {
        Nodo aux = inicio;
        while (aux != null) {
            if (aux.getDispositivo().getIP().compareTo(ip) == 0) {
                System.out.println("Elemento ya registrado anteiormente");
                return true;
            }
            aux = aux.getSiguiente();
        }
        return false;
    }

    //verificar que no este duplicado
    public Boolean Duplicado() {
        Nodo aux = inicio;
        while (aux != null) {
            if (aux.getDispositivo().getIP().compareTo(aux.getDispositivo().getIP()) == 0) {
                return true;
            }
            aux = aux.getSiguiente();
        }
        return false;
    }

    //imprimir los dispositivos
    public void imprimirDis() {
        if (esVacia()) {
            System.out.println("No hay elementos");
        } else {
            Nodo aux = inicio;
            System.out.println("Dispositivo ");
            while (aux != null) {
                System.out.println(aux.getDispositivo().toString());
                aux = aux.getSiguiente();
            }
        }
    }

    //imprimir los usuarios 
    public void imprimirEmpleado() {
        if (esVacia()) {
            System.out.println("No hay elementos");
        } else {
            Nodo aux = inicio;
            System.out.println("USUARIOS: ");
            while (aux != null) {
                System.out.println(aux.getDato().toString());
                aux = aux.getSiguiente();
            }
        }
    }

    public void entrada() {
        if (esVacia()) {
            System.out.println("No hay elementos");
        } else {
            Nodo aux = inicio;
            while (aux != null) {
                if (aux.getTiempo().getHora() == 8 && aux.getTiempo().getMinuto() > 0) {
                    System.out.println("Usted esta atrasado");
                }
                aux = aux.getSiguiente();
            }
        }
    }

    public void almuerzo() {
        if (esVacia()) {
            System.out.println("No hay elementos");
        } else {
            Nodo aux = inicio;
            while (aux != null) {
                if (aux.getTiempo().getHora() == 14 && aux.getTiempo().getMinuto() > 0) {
                    System.out.println("Usted esta atrasado");
                }
                aux = aux.getSiguiente();
            }
        }
    }

    public void salida() {
        if (esVacia()) {
            System.out.println("No hay elementos");
        } else {
            Nodo aux = inicio;
            while (aux != null) {
                if (aux.getTiempo().getHora() < 17 && aux.getTiempo().getMinuto() > 0) {
                    System.out.println("Usted esta saliendo antes");
                }
                aux = aux.getSiguiente();
            }
        }
    }

    public void imprimirTiempo() {
        if (esVacia()) {
            System.out.println("No hay elementos");
        } else {
            Nodo aux = inicio;
            while (aux != null) {
                System.out.println(aux.getTiempo().toString());
                aux = aux.getSiguiente();
            }
        }
    }
    
    public int faltas(){
        int cont=-1,cont1=-1,cont2=-1,to=0;
        Nodo aux = inicio;
        while (aux != null) {
            //entrada
            if (aux.getTiempo().getHora() == 8 && aux.getTiempo().getMinuto() > 0) {
                    cont++;
                }
            //almuerzo
            if (aux.getTiempo().getHora() == 14 && aux.getTiempo().getMinuto() > 0) {
                    cont1++;
                }
            //salida
            if (aux.getTiempo().getHora() < 17 && aux.getTiempo().getMinuto() > 0) {
                    cont2++;
            }            
            aux = aux.getSiguiente();
        }
        to=cont+cont1+cont2;

        return to;
    }
    
    public void imprimirAtra(){        
        System.out.println("La empresa tiene un total de "+faltas()+" faltas");
    }

    
    public Empleado eliminarInicio() {
        if (esVacia()) {
            System.out.println("No hay elementos a eliminar");
        }
        Nodo aux = inicio;
        inicio = inicio.getSiguiente();
        if (inicio == null) {
            fin = null;
        }
        aux.setSiguiente(null);
        return aux.getDato();
    }

    //saber si el usuario esta en la categoria correcta
    public Boolean identificador(String nom, String contra) {
        Nodo aux = inicio;
        if (esVacia()) {
            System.out.println("No hay elementos");
        } else {
            while (aux != null) {
                if (aux.getDato().getUsuario().compareTo(nom) == 0) {
                    if (aux.getDato().getContraseña().compareTo(contra) == 0) {
                        return true;
                    }
                }
                aux = aux.getSiguiente();
            }
        }
        return false;
    }

    //buscar por el ip de los equipos retorna true si hay si no no existen
    public Boolean buscarip(String modifi) {
        Nodo aux = inicio;
        if (esVacia()) {
            System.out.println("No hay elementos");
        } else {
            while (aux != null) {
                if (aux.getDispositivo().getIP().compareTo(modifi) == 0) {
                    return true;
                }
                aux = aux.getSiguiente();
            }
        }
        return false;
    }

    //buscar si existe un equipo y retornar el nombre del equipo encontrado 
    public void buscar(String modifi) {
        Nodo aux = inicio;
        if (esVacia()) {
            System.out.println("No hay elementos");
        } else {
            while (aux != null) {
                if (aux.getDispositivo().getIP().compareTo(modifi) == 0) {
                    System.out.println("El dispositivo " + aux.getDispositivo().getTipo() + " esta en el sistema");
                }
                aux = aux.getSiguiente();
            }
        }
    }

    //buscar usuario por su nombre retorna true si hay sino no false
    public Boolean buscarUsuario(String nom) {
        Nodo aux = inicio;
        if (esVacia()) {
            System.out.println("No hay un Usuario con ese nombre");
        } else {
            while (aux != null) {
                if (aux.getDato().getUsuario().compareTo(nom) == 0) {
                    return true;
                }
                aux = aux.getSiguiente();
            }
        }
        return false;
    }

    //eliminar el equipo mandando el ip como parametro
    public Dispositivos eliminarPorIP(String modifi) {
        if (esVacia()) {
            System.out.println("No hay nada a eliminar");
        }
        Nodo aux = inicio;
        if (inicio.getDispositivo().getIP().compareToIgnoreCase(modifi) == 0) {

            if (inicio == fin) {
                inicio = null;
                fin = null;
            } else {
                inicio = inicio.getSiguiente();
                aux.setSiguiente(null);
            }
            return aux.getDispositivo();
        } else {
            Nodo ant = null;
            while (aux != null && aux.getDispositivo().getIP().compareToIgnoreCase(modifi) != 0) {
                ant = aux;
                aux = aux.getSiguiente();
            }
            if (aux != null) {
                ant.setSiguiente(aux.getSiguiente());
                aux.setSiguiente(null);
                if (aux == fin) {
                    fin = ant;
                }
                return aux.getDispositivo();
            } else {
                System.out.println("No hay equipos con el Ip: " + modifi);
            }

        }
        return null;
    }

    //eliminar el usuario mandando el nombre como parametro
    public Empleado eliminarUsuario(String nom) {
        if (esVacia()) {
            System.out.println("No hay nada a eliminar");
        }
        Nodo aux = inicio;
        if (inicio.getDato().getUsuario().compareToIgnoreCase(nom) == 0) {

            if (inicio == fin) {
                inicio = null;
                fin = null;
            } else {
                inicio = inicio.getSiguiente();
                aux.setSiguiente(null);
            }
            return aux.getDato();
        } else {
            Nodo ant = null;
            while (aux != null && aux.getDato().getUsuario().compareToIgnoreCase(nom) != 0) {
                ant = aux;
                aux = aux.getSiguiente();
            }
            if (aux != null) {
                ant.setSiguiente(aux.getSiguiente());
                aux.setSiguiente(null);
                if (aux == fin) {
                    fin = ant;
                }
                return aux.getDato();
            } else {
                System.out.println("No hay equipos con el Ip: " + nom);
            }
        }
        return null;
    }

       public Empleado buscarIndice(int indice) throws Exception {
        if (esVacia()) {
            throw new Exception("buscar vacia!");
        }
        int cont = 1;
        Nodo aux = inicio;
        while (cont < indice) {
            aux = aux.getSiguiente();
            cont++;
        }
        return aux.getDato();
    }

    
    public Dispositivos Indice(int indice) throws Exception {
        if (esVacia()) {
            throw new Exception("Buscar vacia!");
        }
        int cont = 1;
        Nodo aux = inicio;
        while (cont < indice) {
            aux = aux.getSiguiente();
            cont++;
        }
        return aux.getDispositivo();

    }

    public Hora Indice2(int indice) throws Exception {
        if (esVacia()) {
            throw new Exception("buscar vacia!");
        }
        int cont = 1;
        Nodo aux = inicio;
        while (cont < indice) {
            aux = aux.getSiguiente();
            cont++;
        }
        return aux.getTiempo();

    }
    public Arbol[] arboles(Listas l1, Listas l2, Listas l4) {

        Nodo aux1 = l1.inicio;
        Nodo aux2 = l2.inicio;
        Nodo aux4 = l4.inicio;

        int i = 0;

        Arbol arboles[] = new Arbol[20];

        while (aux1 != null) {
            Arbol a1 = new Arbol(aux1.getDato().getUsuario());
            Arbol iz1 = new Arbol();
            Arbol der1 = new Arbol();
            while (aux2 != null && (iz1.getraiz() == null || der1.getraiz() == null)) {
                Arbol a2 = new Arbol(aux2.getDato().getUsuario());
                Arbol iz2 = new Arbol();
                Arbol der2 = new Arbol();

                while (aux4 != null && (iz2.getraiz() == null || der2.getraiz() == null)) {
                    Arbol a4 = new Arbol(aux4.getDato().getUsuario());

                    if (iz2.getraiz() == null) {
                        iz2 = new Arbol(aux4.getDato().getUsuario());
                    } else if (der2.getraiz() == null) {
                        der2 = new Arbol(aux4.getDato().getUsuario());
                    }
                    aux4 = aux4.getSiguiente();
                    l4.eliminarInicio();
                }

                Arbol L22 = new Arbol();
                L22.unir(a2.getraiz().getNombre(), iz2.getraiz(), der2.getraiz());
                if (iz1.getraiz() == null) {
                    iz1 = L22;
                } else if (der1.getraiz() == null) {
                    der1 = L22;
                }
                aux2 = aux2.getSiguiente();
                l2.eliminarInicio();

            }
            Arbol L11 = new Arbol();
            L11.unir(a1.getraiz().getNombre(), iz1.getraiz(), der1.getraiz());
            arboles[i] = L11;
            i++;
            aux1 = aux1.getSiguiente();
        }
        return arboles;
    }

    
    /// gen clases
    public void imprimirEquipo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Hora TiempoOK(int hora, int minutos, int segundos, int hora2, int minutos2, int segundos2, String userOK) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public void imprimirUsuario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String equipos(String nom) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
