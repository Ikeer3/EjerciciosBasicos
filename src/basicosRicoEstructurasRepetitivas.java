import java.util.Random;
import java.util.Scanner;

public class basicosRicoEstructurasRepetitivas {
    public static void main(String[] args) {
/*
        // Ejercicio 1: Analizador de Números

        // Objetivo: Crear un programa que pida al usuario 5 números enteros y,
        // al final, muestre cuál fue el número más alto y cuál el más bajo de los introducidos.
        // El programa debe permitir repetir la operación cuantas veces quiera el usuario.

        Scanner lectorNumeros = new Scanner(System.in);
        String respuesta;

        do {
            int mayor = 0;
            int menor = 0;

            System.out.println("");

            for (int i = 1; i < 6; i++) {
                System.out.print("Introduce el número " + i + ": ");
                int numerosElegidos = lectorNumeros.nextInt();

                if (i == 1) {
                    mayor = numerosElegidos;
                    menor = numerosElegidos;
                } else {
                    if (numerosElegidos > mayor) {
                        mayor = numerosElegidos;
                    } else if (numerosElegidos < menor) {
                        menor = numerosElegidos;
                    }
                }
            }
            System.out.println("\nEl número más alto es: " + mayor);
            System.out.println("El número más bajo es: " + menor);

            System.out.print("\nDeseas continuar? Escribe si para continuar: ");
            respuesta = lectorNumeros.next();

        } while (respuesta.equalsIgnoreCase("si"));
        System.out.println("---Programa finalizado---");


        // Ejercicio 2: Simulador de Cajero Automático

        // Objetivo: Desarrollar un programa que simule las operaciones básicas de un cajero automático.
        // El usuario empieza con un saldo inicial y puede realizar operaciones hasta que decida salir.
        // Dentro del menú, ofrece opciones como: 1. Consultar Saldo, 2. Ingresar Dinero, 3. Retirar Dinero, 4. Salir.

        Scanner lectorCajero = new Scanner(System.in);
        String respuestaSalir;
        int saldo = 1000;

        System.out.println("\n---BIENVENIDO A TU CAJERO AUTOMÁTICO---");

        do {
            System.out.print("\nDeseas consultar tu saldo, ingresar dinero o retirar dinero?");
            System.out.print("\nEscribe consulta, ingreso o retiro: ");
            String movimientoCajero = lectorCajero.next();

            if (movimientoCajero.equalsIgnoreCase("consulta")) {
                System.out.println("\nTu saldo es: " + saldo + "$");
            } else if (movimientoCajero.equalsIgnoreCase("ingreso")) {
                System.out.print("\nCuánto dinero deseas ingresar?: ");
                int ingresoDinero = lectorCajero.nextInt();
                saldo = saldo + ingresoDinero;
                System.out.println("Tu saldo con el ingreso es: " + saldo + "$");
            } else if (movimientoCajero.equalsIgnoreCase("retiro")) {
                System.out.print("\nCuánto dinero deseas retirar?: ");
                int cantidadRetiro = lectorCajero.nextInt();
                while (cantidadRetiro <= 0 || cantidadRetiro > saldo) {
                    System.out.println("Error, la cantidad de retiro no puede ser negativa, cero o mayor que tu saldo");
                    System.out.print("\nIntroduce otra cantidad: ");
                    cantidadRetiro = lectorCajero.nextInt();
                }
                saldo = saldo - cantidadRetiro;
                System.out.println("Tu saldo después del retiro es: " + saldo + "$");
            }

            System.out.print("\nQuieres continuar o salir del cajero? Escribe continuar para seguir o salir para terminar: ");
            respuestaSalir = lectorCajero.next();

        } while (respuestaSalir.equalsIgnoreCase("continuar"));
        System.out.println("\n---HAS CERRADO TU CAJERO, HASTA LA PRÓXIMA!---");


        // Ejercicio 3: Aventura de Texto Simple

        // Objetivo: Crear una mini aventura de texto donde el jugador debe tomar decisiones para escapar de una habitación.
        // El juego termina si el jugador gana o pierde.

        boolean haGanado = false;
        boolean haPerdido = false;
        int intentosMaximos = 3;
        Scanner lectorEleccion = new Scanner(System.in);

        while (!haGanado && !haPerdido){
            System.out.println("\nErik está atrapado en una habitación a oscuras y necesita encontrar " +
                    "la llave para poder salir de allí.");
            System.out.print("Quieres que Erik busque por el suelo o por las paredes?");
            System.out.print("\nEscribe suelo o pared: ");
            String buscar = lectorEleccion.next();

            if (buscar.equalsIgnoreCase("suelo")) {
                System.out.println("\nErik se tropieza con un cristal roto");
                System.out.println("Coge el cristal y va hacia la puerta para intentar romperla");
                haPerdido = false;

                for (int i = 1; i <= intentosMaximos; i++) {
                    Random numeroAleatorio = new Random();
                    int aleatorio = numeroAleatorio.nextInt(1, 11);
                    System.out.print("\nIntento " + i + ". Introduce un número del 1 al 10: ");
                    int adivinarNum = lectorEleccion.nextInt();
                    if (adivinarNum == aleatorio) {
                        System.out.println("Enhorabuena has acertado el número y Erik consigue romper la puerta, eres LIBRE!");
                        haGanado = true;
                        break;
                    } else {
                        if (i == intentosMaximos) {
                            System.out.println("\nEl cristal se rompe del todo, una gas misterioso sale de las paredes " +
                                    "y Erik cae al suelo pálido...");
                            haPerdido = true;
                        } else if (adivinarNum < aleatorio) {
                            System.out.println("El número es mayor que el " + adivinarNum);
                        } else {
                            System.out.println("El número es menor que el " + adivinarNum);
                        }
                    }
                }
            } else if (buscar.equalsIgnoreCase("pared")) {
                System.out.println("\nErik encuentra una llave colgada de un perchero. La coge y consigue abrir la puerta");
                haGanado = true;
            }
        }


        // Ejercicio 4: Juego de Adivinar el Número
        // Objetivo: El programa generará un número secreto aleatorio entre 1 y 100.
        // El usuario debe adivinarlo. A diferencia de la versión simple,
        // el programa llevará la cuenta de los intentos y al final mostrará un resumen de todos
        // los números que el usuario ha probado.

        int numeroSecreto = (int) ((Math.random() * 100) + 1);
        Scanner escanerNumero = new Scanner(System.in);
        int numeroUsuario;
        int intentos = 0;
        String historial = "";

        do {
            System.out.println("\n---INTENTO " + (intentos + 1) + "---");
            System.out.print("Introduce un número del 1 al 100: ");
            numeroUsuario = escanerNumero.nextInt();
            intentos++;
            historial = historial + numeroUsuario + ", ";

        } while (numeroSecreto != numeroUsuario);
        System.out.println("\nENHORABUENA!! El número secreto era el " + numeroSecreto);
        System.out.println("Has necesitado " + intentos + " intentos para averiguarlo");
        System.out.println("\nHas probado todos estos números: " + historial);

        for (int i = 0; i < 3; i++) {
            System.out.print("\nFELICIDADES!!!");
        }

*/
        // Ejercicio 5: Cálculo de Media de Calificaciones

        // Objetivo: Crear un programa que calcule la media de un número indeterminado de calificaciones.
        // El usuario introducirá notas una por una hasta que introduzca un -1 para indicar que ha terminado.
        // El programa debe validar que las notas estén entre 0 y 10.

        Scanner lectorNotas = new Scanner(System.in);
        double notasUsuario;
        double suma = 0;
        int contador = 0;

        System.out.println("");

        while (true) {
            do {
                System.out.print("Introduce las notas de la clase entre el 0 y el 10 " +
                        "(cuando quieras parar escribe -1): ");
                notasUsuario = lectorNotas.nextDouble();
                if (notasUsuario == -1) {
                    break;
                }
                if (notasUsuario < 0 || notasUsuario > 10) {
                    System.out.println("\nERROR, la nota tiene que estar entre 0 y 10");
                }
            } while (notasUsuario < 0 || notasUsuario > 10);

            if (notasUsuario == -1) {
                break;
            }
            suma = suma + notasUsuario;
            contador++;
            System.out.println("Nota registrada. Llevas " + contador + " notas.");
        }
        if (contador > 0) {
            double media = suma / contador;
            System.out.println("\nHas introducido " + contador + " notas");
            System.out.printf("La media final es: %.2f\n", media);
        } else {
            System.out.println("No se introdujeron notas válidas.");
        }
    }
}
