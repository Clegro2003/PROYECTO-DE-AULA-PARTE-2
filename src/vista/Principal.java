/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vista;

import Modelo.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author AndreaS
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        char seguir = 'S';
        char verificado = 'N';
        ArrayList<Empresa> empresa = new ArrayList();
        ArrayList<Usuario> usuario = new ArrayList();
        do {
            //verifico que el usuario exista
            System.out.println("PARA ACCEDER A LAS OPCIONES EL USUARIO DEBE ESTAR VERIFICADO ");
            System.out.println("Ingrese su ID (como primer administrado la ID: 9806)");
            String ID = lea.nextLine();
            verificado = control_Acceso.menu(usuario, ID);

            //control de acceso devolvera un char s/n dependiendo
            //de si existe el usuario
            if (verificado == 'N') {
                System.out.println("DESEA VERIFICAR OTRA ID S/N");
                seguir = lea.next().charAt(0);
            } else {
                seguir = 'N';
            }
        } while (seguir == 'S');

        //solo se permitira el acceso si se verifica el usuario
        if (verificado == 'S') {

            seguir = 'S';
            do {
                System.out.println("");
                System.out.println("   MENU PRINCIPAL  ");
                System.out.println("1.Registrar empresa");
                System.out.println("2.Informe ");
                System.out.println("3.Informe selectivo");
                System.out.println("4.Salir");
                System.out.println("");
                System.out.println("Seleccione una opcion ");
                int op = lea.nextInt();

                switch (op) {
                    case 1 -> {
                        Registrar(empresa);
                        break;
                    }
                    case 2 -> {
                        Informe(empresa);
                        break;
                    }
                    case 3 -> {
                        Consultar(empresa);
                        break;
                    }
                    default -> {
                        seguir = 'N';
                    }
                }
            } while (seguir == 'S');

        } else {
            System.out.println("El usuario no esta verificado");
        }
    }
    
    public static ArrayList<Empresa> Registrar(ArrayList<Empresa> empresa) {

        Scanner lea = new Scanner(System.in);
        
        System.out.println("");
        
        //REGISTRO DE LOS DATOS PRINCIPALES DE LA EMPRESA
        System.out.println("Ingrese el nombre de la empresa");
        String nombre = lea.nextLine();
        System.out.println("");
        System.out.println("Ingrese el ID de la empresa");
        String id = lea.nextLine();
        
        
        // BLOQUE PARA EL REGISTRO DE GASTOS DE LA EMPRESA 
        System.out.println("Ingrese el numero de trabajadores de la empresa ");
        int numTrabajadores = lea.nextInt();
        System.out.println("");
        System.out.println("Ingrese la cantidad de productos A comprados ");
        int cantProductosA= lea.nextInt();
        System.out.println("");
        System.out.println("Ingrese la cantidad de productos B comprados ");
        int cantProductosB= lea.nextInt();
        System.out.println("");
        System.out.println("Ingrese la cantidad de productos C comprados ");
        int cantProductosC= lea.nextInt();
        System.out.println("");
        
        
        // BLOQUE PARA EL REGISTRO DE INGRESOS DE LA EMPRESA
        System.out.println("Ingrese el numero de ventas del producto A");
        int numVentasProductoA = lea.nextInt();
        System.out.println("");
        System.out.println("Ingrese el numero de ventas del producto B");
        int numVentasProductoB = lea.nextInt();
        System.out.println("");
        System.out.println("Ingrese el numero de ventas del producto C");
        int numVentasProductoC = lea.nextInt();
        
        
        //REGISTRO LOS DATOS DE LA EMPRESA
        Ingresos ingresos = new Ingresos(numVentasProductoA, numVentasProductoB, numVentasProductoC);
        Gastos gastos= new Gastos(numTrabajadores, numVentasProductoA, numVentasProductoB, numVentasProductoC);
        Empresa nuevaEmpresa = new Empresa(nombre, id, gastos, ingresos);
        empresa.add(nuevaEmpresa);
        System.out.println("");
        System.out.println("");
        System.out.println("La empresa se ha registrado correctamente");
        
        return empresa;
    }

    public static void Informe(ArrayList<Empresa> empresa) {

        if (empresa.isEmpty()) {
            System.out.println("No hay empresas registradas");
            System.out.println("");
        } else {
            for (Empresa e : empresa) {
                System.out.println(e.toString());
                System.out.println("");
            }
            Scanner lea = new Scanner(System.in);
            System.out.println("Presione Enter para continuar...");
            lea.nextLine();
        }
    }

    public static void Consultar(ArrayList<Empresa> empresa) {
        Scanner lea = new Scanner(System.in);
        System.out.println("");
        System.out.println("Ingrese el ID de la empresa que desea consultar");
        String idEmpresa = lea.nextLine();
        System.out.println("");

        // Buscar la empresa con el ID ingresado
        for (Empresa e : empresa) {
            if (e.getId().equals(idEmpresa)) {
                System.out.println(e.toString());
                System.out.println("Presione Enter para continuar...");
                lea.nextLine();
                return;
            }
        }

        System.out.println("No se encontró ninguna empresa con ese ID");
    }

    
    
}
