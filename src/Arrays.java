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

        for (int posicionActualNombres = 0;
             posicionActualNombres < nombresAmong.length;
             posicionActualNombres++) {
            String paraImprimirNombres = "Los participantes son: " + nombresAmong[posicionActualNombres];

            System.out.println(paraImprimirNombres);
        }

        Random impostor = new Random();
        int personaImpostor = impostor.nextInt(0, 6);

        Scanner escaner = new Scanner(System.in);
        System.out.println("\nQuién cres que es el impostor?: ");
        String elegirImpostor = escaner.next();

        String impostorString;
        impostorString=nombresAmong[personaImpostor];

        if (elegirImpostor.equals(impostorString)) {
            System.out.println("Has acertado " + impostorString + " era el impostor");
        } else {
            System.out.println("Has fallado, el impostor era " + impostorString);
        }


        // EJERCICIO 4 - Captura de Pokemon
        // Crea un array de tamaño 5, de String, pero no le des ningún valor.
        // En un bucle:
        // Pregunta al usuario el nombre del Pokemon que acaba de capturar.
        // Guárdalo en la posición correcta del array.
        // Después, imprime el nombre de todos los Pokemon, pero en orden inverso.

        String[] nombresPokemon = new String[5];

        Scanner pokemon = new Scanner(System.in);
        for (int i=0; i < nombresPokemon.length; i++) {
            System.out.println("\nIntroduce el nombre del Pokemon capturado número " + (i+1) + ":");
            String nombrePorEscaner = pokemon.next();
            nombresPokemon[i] = nombrePorEscaner;
        }
        for (int i = nombresPokemon.length-1; i>=0; i--) {
            int numeroCaptura = i;
            System.out.println("Posición " + numeroCaptura + ": " + nombresPokemon[i]);
        }


        // EJERCICIO 5 - Chequeo de niveles de poder
        // Crea un array con 5 nombres de Saiyans, y otro array con sus poderes. Por ejemplo, en la posición 0 del de nombres
        // puede aparecer Vegeta, en la posición 0 del de poderes, puede aparecer 9000.
        //
        // A continuación, en un bucle:
        // Pregunta al usuario de quién quiere conocer el poder.
        // Imprime el poder de ese guerrero si existe; si no existe, imprime "No tengo datos".
        // Pregunta al usuario si quiere preguntar por otro guerrero, o si quiere acabar
        // Tras salir del bucle:
        // Calcula el saiyan más fuerte y el más débil.
        // Imprime "El saiyan más fuerte es [nombre] con un poder de [poder]"
        // Imprime "El saiyan más débil es [nombre] con un poder de [poder]"

        String[] nombreSaiyans = new String[5];

        nombreSaiyans[0] = "Vegeta";
        nombreSaiyans[1] = "Freezer";
        nombreSaiyans[2] = "Goku";
        nombreSaiyans[3] = "Krilin";
        nombreSaiyans[4] = "Cell";

        int[] poderesSaiyans = new int [5];

        poderesSaiyans [0] = 8000;
        poderesSaiyans [1] = 9000;
        poderesSaiyans [2] = 10000;
        poderesSaiyans [3] = 6000;
        poderesSaiyans [4] = 7000;

        Scanner escanerSaiyan = new Scanner(System.in);

        System.out.println("\nDe qué Saiyan quieres conocer su poder?: ");
        String saiyanBuscado = escanerSaiyan.next();

        int indiceEncontrado = -1;
        for (int posicionActualSaiyans = 0;
             posicionActualSaiyans < nombreSaiyans.length;
             posicionActualSaiyans++) {

            if (nombreSaiyans[posicionActualSaiyans].equals(saiyanBuscado)) {
                indiceEncontrado = posicionActualSaiyans;
            }
        }
        if (indiceEncontrado != -1) {
            System.out.println("\nEl nivel de poder de " + saiyanBuscado + " es: " + poderesSaiyans[indiceEncontrado]);
        } else {
            System.out.println("El nivel de poder de " + saiyanBuscado + " no fue encontrado");
        }
        // Calcular Saiyan más poderoso y el más débil
        int mayorPoder = poderesSaiyans[0];
        int menorPoder = poderesSaiyans[0];
        int nombreMax = 0;
        int nombreMin = 0;

        for (int posicionActualPoderes = 1;
             posicionActualPoderes < poderesSaiyans.length;
             posicionActualPoderes++) {
            if (poderesSaiyans[posicionActualPoderes] > mayorPoder) {
                mayorPoder = poderesSaiyans[posicionActualPoderes];
                nombreMax = posicionActualPoderes;
            } else if (poderesSaiyans[posicionActualPoderes] < menorPoder) {
                menorPoder = poderesSaiyans[posicionActualPoderes];
                nombreMin = posicionActualPoderes;
            }
        }
        System.out.println("El Saiyan más fuerte es " + nombreSaiyans[nombreMax] + " con un poder de " + mayorPoder);
        System.out.println("El Saiyan más débil es " + nombreSaiyans[nombreMin] + " con un poder de " + menorPoder);


        // EJERCICIO 6 - Creación de un array aleatorio
        // Realiza un programa que genere un array de números aleatorios DECIMALES. Para ello:
        //
        // 1.- Pide por teclado el número de elementos que tendrá el array. Tienes que pedirlo ANTES de
        // crear el array - recuerda, cuando inicializamos un array, tenemos que decir cuantos elementos
        // va a tener.
        // 2.- Pide por teclado el número mínimo para los valores aleatorios.
        // 3.- Pide por teclado el número máximo para los valores aleatorios.
        //
        // Una vez que tengas todos estos datos, crea el array en un bucle. A continuación, en otro bucle,
        // imprime el array como:
        // posición 0: 0,32
        // posición 1: 5,27
        // posición 2: 4,31
        // posición 3: 2,27

        Scanner escanerArrayTeclado = new Scanner(System.in);
        Random aleatorio = new Random();
        System.out.println("\nQué tamaño tendrá el Array?: ");
        int tamanhoArray =  escanerArrayTeclado.nextInt();

        System.out.println("Introduce el valor mínimo del Array: ");
        double valorMinArray = escanerArrayTeclado.nextDouble();

        System.out.println("Introduce el valor máximo del Array: ");
        double valorMaxArray = escanerArrayTeclado.nextDouble();

        double[] arrayTeclado = new double[tamanhoArray];

        for (int datoArray = 0; datoArray < tamanhoArray; datoArray++) {
            arrayTeclado[datoArray] = aleatorio.nextDouble(valorMinArray, valorMaxArray);
        }

        System.out.println("El Array ingresado es: ");
        for (int i = 0; i < tamanhoArray; i++) {
            System.out.println("Posición " + (i+1) + (": ") + arrayTeclado[i]);
        }
    }
}