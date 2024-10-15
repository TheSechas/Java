package com.liceolapaz.des.sgg;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        // Ecribir menú de opciones
        escribirMenu();
        // Pedir opción
        pedirOpcion();
        // Leer opción y almacenarla
        int opcion = leerOpcion();
        // Escribir mensaje
        escribirMensaje(opcion);
    }

    private static void escribirMensaje(int opcion) {
        String mensaje = "";
        switch (opcion) {
            case 0:
                System.exit(0);
            case 1:
                mensaje = "Ha escogido la opción 1";
                break;
            case 2:
                mensaje = "Ha escogido la opción 2";
                break;
            case 3:
                mensaje = "Ha escogido la opción 3";
                break;
            default:
                mensaje = "Opción no válida";
                break;
        }
        System.out.println(mensaje);
    }

    private static int leerOpcion() {
        Scanner teclado = new Scanner(System.in);
        return teclado.nextInt();
    }

    private static void pedirOpcion() {
        System.out.print("Escoja una opción: ");
    }

    private static void escribirMenu() {
        System.out.println("MENÚ PRINCIPAL\n" +
                "1. Opción 1\n" +
                "2. Opción 2\n" +
                "3. Opción 3\n" +
                "0. Salir");
    }
}
