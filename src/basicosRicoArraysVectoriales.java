import java.util.Scanner;

public class basicosRicoArraysVectoriales {
    public static void main(String[] args) {

        // Ejercicio 1: La Lista Inversa
        // Objetivo: Rellenar un array con Scanner y luego mostrarlo en orden inverso.
        //
        // Conceptos: Declaración de array, bucle for (para rellenar), bucle for con decremento (para mostrar).

        // Iniciamos el escaner
        Scanner teclado = new Scanner(System.in);

        System.out.print("\nCuantos nombres quieres guardar?: ");
        int cantidadNombres = teclado.nextInt();

        String[] nombres = new String[cantidadNombres];

        for (int i = 0; i < nombres.length; i++) {
            System.out.print("Introduce el nombre " + (i+1) + ": ");
            nombres[i] = teclado.next();
        }

        for (int i = 0; i < nombres.length; i++) {
            System.out.print("\nNombre " + (i+1) + ": " + nombres[i]);
        }

        System.out.println();
        System.out.println("\n--Lista en orden inverso--");

        // Bucle para imprimir los resultados inversos
        for (int i = nombres.length - 1; i >= 0; i--) {
            int numeroNombre = i;
            System.out.println("Posición " + numeroNombre + ": " + nombres[i]);
        }
    }
}
