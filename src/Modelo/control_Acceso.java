/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author AndreaS
 */
public class control_Acceso {

    public static ArrayList<Usuario> Registrar(ArrayList<Usuario> usuario, String Nombre, String ID, String Cargo) {
        if (Cargo.equalsIgnoreCase("administrador")) {
            Usuario A = new Administrador(Nombre, ID, Cargo);
            usuario.add(A);
            return usuario;
        } else {
            Usuario B = new Usuario(Nombre, ID, Cargo);
            usuario.add(B);
            return usuario;
        }
    }

    public static char menu(ArrayList<Usuario> usuario, String Verificacion) {
        char idVerificada = 'N';
        char cargoAdmin = 'N';
        if (usuario.isEmpty()) {
            //si no hay usuarios registrados agrega el primer administrador
            //que permitira agregar mas usuarios
            Registrar(usuario, "admin1", "9806", "administrador");
        }
        for (Usuario u : usuario) {
            if (u.getID().equalsIgnoreCase(Verificacion)) {
                idVerificada = 'S';
                if (u.getCargo().equalsIgnoreCase("Administrador")) {
                    cargoAdmin = 'S';
                }
            }
        }

        if ((idVerificada == 'S') && (cargoAdmin == 'S')) {

            char seguir = 'S';
            Scanner lea = new Scanner(System.in);
            do {
                System.out.println("");
                System.out.println("   MENU CONTROL DE ACCESO     ");
                System.out.println("1.Registrar Usuario");
                System.out.println("2.Borrar Usuario ");
                System.out.println("3.Salir del control de acceso");
                System.out.println("");
                System.out.println("Seleccione una opcion ");
                int op = lea.nextInt();

                switch (op) {
                    case 1 -> {
                        //INGRESA LOS DATOS
                        System.out.println("Ingrese el nombre del usuario ");
                        String Nombre = lea.nextLine();
                        System.out.println("");

                        System.out.println("Ingrese la ID del usuario");
                        String ID = lea.nextLine();
                        System.out.println("");

                        System.out.println("Ingrese el cargo del usuario ");
                        System.out.println("1.Usuario");
                        System.out.println("2.Administrador");
                        int opc = lea.nextInt();
                        String Cargo;
                        if (opc == 1) {
                            Cargo = "Usuario";
                        } else {
                            Cargo = "Administrador";
                        }
                        Registrar(usuario, Nombre, ID, Cargo);
                        break;
                    }
                    case 2 -> {
                        System.out.println("Ingrese el ID del usuario que desea borrar: ");
                        String ID = lea.nextLine();
                        Borrar(usuario, ID);
                        break;
                    }

                    case 3 -> {
                        seguir = 'N';
                        break;
                    }
                    default -> {
                        System.out.println("OPCION INCORRECTA SELECCIONE NUEVAMENTE");
                    }
                }

            } while (seguir == 'S');
            return 'S';
        } else {
            System.out.println("ID de usuario no registrada");
            return 'N';
        }
    }

    public static ArrayList<Usuario> Borrar(ArrayList<Usuario> usuario, String ID) {
        for (int i = 0; i < usuario.size(); i++) {
            Usuario u = usuario.get(i);
            if (u.getID().equals(ID)) { // Buscamos la ID del usuario
                usuario.remove(i); // lo eliminamos del ArrayList
                System.out.println("Usuario con ID " + ID + " eliminado exitosamente.");
                break;
            }
        }
        return usuario;
    }

}
