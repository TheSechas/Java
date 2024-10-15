package com.liceolapaz.des.sgg;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        // Pedir número al usuario
        pedirNumero();
        // Leer el número y guardarlo
        int numero = leerNumero();
        // Escribir el mensaje
        escribirMensaje(numero);
    }

    private static void escribirMensaje(int numero) {
        // Crear una variable para guardar el mensaje
        String mensaje = "";
        // Comprobar si número es par o impar
        boolean esPar = numero % 2 == 0;
        mensaje = esPar ?
                "El número es par" : "El número es impar";
        mensaje = numero == 0 ?
                "El 0 no es número par ni número impar"
                : mensaje;
        // Escribir el mensaje
        System.out.println(mensaje);
    }

    private static int leerNumero() {
        Scanner teclado = new Scanner(System.in);
        return teclado.nextInt();
    }

    private static void pedirNumero() {
        System.out.print("Escriba un número entero: ");
    }
}
