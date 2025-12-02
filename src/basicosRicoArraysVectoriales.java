import java.util.Arrays;
import java.util.Scanner;

public class basicosRicoArraysVectoriales {
    public static void main(String[] args) {
/*
        // Ejercicio 1: La Lista Inversa
        // Objetivo: Rellenar un array con Scanner y luego mostrarlo en orden inverso.
        //
        // Conceptos: Declaración de array, bucle for (para rellenar), bucle for con decremento (para mostrar).

        Scanner teclado = new Scanner(System.in);

        System.out.print("\nCuantos nombres quieres guardar?: ");
        int cantidadNombres = teclado.nextInt();

        String[] nombres = new String[cantidadNombres];

        for (int i = 0; i < nombres.length; i++) {
            System.out.print("Introduce el nombre " + (i + 1) + ": ");
            nombres[i] = teclado.next();
        }

        for (int i = 0; i < nombres.length; i++) {
            System.out.print("\nNombre " + (i + 1) + ": " + nombres[i]);
        }

        System.out.println();
        System.out.println("\n--Lista en orden inverso--");

        // Bucle para imprimir los resultados inversos
        for (int i = nombres.length - 1; i >= 0; i--) {
            int numeroNombre = i;
            System.out.println("Posición " + numeroNombre + ": " + nombres[i]);
        }

        // Ejercicio 2: El Mejor y Peor Jugador (Buscar en un Array)
        // Objetivo: Encontrar las puntuaciones más alta y más baja dentro de un array de int.
        //
        // Conceptos: Inicializar variables de seguimiento (max/min), recorrer array, if para comparar.

        // Creamos un Array con puntuaciones del 0 al 50
        int[] puntuaciones = new int[5];

        puntuaciones[0] = 16;
        puntuaciones[1] = 26;
        puntuaciones[2] = 47;
        puntuaciones[3] = 31;
        puntuaciones[4] = 12;

        int puntuacionMax = puntuaciones[0];
        int puntuacionMin = puntuaciones[0];

        for (int i = 0; i < puntuaciones.length; i++) {
            if (puntuaciones[i] > puntuacionMax) {
                puntuacionMax = puntuaciones[i];
            } else if (puntuaciones[i] < puntuacionMin) {
                puntuacionMin = puntuaciones[i];
            }
        }
        System.out.println("\n--Puntuaciones de la partida--");
        System.out.println("Puntuación más alta (MVP): " + puntuacionMax);
        System.out.println("Puntuación más baja: " + puntuacionMin);
*/
        // Ejercicio 3: Buscador de películas
        // Objetivo: Pedir al usuario el nombre de una película y buscar si existe en nuestro catálogo (array).
        //
        // Conceptos: Recorrer array, comparar String (con .equalsIgnoreCase()), variable boolean (bandera).

        String[] peliculas = new String[6];

        peliculas[0] = "Matrix";
        peliculas[1] = "Batman";
        peliculas[2] = "Origen";
        peliculas[3] = "Seven";
        peliculas[4] = "Whiplash";
        peliculas[5] = "Avatar";

        Scanner peliTeclado = new Scanner(System.in);

        System.out.print("\nQué película quieres buscar?: ");
        String peliElegida = peliTeclado.next();

        boolean peliEncontrada = false;

        for (int i = 0; i < peliculas.length; i++) {
            if (peliculas[i].equalsIgnoreCase(peliElegida)) {
                peliEncontrada = true;
            }
        }

        if (peliEncontrada) {
            System.out.println("\nSi! " + peliElegida + " está en nuestro catálogo");
        } else {
            System.out.println("\nLo sentimos, " + peliElegida + " no está en nuestro catálogo");
        }
    }
}
