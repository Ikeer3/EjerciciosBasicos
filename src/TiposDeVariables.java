public class TiposDeVariables {
    public static void main(String[] args) {

        // ==============================
        // Introducción
        // ==============================
        // Este fichero Java contiene VARIOS ejercicios básicos.
        // Para cada ejercicio, tenéis que hacer lo que indica.
        // Conforme vayáis haciendo ejercicios, cada vez que lo ejecutéis
        // ejecutará de nuevo todos los anteriores, pero está correcto (no borréis
        // los ejercicios ya hechos).

        // ==============================
        // EJERCICIO 1 – Ficha de personaje (Minecraft)
        // ==============================
        // Crea variables con el nombre del jugador, nivel, vida (double)
        // y si tiene armadura (boolean). Imprímelas como si fuese una ficha del jugador.

        System.out.println("\n---Ejercicio 1---");
        String nombreJugador = "Iker";
        long nivel = 500000;
        double vida = 20.0;
        boolean armadura = true;
        System.out.println("El Nombre del Jugador es: " + nombreJugador +
                "\nSu nivel es: " + nivel +
                "\nSu vida es: " + vida +
                "\nTiene armadura? " + armadura);


        // ==============================
        // EJERCICIO 2 – Batalla rápida (Pokémon)
        // ==============================
        // Declara dos variables con el ataque de Pikachu y la defensa de Charmander.
        // Calcula el daño causado (ataque – defensa).
        // Imprime el resultado: "Pikachu hace X puntos de daño a Charmander" - X es el valor real del daño.

        System.out.println("\n---Ejercicio 2---");
        String ataquePikachu = "rayo";
        String ataqueCharmander = "defensa férrea";
        int dañoPikachu = 50;
        int defensaCharmander = 30;
        int dañoCausado = dañoPikachu - defensaCharmander;
        System.out.println("Pikachu usa " + ataquePikachu +
                "\nCharmander usa " + ataqueCharmander +
                "\nPikachu hace " + dañoCausado + " puntos de daño a Charmander");


        // ==============================
        // EJERCICIO 3 – Monedas y compras (Fortnite)
        // ==============================
        // Declara una variable con el número de V-Bucks que tiene un jugador.
        // Resta el precio de una skin (ej: 1200).
        // Imprime el resultado: "Después de comprar la skin, te quedan X V-Bucks".

        System.out.println("\n---Ejercicio 3---");
        String dineroJugador = "5000";
        int dinero = 5000;
        int skin = 1200;
        int compra = dinero - skin;
        System.out.println("El jugador tiene " + dineroJugador + " V-Bucks" +
                "\nDespués de comprar la skin, le quedan " + compra + " V-Bucks");


        // ==============================
        // EJERCICIO 4 – Velocidad de campeón (League of Legends)
        // ==============================
        // Declara una variable con la velocidad base de un campeón
        // y otra con un buff de velocidad.
        // Calcula la velocidad final sumando ambos valores.
        // Imprime el resultado: "La velocidad final de Jinx es X".

        System.out.println("\n---Ejercicio 4---");
        int velocidadJinx = 50;
        int buffVelocidad = 30;
        System.out.println("La velocidad final de Jinx es " + (velocidadJinx + buffVelocidad));


        // ==============================
        // EJERCICIO 5 – Conversor de monedas de juego
        // ==============================
        // Declara una cantidad de monedas de Minecraft.
        // Convierte a su equivalente en V-Bucks y en RP de LoL
        // usando tasas de cambio inventadas (ej: 1 moneda MC = 5 V-Bucks = 2 RP).
        // Imprime el resultado en formato claro.

        System.out.println("\n---Ejercicio 5---");
        int monedaMinecraft = 1;
        int bucks = monedaMinecraft * 5;
        int rp = monedaMinecraft * 2;
        System.out.println(monedaMinecraft + " moneda MC = " +
                bucks + " V-Bucks = " +
                rp + " RP");


        // ==============================
        // EJERCICIO 6 – Clasificación de jugador (Fortnite / LoL)
        // ==============================
        // ESTE EJERCICIO INCLUYE SENTENCIAS DE CONTROL. No pertenece a tipos de variables.
        // Si te aburres, investiga cómo se haría y entiéndelo.
        //
        // Declara variables con el número de kills, muertes y asistencias de una partida.
        // Calcula el KDA = (kills + asistencias) / muertes.
        // Según el resultado:
        //   KDA ≥ 5        → "Jugador PRO"
        //   KDA entre 3–5  → "Jugador BUENO"
        //   KDA entre 1–3  → "Jugador NORMAL"
        //   KDA < 1        → "Jugador NOOB"
        //
        // OPCIONAL: muestra también el tier en el que quedaría (Bronce, Plata, Oro, Platino…).

        System.out.println("\n---Ejercicio 6---");
        int numeroKills = 10;
        int numeroMuertes = 4;
        int numeroAsistencias = 2;
        int KDA = (numeroKills + numeroAsistencias) / numeroMuertes;
        if (KDA >= 5) {
            System.out.println("Jugador PRO y ");
        } else if (KDA >= 3) {
            System.out.println("Jugador BUENO y ");
        } else if (KDA >= 1) {
            System.out.println("Jugador NORMAL y ");
        } else
            System.out.println("Jugador NOOB y ");
        if (KDA >= 5) {
            System.out.println("Tier Platino");
        } else if (KDA >= 3) {
            System.out.print("Tier Oro");
        } else if (KDA >= 1) {
            System.out.print("Tier Plata");
        } else
            System.out.print("Tier Bronce");
    }
}
