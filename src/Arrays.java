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

        for ( int posicionActualJuego = 0;
              posicionActualJuego<puntuaciones.length;
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
                mayorPuntuacion + " puntos";

        System.out.println(paraImprimirPuntuaciones);
    }
}
