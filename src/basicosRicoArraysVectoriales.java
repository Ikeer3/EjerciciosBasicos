import java.util.Arrays;
import java.util.Scanner;

public class basicosRicoArraysVectoriales {
    public static void main(String[] args) {

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


        // Ejercicio 4: Fusión de convocatorias
        // Objetivo: Crear dos arrays (dos equipos) y combinarlos en un tercer array más grande.
        //
        // Conceptos: Declarar múltiples arrays, System.arraycopy() o bucles for para copiar.

        String[] equipoBarca = new String[4];

        equipoBarca[0] = "Iniesta";
        equipoBarca[1] = "Messi";
        equipoBarca[2] = "Lamine";
        equipoBarca[3] = "Xavi";

        String[] equipoMadrid = new String[3];

        equipoMadrid[0] = "Cristiano";
        equipoMadrid[1] = "Benzema";
        equipoMadrid[2] = "Casillas";

        // Calculamos el tamaño para el array combinado
        int longitudBarca = equipoBarca.length;
        int longitudMadrid = equipoMadrid.length;
        int logitudTotal = longitudBarca + longitudMadrid;

        // Creamos el array combinado (vacío por ahora)
        String[] equipoCombinado = new String[logitudTotal];

        System.out.println("\n---Fusionando Equipos---");

        // Copiamos el primer equipo al principio (posición 0)
        System.arraycopy(equipoBarca, 0, equipoCombinado, 0, longitudBarca);

        // Copiamos el segundo equipo donde terminó el anterior
        System.arraycopy(equipoMadrid, 0, equipoCombinado, longitudBarca, longitudMadrid);

        // Mostramos el resultado
        for (int i = 0; i < equipoCombinado.length; i++) {
            System.out.print("\nEquipo Fusión: " + equipoCombinado[i]);
        }


        // Ejercicio 5: Batalla de coches
        // Objetivo: Tienes dos arrays que representan las estadísticas (Velocidad, Aceleración, Manejo) de dos coches.
        // Compararlos "posición a posición" para ver quién gana en cada estadística.
        //
        // Conceptos: Arrays paralelos, recorrer con for, if-else if-else.

        int[] ferrari = new int[3];

        ferrari[0] = 340;
        ferrari[1] = 3;
        ferrari[2] = 94;

        int[] porsche = new int[3];

        porsche[0] = 320;
        porsche[1] = 3;
        porsche[2] = 98;

        int victoriasFerrari = 0;
        int victoriasPorsche = 0;

        System.out.println("\n--- COMPARATIVA FERRARI vs PORSCHE ---");

        for (int i = 0; i < ferrari.length; i++) {

            String categoria = " ";
            if (i == 0) {
                categoria = "Velocidad";
            } else if (i == 1) {
                categoria = "Aceleración";
            } else if (i == 2){
                categoria = "Manejo";
            }

            if (ferrari[i] > porsche[i]) {
                System.out.println(categoria + ": Gana Ferrari" + " (" + ferrari[i] + ")");
                victoriasFerrari++;
            } else if (porsche[i] > ferrari[i]) {
                System.out.println(categoria + ": Gana Porsche" + " (" + porsche[i] + ")");
                victoriasPorsche++;
            } else {
                System.out.println(categoria + ": Empate");
            }

        }
        System.out.println("\n--- RESULTADO FINAL ---");
        System.out.println("Victorias Ferrari: " + victoriasFerrari);
        System.out.println("Victorias Porsche: " + victoriasPorsche);
    }
}
