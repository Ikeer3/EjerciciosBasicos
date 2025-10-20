import java.util.Random;
import java.util.Scanner;
public class bucles {
    public static void main(String[] args) {

        // EJERCICIO 1 "El Minero de Minecraft"
        //Pide al usuario cuántos bloques quiere picar.
        // Usa un bucle for para simular que los va picando uno a uno e imprime mensajes como:
        // "Picando bloque 1...", "Picando bloque 2...", etc.
        // Al final, imprime "Has terminado de picar X bloques!".

        Scanner scanner = new Scanner(System.in);
        System.out.println("Cuántos bloques quieres picar?: ");
        int bloques = scanner.nextInt();

        for (int i = 1; i <= bloques; i++) {
            System.out.println("Picando bloque " + i);
        }
        System.out.println("Has terminado de picar " + bloques + " bloques!");

        //EJERCICIO 2 "La Máquina de Refrescos"
        // Pide al usuario su saldo y el precio del refresco.
        // Si tiene dinero suficiente, calcula el cambio y muestra "Aquí tienes tu
        // refresco y tu cambio: X €". Si no, muestra "Saldo insuficiente 😞".
        // Permite repetir la compra con un bucle while hasta que el usuario introduzca saldo suficiente.

        System.out.println("\nCuál es tu saldo?: ");
        int saldo = scanner.nextInt();
        System.out.println("Cuánto te valió el refresco?: ");
        int refresco = scanner.nextInt();


        while (saldo >= refresco) {
            saldo = saldo - refresco;
            System.out.println("Te queda este saldo: " + saldo + "€");
            System.out.println("Cuánto te cuesta otro refresco?: ");
            refresco = scanner.nextInt();
        }
        System.out.println("\nSaldo insuficiente \uD83D\uDE1E");

        // EJERCICIO 3 "Batalla Pokémon Simplificada"
        // Pide al usuario los puntos de vida (HP) de su Pokémon y los del rival.
        // Mientras ambos tengan vida (while), resta daño en cada turno y muestra el resultado. no tienes que elegir tipo de ataque; simplemente, resta un daño concreto que has guardado en una variable previamente.
        // Usa condicionales para determinar quién gana: "Tu Pokémon ha ganado!" o "Has perdido...".

        System.out.println("\nCuántos puntos de vida tiene tu Charizard?: ");
        int vida = scanner.nextInt();
        System.out.println("Y los de tu rival Venusaur?: ");
        int vidaRival = scanner.nextInt();

        int danho = 20;
        int turno = 1;
        boolean turnoPokemon = true;

        while (vida > 0 && vidaRival > 0) {
            System.out.println("\nTurno " + turno++);
            System.out.println("\nContendientes: ");
            System.out.println("Charizard" + "\nVida: " + vida);
            System.out.println("Venusaur" + "\nVida: " + vidaRival);
            if (turnoPokemon) {
                System.out.println("\nCharizard pierde " + danho + " puntos de vida");
                vida -= danho;
                System.out.println("Vida restante de Charizard: " + vida);

            } else {
                System.out.println("\nVenusaur pierde " + danho + " puntos de vida");
                vidaRival -= danho;
                System.out.println("Vida restante de Venusaur: " + vidaRival);
            }
            turnoPokemon = !turnoPokemon;
        }
        if (vida <= 0) {
            System.out.println("\nTu pokémon Charizard ha perdido!!");
        } else if (vidaRival <= 0) {
            System.out.println("\nTu pokémon Charizard ha ganado!!");
        }

        // EJERCICIO 4 "Simulador de lanzamiento de moneda"
        // Pide al usuario cuántas veces quiere lanzar una moneda.
        // Usa un bucle for para generar resultados aleatorios (“cara” o “cruz”);
        // Cuenta cuántas veces salió cada uno y muestra el total al final.
        // (Sugerencia: usa Math.random() y condicionales.)

        System.out.println("Cuántas veces quieres lanzar la moneda?: ");
        int lanzamiento = scanner.nextInt();
        int contadorCara = 0;
        int contadorCruz = 0;

        Random moneda = new Random();
        for (int lanzamientoActual = 1; lanzamientoActual <= lanzamiento; lanzamientoActual++) {
            boolean esCara = moneda.nextBoolean();
            if (esCara) {
                System.out.println("Cara!");
                contadorCara++;
            } else {
                System.out.println("Cruz!");
                contadorCruz++;
            }
        }
        System.out.println("Veces que salió cara: " + contadorCara);
        System.out.println("Veces que salió cruz: " + contadorCruz);
        System.out.println("\nTotal: " + lanzamiento + " lanzamientos");

        // EJERCICIO 5 "Adivina el número"
        // Genera un número aleatorio del 1 al 10.
        // Pide al usuario que lo adivine usando un bucle while.
        // Si el número es mayor o menor, muestra una pista con un if.
        // Cuando acierte, imprime "¡Correcto! Has adivinado el número en X intentos!".

        Random Generadornumero = new Random();
        int numeroEntrada = Generadornumero.nextInt(1, 11);

        boolean acierto = false;
        int contador = 0;

        while (!acierto) {
            System.out.println("\nIntroduce el siguiente numero a probar: ");
            int numeroUsuario = scanner.nextInt();
            contador ++;
            if (numeroUsuario > numeroEntrada) {
                System.out.println("Te has pasado");
            } else if (numeroUsuario < numeroEntrada) {
                System.out.println("Te has quedado corto");
            } else {
                System.out.println("Has acertado!!");
                acierto = true;
            }
        }
        System.out.println("Has hecho " + contador + " intentos");
    }
}
