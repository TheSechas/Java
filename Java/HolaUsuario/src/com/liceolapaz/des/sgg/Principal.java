    package com.liceolapaz.des.sgg;

    import java.util.Scanner;

    public class Principal {
    public static void main(String[] args) {
        // Pedir al usuario que escriba su nombre
        pedirNombre();
        // Leer lo que escribió el usuario y guardarlo
        String nombre = leerNombre();
        //System.out.println(nombre);
        // Escribir el saludo
        escribirSaludo(nombre);
    }
    private static void escribirSaludo(String nombre) {
         System.out.println("Hola, " + nombre + "!");
    }
    private static String leerNombre() {
        Scanner teclado = new Scanner(System.in);
        return teclado.nextLine();
    }

    private static void pedirNombre() {
        System.out.print("Escriba su nombre:");
    }
    }
