package com.liceolapaz.des.sgg;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
       do {
           // Escribir menu

        escribirMenu();
        // Hacer que escoja una opción
        pedirOpcion();
        // cojer opcion y almacenarla
        int opcion = leerOpcion();
        // salir opcion
           case 0:
            System.exit(0);
            break;
    }
    while(true);
    }
    private static int leerOpcion() {
        Scanner teclado = new Scanner(System.in);
        return teclado.nextInt();
    }

    private static void pedirOpcion() {
        System.out.print("Pedir opcion: ");
    }
    private static void escribirMenu() {
        System.out.println("1. Menu\n" +
                "2. Menu" +
                "3. Menu" +
                "0. Salir");
    }
}
