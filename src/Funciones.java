import java.util.Random;
import java.util.Scanner;

public class Funciones {

    /**
     * Esta función se utiliza para imprimir el nombre que recibe por consola
     * @param nombre el que el usuario elige por consola
     */
    public static void saludar(String nombre) {
        String paraImprimir = "¡Hola, " + nombre + "! Bienvenido al servidor de programación";
        System.out.println(paraImprimir);
    }

    /**
     * Esta función se utiliza para sumar dos números enteros
     * @param a número entero mayor o igual que cero
     * @param b número entero mayor o igual que cero
     * @return el resultado de la suma
     */
    public static int sumar(int a, int b) {
        int suma = a + b;
        return suma;
    }

    public static int celsiusAFahrenheit(int C) {
        int celsius = (C * 9 / 5) + 32;
        return celsius;
    }

    public static int lanzarDado() {
        Random numeroRandom = new Random();
        int dado = numeroRandom.nextInt(1, 7);
        return dado;
    }

    public static int sumaCalculadora(int a, int b) {
        int sumaCalculadora = a + b;
        return sumaCalculadora;
    }

    public static int restaCalculadora(int a, int b) {
        int resta = a - b;
        return resta;
    }

    public static int multiplicacionCalculadora(int a, int b) {
        int multiplicacion = a * b;
        return multiplicacion;
    }

    public static double divisionCalculadora(double a, double b) {
        double division = a / b;
        return division;
    }

    public static void main(String[] args) {
        // EJERCICIO 1 "Saludo personalizado"
        // Crea una función estática llamada saludar() que reciba un nombre como parámetro (String)
        // y muestre por pantalla:
        // "¡Hola, [nombre]! Bienvenido al servidor de programación."
        // Desde main, pide el nombre por teclado y llama a la función.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Cuál es tu nombre?: ");
        String nombrePorTeclado = scanner.next();
        saludar(nombrePorTeclado);

        // EJERCICIO 2 "Suma de dos números"
        // Crea una función estática llamada sumar() que reciba dos números enteros
        // y devuelva su suma. En el main, pide los dos números, llama a la función
        // y muestra el resultado con un mensaje como: "La suma de A + B es = X".

        Scanner sumaSimple = new Scanner(System.in);

        System.out.println("\nDame un número entero: ");
        int sumaCalculadora = sumaSimple.nextInt();
        System.out.println("Dame otro número entero: ");
        int otraSumaCalculadora = sumaSimple.nextInt();

        System.out.println("La suma de A + B es: " + sumar(sumaCalculadora, otraSumaCalculadora));

        // EJERCICIO 3 "Conversión de temperatura"
        // Crea una función estática llamada celsiusAFahrenheit() que reciba una temperatura
        // en Celsius y devuelva su conversión a Fahrenheit usando la fórmula F = (C * 9/5) + 32.
        // Desde el main, pide una temperatura al usuario y muestra el resultado.

        System.out.println("\nDame una temperatura Celsius: ");
        Scanner escanerTemperatura = new Scanner(System.in);

        int temperaturaPorTeclado = escanerTemperatura.nextInt();
        celsiusAFahrenheit(temperaturaPorTeclado);

        System.out.println("La temperatura en Farenheit es: " + celsiusAFahrenheit(temperaturaPorTeclado));

        // EJERCICIO 4 "Crea un dado"
        // Crea una función estática llamada lanzarDado() que no reciba parámetros y
        // devuelva un número aleatorio entre 1 y 6. Desde main, llama a la función
        // varias veces (por ejemplo, dentro de un for) y muestra cada lanzamiento.

        for (int i = 1; i <= 6; i++) {
            System.out.println("\nEl lanzamiento fue: " + lanzarDado());
        }

        // EJERCICIO 5 "Calculadora simple"
        // Crea 4 funciones estáticas:
        //
        // sumar(int a, int b)
        // restar(int a, int b)
        // multiplicar(int a, int b)
        // dividir(double a, double b)
        // Desde main, pide dos números al usuario y una operación (por ejemplo: “+”, “-”, “*”, “/”),
        // usa un if o switch para decidir qué función llamar y muestra el resultado.

        Scanner calculadora = new Scanner(System.in);

        System.out.println("\nIngresa un número: ");
        int numeroCalculadora = calculadora.nextInt();
        System.out.println("Ingresa otro numero: ");
        int OtroNumeroCalculadora = calculadora.nextInt();
        System.out.println("Que operación quieres usar?: ");
        String operacion = calculadora.next();

        if (operacion.equals("suma")) {
            System.out.println("\nEl resultado es: " + sumaCalculadora(numeroCalculadora, OtroNumeroCalculadora));
        }
        if (operacion.equals("resta")) {
            System.out.println("\nEl resultado es: " + restaCalculadora(numeroCalculadora, OtroNumeroCalculadora));
        }
        if (operacion.equals("multiplicacion")) {
            System.out.println("\nEl resultado es: " + multiplicacionCalculadora(numeroCalculadora, OtroNumeroCalculadora));
        }
        if (operacion.equals("division")) {
            System.out.println("\nEl resultado es: " + divisionCalculadora(numeroCalculadora, OtroNumeroCalculadora));
        }
    }
}
