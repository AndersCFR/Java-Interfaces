/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;

import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import Interfaces.*;

/**1
 * 
 *
 * @author HP
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    
    public static int leerEntero(String mensaje, int min, int max) {
        Scanner ingreso = new Scanner(System.in);
        int dato = 0;
        do {
            System.out.println(mensaje + " entre " + min + " y " + max + ".");
            dato = ingreso.nextInt();
            if (dato < min || dato > max) {
                System.out.println("Fuera de rango");
            }
        } while (dato < min || dato > max);
        return dato;
    }

    public static String leerString(String mensaje) {
        Scanner ingreso = new Scanner(System.in);
        String dato = "";
        System.out.println(mensaje);
        dato = ingreso.nextLine();
        return dato;
    }
    
    
        public static int menuEmpleado() {
        System.out.println("\t\tEMPRESA ABC BIENVENIDO");
        System.out.println("\t\t***IDENTIFIQUESE***");
        System.out.println("1.Administrador");
        System.out.println("2.Técnico");
        System.out.println("3.Mantenimiento");
        System.out.println("4.Registrar entrada, almuerzo y salida");
        System.out.println("5.Visualizar todos los empleados");//con arboles
        System.out.println("6.Salir");

        int opc = leerEntero("Seleccione una opcion", 1, 6);
        return opc;
    }

    public static int menuTipo() {
        System.out.println("\t\tEMPRESA ABC BIENVENIDO");
        System.out.println("\t***IDENTIFIQUE EL TIPO DE EMPLEADO***");
        System.out.println("");
        System.out.println("1.Administrador");
        System.out.println("2.Técnico");
        System.out.println("3.Mantenimiento");
        System.out.println("4.Salir");

        int usua = leerEntero("Seleccione una opcion", 1, 4);
        return usua;
    }

    public static int menuTecnico() {
        System.out.println("\t\tEMPRESA ABC");
        System.out.println("\t***INGRESO DE DISPOSITIVOS**");
        System.out.println("");
        System.out.println("1.Ingresar");
        System.out.println("2.Visualizar");
        System.out.println("3.Buscar");
        System.out.println("4.Salir");

        int opce = leerEntero("Seleccione una opcion", 1, 4);
        return opce;
    }

    public static int menuAdmin() {
        System.out.println("\t\tEMPRESA ABC");
        System.out.println("\t***ADMINISTRADOR***");
        System.out.println("");
        System.out.println("1.Configurar empleados");
        System.out.println("2.Configurar dispositivos");
        System.out.println("3.Salir");

        int opcead = leerEntero("Seleccione una opcion", 1, 3);
        return opcead;
    }

    public static int menuAdmin1() {
        System.out.println("\t\tEMPRESA ABC");
        System.out.println("\t***EMPLEADOS***");
        System.out.println("");
        System.out.println("1. Ingresar nuevos empleados");
        System.out.println("2. Visualizar la lista de empleados");
        System.out.println("3. Eliminar empleados");
        System.out.println("4. Modificar empleados");
        System.out.println("5. Salir");

        int adu = leerEntero("Seleccione una opcion", 1, 5);
        return adu;
    }

    public static int menuAdmin2() {
        System.out.println("\t\tEMPRESA ABC");
        System.out.println("\t***DISPOSITIVOS***");
        System.out.println("");
        System.out.println("1. Ingresar nuevos dispositivos");
        System.out.println("2. Verificar dispositivo");
        System.out.println("3. Eliminar dispositivo");
        System.out.println("4. Modificar dispositivo");
        System.out.println("5. Lista de los dispositivos");
        System.out.println("6. Salir");

        int equi = leerEntero("Seleccione una opcion", 1, 6);
        return equi;
    }

    public static int menuMantenimiento() {
        System.out.println("\t\tEMPRESA ABC");
        System.out.println("\t***DISPOSITIVOS***");
        System.out.println("");
        System.out.println("1.Visualizar dispositivos");
        System.out.println("2.Modificar dispositivos");
        System.out.println("3.Comprobar que no existan dispositivos duplicados");
        System.out.println("4.Eliminar dispositivo");
        System.out.println("5.Buscar dispositivo");
        System.out.println("6.Salir");

        int man = leerEntero("Seleccione una opcion", 1, 6);
        return man;
    }

    public static int menuRegistro() {
        System.out.println("\t\tEMPRESA ABC");
        System.out.println("\t***REGISTRO***");
        System.out.println("Tenga en cuenta los atrasos son considerados faltas");
        System.out.println("1.Registrar Ingreso");
        System.out.println("2.Registrar Almuerzo");
        System.out.println("3.Registrar Salida");
        System.out.println("4.Visualizar historial de registros");
        System.out.println("5.Salir");

        int man = leerEntero("Seleccione una opcion", 1, 5);
        return man;
    }

    public static void main(String[] args) throws IOException {
        int opc = 0, opce = 0, man = 0, equi = 0, adu = 0, opcead = 0, usua = 0; 
        int hora = 0, minutos = 0, segundos = 0, hora2 = 0, minuto2 = 0, segundo2 = 0;
        Listas Tecni = new Listas();
        Listas tiempo = new Listas();
        Listas Dispo = new Listas();
        Listas Mante = new Listas();
        Listas Admin = new Listas();
        //ADMINISTRADOR
        Admin.insertarFin(new Empleado("Juan", "0000"));
        //TECNICO
        Tecni.insertarFin(new Empleado("Luis", "1111"));
        //MANTENIMIENTO
        Mante.insertarFin(new Empleado("Pedro", "2222"));
        
        MenuPrincipal mainmenu = new MenuPrincipal();
        mainmenu.setLocation(200, 100);
        mainmenu.setVisible(true);
        
        //Administrador2 admin2 = new Administrador2();
        //admin2.setVisible(true);
        
        //Controlador ctrl = new Controlador();
        //ctrl.setVisible(true);
        
        
        do {
            opc = menuEmpleado();
            switch (opc) {
                case 1:
                    System.out.println("\t\tEMPRESA ABC");
                    System.out.println("\t***ADMINISTRADOR***");
                    System.out.println("\tINGRESO DE CREDENCIALES");
                    String nom = leerString("Usuario: ");
                    String contra = leerString("Contraseña: ");
                    if (Admin.identificador(nom, contra) == true) {
                        do {
                            opcead = menuAdmin();
                            switch (opcead) {
                                case 1:
                                    do {
                                        adu = menuAdmin1();
                                        switch (adu) {
                                            case 1:
                                                do {
                                                    usua = menuTipo();
                                                    switch (usua) {
                                                        case 1:
                                                            System.out.println("\t\tEMPRESA ABC");
                                                            System.out.println("\t***DATOS ADMINISTRADOR***");
                                                            String nombre = leerString("Ingrese el nombre del Empleado: ");
                                                            String contraseña = leerString("Ingrese la Contraseña: ");
                                                            Admin.insertarFin(new Empleado(nombre, contraseña));
                                                            break;
                                                        case 2:
                                                            System.out.println("\t\tEMPRESA ABC");
                                                            System.out.println("\t***DATOS TÉCNICO***");
                                                            nombre = leerString("Ingrese el nombre del Empleado: ");
                                                            contraseña = leerString("Ingrese la Contraseña: ");
                                                            Tecni.insertarFin(new Empleado(nombre, contraseña));
                                                            break;
                                                        case 3:
                                                            System.out.println("\t\tEMPRESA ABC");
                                                            System.out.println("\t***DATOS MANTENIMIENTO***");
                                                            nombre = leerString("Ingrese el nombre del Empleado: ");
                                                            contraseña = leerString("Ingrese la Contraseña: ");
                                                            Mante.insertarFin(new Empleado(nombre, contraseña));
                                                            break;
                                                    }
                                                } while (usua != 4);
                                                break;
                                            case 2:
                                                do {
                                                    usua = menuTipo();
                                                    switch (usua) {
                                                        case 1:
                                                            Admin.imprimirEmpleado();
                                                            break;
                                                        case 2:
                                                            Tecni.imprimirEmpleado();
                                                            break;
                                                        case 3:
                                                            Mante.imprimirEmpleado();
                                                            break;
                                                    }
                                                } while (usua != 4);
                                                break;
                                            case 3:
                                                do {
                                                    usua = menuTipo();
                                                    switch (usua) {
                                                        case 1:
                                                            System.out.println("\t\tEMPRESA ABC");
                                                            System.out.println("\t***ELIMINACIÓN ADMINISTRADOR***");
                                                            nom = leerString("Ingrese el nombre del administrador: ");
                                                            if (Admin.buscarUsuario(nom) == true) {
                                                                Admin.eliminarUsuario(nom);
                                                                System.out.println("El administrador ha sido eliminado con exito");
                                                            } else {
                                                                System.out.println("NO EXISTE EL EMPLEADO ");
                                                            }
                                                            break;
                                                        case 2:
                                                            System.out.println("\t\tEMPRESA ABC");
                                                            System.out.println("\t***ELIMINACIÓN TÉCNICO***");
                                                            nom = leerString("Ingrese el nombre del técnico");
                                                            if (Tecni.buscarUsuario(nom) == true) {
                                                                Tecni.eliminarUsuario(nom);
                                                                System.out.println("El técnico ha sido eliminado con exito");
                                                            } else {
                                                                System.out.println("NO EXISTE EL EMPLEADO ");
                                                            }
                                                            break;
                                                        case 3:
                                                            System.out.println("\t\tEMPRESA ABC");
                                                            System.out.println("\t***ELIMINACIÓN MANTENIMIENTO***");
                                                            nom = leerString("Ingrese el nombre de la persona de mantenimiento: ");
                                                            if (Mante.buscarUsuario(nom) == true) {
                                                                Mante.eliminarUsuario(nom);
                                                                System.out.println("El encargado de mantenimiento ha sido eliminado con exito");
                                                            } else {
                                                                System.out.println("NO EXISTE EL EMPLEADO ");
                                                            }
                                                            break;
                                                    }
                                                } while (usua != 4);
                                                break;
                                            case 4:
                                                do {
                                                    usua = menuTipo();
                                                    switch (usua) {
                                                        case 1:
                                                            System.out.println("\t\tEMPRESA ABC");
                                                            System.out.println("\t***MODIFICACIÓN DATOS ADMINISTRADOR***");
                                                            nom = leerString("Ingrese el nombre del Empleado a modificar: ");
                                                            if (Admin.buscarUsuario(nom) == true) {
                                                                String nombre = leerString("Ingrese el nuevo nombre del Empleado: ");
                                                                String contraseña = leerString("Ingrese la nueva Contraseña: ");
                                                                Admin.eliminarUsuario(nom);
                                                                Admin.insertarFin(new Empleado(nombre, contraseña));

                                                            } else {
                                                                System.out.println("NO EXISTE EL EMPLEADO ");
                                                            }
                                                            break;
                                                        case 2:
                                                            System.out.println("\t\tEMPRESA ABC");
                                                            System.out.println("\t***MODIFICACIÓN DATOS TÉCNICO***");
                                                            nom = leerString("Ingrese el nombre del empleado a modificar: ");
                                                            if (Tecni.buscarUsuario(nom) == true) {
                                                                String nombre = leerString("Ingrese el nuevo nombre del Empleado: ");
                                                                String contraseña = leerString("Ingrese la nueva Contraseña: ");
                                                                Tecni.eliminarUsuario(nom);
                                                                Tecni.insertarFin(new Empleado(nombre, contraseña));

                                                            } else {
                                                                System.out.println("NO EXISTE EL EMPLEADO ");
                                                            }
                                                            break;
                                                        case 3:
                                                            System.out.println("\t\tEMPRESA ABC");
                                                            System.out.println("\t***MODIFICACIÓN DATOS MANTENIMIENTO**");
                                                            nom = leerString("Ingrese el nombre del usuario a modificar: ");
                                                            if (Mante.buscarUsuario(nom) == true) {
                                                                String nombre = leerString("Ingrese el nuevo nombre del Empleado: ");
                                                                String contraseña = leerString("Ingrese la nueva Contraseña: ");
                                                                Mante.eliminarUsuario(nom);
                                                                Mante.insertarFin(new Empleado(nombre, contraseña));

                                                            } else {
                                                                System.out.println("NO EXISTE EL EMPLEADO ");
                                                            }
                                                            break;
                                                    }
                                                } while (usua != 4);

                                                break;
                                        }
                                    } while (adu != 5);
                                    break;
                                case 2:
                                    do {
                                        equi = menuAdmin2();
                                        switch (equi) {
                                            case 1:
                                                System.out.println("\t\tEMPRESA ABC");
                                                System.out.println("\t***INGRESO DE DISPOSITIVOS***");
                                                String nombre = leerString("Nombre:");
                                                String tipo = leerString("Tipo:");                                             
                                                String ip = leerString("Dirección IP:");
                                                String mascara = leerString("Mascara de Red:");
                                                String servidor = leerString("Servidor:");
                                                Dispo.insertarFinE(new Dispositivos(nombre,tipo, ip, mascara, servidor));
                                                break;
                                            case 2:
                                                System.out.println("\t\tEMPRESA ABC");                                               
                                                System.out.println("\t***BUSCAR***");
                                                String modifi = leerString("Ingrese la ip del dispositivo");
                                                if (Dispo.buscarip(modifi) == true) {
                                                    Dispo.buscar(modifi);
                                                } else {
                                                    System.out.println("NO EXISTE EL EMPLEADO ");
                                                }
                                                break;
                                            case 3:
                                                System.out.println("\t\tEMPRESA ABC");
                                                System.out.println("\t***ELIMINAR***");
                                                modifi = leerString("Ingrese la ip del dispositivo");
                                                if (Dispo.buscarip(modifi) == true) {
                                                    Dispo.eliminarPorIP(modifi);
                                                    System.out.println("\tDISPOSITIVO ELIMINADO");
                                                } else {
                                                    System.out.println("NO EXISTE EL DISPOSITIVO ");
                                                }
                                                break;
                                            case 4:
                                                System.out.println("\t\tEMPRESA ABC");
                                                System.out.println("\t***MODIFICAR***");
                                                modifi = leerString("Ingrese el ip del dispositivo");
                                                if (Dispo.buscarip(modifi) == true) {
                                                    //eliminar el equipo de la ip que busco
                                                    System.out.println("INGRESO DEL NUEVO DISPOSITIVO");
                                                    nombre = leerString("Nombre:");
                                                    tipo = leerString("Tipo:");
                                                    ip = leerString("Dirección IP:");
                                                    mascara = leerString("Mascara de Red:");
                                                    servidor = leerString("Servidor:");;
                                                    Dispo.eliminarPorIP(modifi);
                                         
                                                    Dispo.insertarFinE(new Dispositivos(nombre, tipo, ip, mascara, servidor));
                                                } else {
                                                    System.out.println("NO EXISTE EL DISPOSITIVO ");
                                                }
                                                break;
                                            case 5:
                                                System.out.println("\t\tEMPRESA ABC");
                                                System.out.println("\t***LISTA DE DISPOSITIVOS***");
                                                Dispo.imprimirDis();
                                                break;
                                        }
                                    } while (equi != 6);
                                    break;
                            }
                        } while (opcead != 3);
                    } else {
                        System.out.println("NO EXISTE EL EMPLEADO ");
                    }
                    break;

                case 2:
                    System.out.println("\t\tEMPRESA ABC");
                    System.out.println("\t***TÉCNICO***");
                    System.out.println("INGRESO DE CREDENCIALES");
                    nom = leerString("Usuario: ");
                    contra = leerString("Contraseña: ");
                    if (Tecni.identificador(nom, contra) == true) {
                        do {
                            opce = menuTecnico();
                            switch (opce) {
                                case 1:
                                    System.out.println("\t\tEMPRESA ABC");
                                    System.out.println("\t***INGRESO DEL DISPOSITIVO***");
                                    String nombre = leerString("Nombre:");
                                    String tipo = leerString("Tipo:");
                                    String ip = leerString("Dirección IP:");
                                    String mascara = leerString("Mascara de Red:");
                                    String servidor = leerString("Servidor:");
                                    if (Dispo.Comprobar(ip) == false) {
                                        Dispo.insertarFinE(new Dispositivos(nombre,tipo, ip, mascara, servidor));
                                    }
                                    break;
                                case 2:
                                    System.out.println("\t\tEMPRESA ABC");
                                    System.out.println("\t***LISTA DE DISPOSITIVOS***");
                                    Dispo.imprimirDis();
                                    break;
                                case 3:
                                    System.out.println("\t\tEMPRESA ABC");
                                    System.out.println("\t***BUSCAR***");
                                    String modifi = leerString("Ingrese la ip del dispositivo");
                                    if (Dispo.buscarip(modifi) == true) {
                                        Dispo.buscar(modifi);
                                        System.out.println("DISPOSITIVO ENCONTRADO");
                                    } else {
                                        System.out.println("NO EXISTE EL DISPOSITIVO ");
                                    }
                                    break;
                            }
                        } while (opce != 4);
                    } else {
                        System.out.println("NO EXISTE EL EMPLEADO ");
                    }
                    break;

                case 3:
                    System.out.println("\t\tEMPRESA ABC");
                    System.out.println("\t***MANTENIMIENTO***");
                    System.out.println("\tINGRESO DE CREDENCIALES");
                    nom = leerString("Usuario: ");
                    contra = leerString("Contraseña: ");
                    if (Mante.identificador(nom, contra) == true) {
                        do {
                            man = menuMantenimiento();
                            switch (man) {
                                case 1:
                                    System.out.println("\t\tEMPRESA ABC");
                                    System.out.println("\t***LISTA DE DISPOSITIVOS***");
                                    Dispo.imprimirDis();
                                    break;
                                case 2:
                                    System.out.println("\t\tEMPRESA ABC");
                                    System.out.println("\t***MODIFICAR***");
                                    String modifi = leerString("Ingrese la ip del dispositivo");
                                    if (Dispo.buscarip(modifi) == true) {
                                        //eliminar el equipo de la ip que busco
                                        System.out.println("INGRESO DEL DISPOSITIVO");
                                        String nombre = leerString("Nombre: ");
                                        String tipo = leerString("Tipo:");
                                        String ip = leerString("Dirección IP:");
                                        String mascara = leerString("Mascara de Red:");
                                        String servidor = leerString("Servidor:");
                                        Dispo.eliminarPorIP(modifi);
                                        Dispo.insertarFinE(new Dispositivos(nombre,tipo, ip, mascara, servidor));
                                    }
                                    break;
                                case 3:
                                    System.out.println("\t\tEMPRESA ABC");
                                    System.out.println("\t***VERIFICAR DUPLICADOS***");
                                    if (Dispo.Duplicado() == true) {
                                        System.out.println("NO HAY DUPLICADOS");
                                    } else {
                                        System.out.println("EXISTEN DUPLICADOS");
                                    }
                                    break;
                                case 4:
                                    System.out.println("\t\tEMPRESA ABC");
                                    System.out.println("\t***ELIMINAR***");
                                    modifi = leerString("Ingrese la ip del dispositivo");
                                    if (Dispo.buscarip(modifi) == true) {
                                        Dispo.eliminarPorIP(modifi);
                                        System.out.println("DISPOSITIVO ELIMINADO");
                                    } else {
                                        System.out.println("NO EXISTE EL DISPOSITIVO ");
                                    }
                                    break;
                                case 5:
                                    System.out.println("\t\tEMPRESA ABC");
                                    System.out.println("\t***BUSCAR***");
                                    modifi = leerString("Ingrese la ip del dispositivo");
                                    if (Dispo.buscarip(modifi) == true) {
                                        Dispo.buscar(modifi);
                                        System.out.println("DISPOSITO ENCONTRADO");
                                    } else {
                                        System.out.println("NO EXISTE EL DISPOSITIVO ");
                                    }
                                    break;
                            }
                        } while (man != 6);
                    } else {
                        System.out.println("NO EXISTE EL EMPLEADO ");
                    }
                    break;
                case 4:
                    do {
                        man = menuRegistro();
                        switch (man) {
                            case 1:
                                do {
                                    usua = menuTipo();
                                    switch (usua) {
                                        case 1:
                                            System.out.println("\t\tEMPRESA ABC");
                                            System.out.println("\t***DATOS ADMINISTRADOR***");
                                            nom = leerString("Ingrese el nombre del Empleado: ");
                                            contra = leerString("Ingrese la Contraseña: ");
                                            if (Admin.identificador(nom, contra) == true) {
                                                Calendar calendario4 = new GregorianCalendar();
                                                hora = calendario4.get(Calendar.HOUR_OF_DAY);
                                                minutos = calendario4.get(Calendar.MINUTE);
                                                segundos = calendario4.get(Calendar.SECOND);
                                                tiempo.insertarFinT(new Hora(nom, hora, minutos, segundos));
                                                tiempo.faltas();
                                                tiempo.entrada();
                                                System.out.println("\t***INGRESO CORRECTO***");
                                            } else {
                                                System.out.println("NO EXISTE EL EMPLEADO ");
                                            }
                                            break;
                                        case 2:
                                            System.out.println("\t\tEMPRESA ABC");
                                            System.out.println("\t***DATOS TÉCNICO***");
                                            nom = leerString("Ingrese el nombre del Empleado: ");
                                            contra = leerString("Ingrese la Contraseña: ");
                                            Tecni.insertarFin(new Empleado(nom, contra));
                                            if (Tecni.identificador(nom, contra) == true) {
                                                Calendar calendario5 = new GregorianCalendar();
                                                hora = calendario5.get(Calendar.HOUR_OF_DAY);
                                                minutos = calendario5.get(Calendar.MINUTE);
                                                segundos = calendario5.get(Calendar.SECOND);
                                                tiempo.insertarFinT(new Hora(nom, hora, minutos, segundos));
                                                tiempo.faltas();
                                                tiempo.entrada();
                                                System.out.println("\t***INGRESO CORRECTO***");;
                                            } else {
                                                System.out.println("NO EXISTE EL EMPLEADO ");
                                            }

                                            break;
                                        case 3:
                                            System.out.println("\t\tEMPRESA ABC");
                                            System.out.println("\t***DATOS MANTENIMIENTO***");
                                            nom = leerString("Ingrese el nombre del Empleado: ");
                                            contra = leerString("Ingrese la Contraseña: ");
                                            if (Mante.identificador(nom, contra) == true) {
                                                Calendar calendario6 = new GregorianCalendar();
                                                hora = calendario6.get(Calendar.HOUR_OF_DAY);
                                                minutos = calendario6.get(Calendar.MINUTE);
                                                segundos = calendario6.get(Calendar.SECOND);
                                                tiempo.insertarFinT(new Hora(nom, hora, minutos, segundos));
                                                tiempo.faltas();
                                                tiempo.entrada();
                                                System.out.println("\t***INGRESO CORRECTO***");
                                            } else {
                                                System.out.println("NO EXISTE EL EMPLEADO ");
                                            }
                                            break;
                                    }
                                } while (usua != 4);

                                break;
                            case 2:
                                do {
                                    usua = menuTipo();
                                    switch (usua) {
                                        case 1:
                                            System.out.println("\t\tEMPRESA ABC");
                                            System.out.println("\t***DATOS ADMINISTRADOR***");
                                            nom = leerString("Ingrese el nombre del Empleado: ");
                                            contra = leerString("Ingrese la Contraseña: ");
                                            if (Admin.identificador(nom, contra) == true) {
                                                Calendar calendario7 = new GregorianCalendar();
                                                hora = calendario7.get(Calendar.HOUR_OF_DAY);
                                                minutos = calendario7.get(Calendar.MINUTE);
                                                segundos = calendario7.get(Calendar.SECOND);
                                                tiempo.insertarFinT(new Hora(nom, hora, minutos, segundos));
                                                tiempo.faltas();
                                                tiempo.almuerzo();
                                                System.out.println("\t***INGRESO CORRECTO***");
                                            } else {
                                                System.out.println("NO EXISTE EL EMPLEADO ");
                                            }
                                            break;
                                        case 2:
                                            System.out.println("\t\tEMPRESA ABC");
                                            System.out.println("\t***DATOS TÉCNICO***");
                                            nom = leerString("Ingrese el nombre del Empleado: ");
                                            contra = leerString("Ingrese la Contraseña: ");
                                            Tecni.insertarFin(new Empleado(nom, contra));
                                            if (Tecni.identificador(nom, contra) == true) {
                                                Calendar calendario8 = new GregorianCalendar();
                                                hora = calendario8.get(Calendar.HOUR_OF_DAY);
                                                minutos = calendario8.get(Calendar.MINUTE);
                                                segundos = calendario8.get(Calendar.SECOND);
                                                tiempo.insertarFinT(new Hora(nom, hora, minutos, segundos));
                                                tiempo.faltas();
                                                tiempo.almuerzo();
                                                System.out.println("\t***INGRESO CORRECTO***");
                                            } else {
                                                System.out.println("NO EXISTE EL EMPLEADO ");
                                            }

                                            break;
                                        case 3:
                                            System.out.println("\t\tEMPRESA ABC");
                                            System.out.println("\t***DATOS MANTENIMIENTO***");
                                            nom = leerString("Ingrese el nombre del Empleado: ");
                                            contra = leerString("Ingrese la Contraseña: ");
                                            if (Mante.identificador(nom, contra) == true) {
                                                Calendar calendario9 = new GregorianCalendar();
                                                hora = calendario9.get(Calendar.HOUR_OF_DAY);
                                                minutos = calendario9.get(Calendar.MINUTE);
                                                segundos = calendario9.get(Calendar.SECOND);
                                                tiempo.insertarFinT(new Hora(nom, hora, minutos, segundos));
                                                tiempo.faltas();
                                                tiempo.almuerzo();
                                                System.out.println("\t***INGRESO CORRECTO***");
                                            } else {
                                                System.out.println("NO EXISTE EL EMPLEADO ");
                                            }
                                            break;                                      
                                    }
                                } while (usua != 4);
                                break;
                            case 3:
                                do {
                                    usua = menuTipo();
                                    switch (usua) {
                                        case 1:
                                            System.out.println("\t\tEMPRESA ABC");
                                            System.out.println("\t***DATOS ADMINISTRADOR***");
                                            nom = leerString("Ingrese el nombre del Empleado: ");
                                            contra = leerString("Ingrese la Contraseña: ");
                                            if (Admin.identificador(nom, contra) == true) {
                                                Calendar calendario0 = new GregorianCalendar();
                                                hora = calendario0.get(Calendar.HOUR_OF_DAY);
                                                minutos = calendario0.get(Calendar.MINUTE);
                                                segundos = calendario0.get(Calendar.SECOND);
                                                tiempo.insertarFinT(new Hora(nom, hora, minutos, segundos));
                                                tiempo.faltas();
                                                tiempo.salida();
                                                System.out.println("\t***INGRESO CORRECTO***");
                                            } else {
                                                System.out.println("NO EXISTE EL EMPLEADO ");

                                            }
                                            break;
                                        case 2:
                                            System.out.println("\t\tEMPRESA ABC");
                                            System.out.println("\t***DATOS TÉCNICO***");
                                            nom = leerString("Ingrese el nombre del Empleado: ");
                                            contra = leerString("Ingrese la Contraseña: ");
                                            Tecni.insertarFin(new Empleado(nom, contra));
                                            if (Tecni.identificador(nom, contra) == true) {
                                                Calendar calendario01 = new GregorianCalendar();
                                                hora = calendario01.get(Calendar.HOUR_OF_DAY);
                                                minutos = calendario01.get(Calendar.MINUTE);
                                                segundos = calendario01.get(Calendar.SECOND);
                                                tiempo.insertarFinT(new Hora(nom, hora, minutos, segundos));
                                                tiempo.faltas();
                                                tiempo.salida();
                                                System.out.println("\t***INGRESO CORRECTO***");;
                                            } else {
                                                System.out.println("NO EXISTE EL EMPLEADO ");
                                            }

                                            break;
                                        case 3:
                                            System.out.println("\t\tEMPRESA ABC");
                                            System.out.println("\t***DATOS MANTENIMIENTO***");
                                            nom = leerString("Ingrese el nombre del Empleado: ");
                                            contra = leerString("Ingrese la Contraseña: ");
                                            if (Mante.identificador(nom, contra) == true) {
                                                Calendar calendario02 = new GregorianCalendar();
                                                hora = calendario02.get(Calendar.HOUR_OF_DAY);
                                                minutos = calendario02.get(Calendar.MINUTE);
                                                segundos = calendario02.get(Calendar.SECOND);
                                                tiempo.insertarFinT(new Hora(nom, hora, minutos, segundos));
                                                tiempo.faltas();                                            
                                                tiempo.salida();
                                                System.out.println("\t***INGRESO CORRECTO***");
                                            } else {
                                                System.out.println("NO EXISTE EL EMPLEADO ");
                                            }
                                        break;                                        
                                    }
                                } while (usua != 4);
                                break;
                            case 4:
                                System.out.println("\t\tEMPRESA ABC");
                                System.out.println("\t***HISTORIAL REGISTROS***");
                                tiempo.imprimirTiempo();
                                tiempo.imprimirAtra();
                                //tiempo.TiempoS(hora, minutos, segundos, hora2, minuto2, segundo2);
                                break;
                        }
                    } while (man != 5);
                    break;
                    
                case 5:
                    Listas L = new Listas();
                    Arbol arboles[] = L.arboles(Admin, Tecni, Mante);
                    for (int i = 0; i < arboles.length; i++) {
                        if (arboles[i] != null) {
                            System.out.println("Arbol " + i);
                            arboles[i].niveles();
                        }
                    }
                    break;
            }
        } while (opc != 6);
        
    // Interfaces
    
    }

}
