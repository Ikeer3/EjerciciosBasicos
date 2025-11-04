import java.util.Random;
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {

        // EJERCICIO 1 - Objetos de Minecraft
        // Crea un array de Strings con los objetos del inventario de un jugador - tiene
        // que tener 5 objetos - (por ejemplo: "espada", "pico", "manzana dorada", "bloques
        // de piedra", "antorchas").
        // Usa un bucle for para imprimir:
        // "Tienes en tu inventario: [objeto]".
        // Luego muestra cuántos objetos tiene el jugador.

        String[] objetosMinecraft = new String[5];

        objetosMinecraft[0] = "espada";
        objetosMinecraft[1] = "pico";
        objetosMinecraft[2] = "manzana dorada";
        objetosMinecraft[3] = "bloques de piedra";
        objetosMinecraft[4] = "antorchas";

        for (int posicionActual = 0;
             posicionActual < objetosMinecraft.length;
             posicionActual++) {
            String paraImprimir = "Tienes en tu inventario: " + objetosMinecraft[posicionActual];

            System.out.println(paraImprimir);
        }
        int cantidadObjetos = objetosMinecraft.length;
        System.out.println("\nEl jugador tiene " + cantidadObjetos + " objetos");


        // EJERCICIO 2 - Puntuaciones de juego
        // Crea un array con las puntuaciones de 6 partidas (valores enteros).
        // Recorre el array para calcular:
        // Puntuación total.
        // Media de puntos por partida.
        // Mayor puntuación conseguida.
        // Muestra todo con mensajes tipo:
        // "Tu récord fue de 2380 puntos en una partida."

        int[] puntuaciones = new int[6];

        puntuaciones[0] = 97;
        puntuaciones[1] = 63;
        puntuaciones[2] = 65;
        puntuaciones[3] = 14;
        puntuaciones[4] = 91;
        puntuaciones[5] = 25;

        int puntuacionTotal = 0;
        int mayorPuntuacion = puntuaciones[0];

        for (int posicionActualJuego = 0;
             posicionActualJuego < puntuaciones.length;
             posicionActualJuego++) {
            if (puntuaciones[posicionActualJuego] > mayorPuntuacion) {
                mayorPuntuacion = puntuaciones[posicionActualJuego];
            }
            puntuacionTotal += puntuaciones[posicionActualJuego];
        }
        int media = puntuacionTotal / puntuaciones.length;
        String paraImprimirPuntuaciones = "\nTu récord fue de " + puntuacionTotal +
                " puntos en una partida" + "\nTu puntuación media fue de " + media +
                " puntos en una partida" + "\nTu mayor puntuación conseguida en una partida fue de " +
                mayorPuntuacion + " puntos\n";

        System.out.println(paraImprimirPuntuaciones);


        // EJERCICIO 3 - Impostor Among us
        // Crea un array con 6 jugadores de Among Us - los nombres.
        // Utiliza la librería Random para decir cual de ellos es el impostor;
        // será el 0, 1, 2, 3, 4 o 5 en el array.
        // Imprime los nombres de los jugadores.
        // Pregunta al jugador cual cree que es el impostor - tiene que escribir el nombre.
        // Utilizando un bucle for, recupera cual es el nombre del impostor que se calculó al principio.
        // Imprime el resultado de la partida.

        String[] nombresAmong = new String[6];

        nombresAmong[0] = "Carlos";
        nombresAmong[1] = "Iván";
        nombresAmong[2] = "Iker";
        nombresAmong[3] = "Daniel";
        nombresAmong[4] = "Isabella";
        nombresAmong[5] = "Marcos";

        Random impostor = new Random();
        int personaImpostor = impostor.nextInt(0, 6);

        for (int posicionActualNombres = 0;
             posicionActualNombres < nombresAmong.length;
             posicionActualNombres++) {
            String paraImprimirNombres = "Los participantes son: " + nombresAmong[posicionActualNombres];

            System.out.println(paraImprimirNombres);
        }
        Scanner escaner = new Scanner(System.in);

        System.out.println("\nQuién cres que es el impostor?: ");
        String elegirImpostor = escaner.next();

        for (int i = 0; i == personaImpostor; i++) {
            System.out.println(personaImpostor);
        }
    }
}
