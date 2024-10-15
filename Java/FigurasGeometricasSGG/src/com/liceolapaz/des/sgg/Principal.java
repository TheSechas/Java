package com.liceolapaz.des.sgg;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        // Escribir menu
        escribirMenu();
        // pedir opcion
        pedirOpcion();
        // leer opcion
        int opcion = leerOpcion();
         switch (opcion){
             // si la opcion es 0
                case 0:
                 System.exit(0);
                 break;
         // si escoje la opcion 1
            case 1:
               // pedir base triangulo
                pedirBaseTriangulo();
                // leer la base y almacenarla
                double baseTriagulo = leerDouble();
                // pedir el segundo lado
                pedirSegundoLado();
                // leer la base y almcaenarla
                double segundoLado = leerDouble();
                // pedir tercer lado
                pedirTercerLado();
                //almacenar tercer lado
                double tercerLado = leerDouble();
                // pedir altura
                pedirAltura();
                // almacenar alura
                double alturaTriangulo = leerDouble();
                // calcular area
                double areaTriangulo = (baseTriagulo * alturaTriangulo) / 2;
                // calcular perimetro
                double perimetroTriangulo = (baseTriagulo + segundoLado + tercerLado);
                // escribir resultado
                escribirResultado(areaTriangulo, perimetroTriangulo);
            break;
        // si escoje la opcion 2
             case 2:
                 // pedir la base
                 pedirBaseRectangulo();
                 // leer base y almacenarla
                 double baseRectangulo = leerDouble();
                 // pedir la altura
                 pedirAlturaRectangulo();
                 // leer y almcaenarlo
                 double alturaRectangulo = leerDouble();
                 // calcular area
                 double areaRectangulo = (baseRectangulo * alturaRectangulo);
                 //calcular perimetro
                 double perimetroRectangulo = (baseRectangulo + baseRectangulo + alturaRectangulo + alturaRectangulo);
                 // escribir resultado
                 escribirResultado(areaRectangulo, perimetroRectangulo);
             break;
        // si escoje la opcion 3
             case 3:
                 // Pedir el lado
                 pedirLadoCuadrado();
                 // Leer el lado y almacenarlo
                 double ladoCuadrado = leerDouble();
                 // Calcular el área
                 double areaCuadrado = ladoCuadrado * ladoCuadrado;
                 // Calcular el perímetro
                 double perimetroCuadrado = 4 * ladoCuadrado;
                 // Escribir el resultado
                 escribirResultado(areaCuadrado, perimetroCuadrado);
                 break;
        // si escoje la opcion 4
             case 4:
                 // Pedir lado
                 pedirLadoPentagono();
                 // Leer lado y almacenarlo
                 double ladoPentagono = leerDouble();
                 // Pedir apotema
                 pedirApotema();
                 // Leer apotema y almacenarla
                 double apotema = leerDouble();
                 // Calcular perímetro
                 double perimetroPentagono = 5 *ladoPentagono;
                 // Calcular área
                 double areaPentagono = (perimetroPentagono * apotema) / 2;
                 // Escribir resultado
                 escribirResultado(areaPentagono, perimetroPentagono);
                 break;
        // si la opcion no es valida
             default:
                 System.out.print("La opcion no es válida");
                 break;
        }
        while (true);
    }

    private static void pedirApotema() {
        System.out.print("Escriba el apotema del pentágono: ");
    }

    private static void pedirLadoPentagono() {
        System.out.print("Escriba el lado del pentágono: ");
    }

    private static void pedirLadoCuadrado() {
        System.out.print("Escriba el lado del cuadrado: ");
    }

    private static void pedirAlturaRectangulo() {
        System.out.print("Escriba la altura del rectángulo: ");
    }

    private static void pedirBaseRectangulo() {
        System.out.print("Escriba el valor del primer lado (base) del triángulo: ");
    }

    private static void escribirResultado(double areaTriangulo, double perimetroTriangulo) {
        System.out.println("El área es " + areaTriangulo + " y el perímetro es " + perimetroTriangulo);
    }

    private static void pedirAltura() {
        System.out.print("Escriba la altura del triángulo: ");
    }

    private static void pedirTercerLado() {
        System.out.print("Escriba el tercer lado del triángulo: ");
    }

    private static void pedirSegundoLado() {
        System.out.print("Escriba el segundo lado del triángulo: ");
    }

    private static double leerDouble() {
        Scanner teclado = new Scanner(System.in);
        return teclado.nextDouble();
    }

    private static void pedirBaseTriangulo() {
        System.out.print("Escriba el valor del primer lado (base) del triángulo: ");
    }

    private static int leerOpcion() {
        Scanner teclado = new Scanner(System.in);
        return teclado.nextInt();
    }

    private static void pedirOpcion() {
        System.out.print("Escoja una opción: ");
    }

    private static void escribirMenu() {
        System.out.println("\n FIGURAS GEOMÉTRICAS \n" + "1. Triángulo\n" + "2. Rectángulo\n" + "3. Cuadrado\n" + "4. Pentágono\n" + "0. Salir");
    }
}
