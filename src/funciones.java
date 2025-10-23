import java.util.Random;
import java.util.Scanner;
public class funciones {

    public static void saludar(String nombre) {
        String paraImprimir =  "¡Hola, " + nombre + "! Bienvenido al servidor de programación";
        System.out.println(paraImprimir);
    }

    public static int sumar(int a, int b) {
        int suma = a + b;
        return suma;
    }

    public static int celsiusAFahrenheit(int C) {
        int celsius = (C * 9/5) + 32;
        return celsius;
    }

    public static int lanzarDado() {
        Random numeroRandom = new Random();
        int dado = numeroRandom.nextInt(1, 7);
        return dado;
    }

    public static void main(String[] args) {
        // EJERCICIO 1 "Saludo personalizado"
        // Crea una función estática llamada saludar() que reciba un nombre como parámetro (String)
        // y muestre por pantalla:
        // "¡Hola, [nombre]! Bienvenido al servidor de programación."
        // Desde main, pide el nombre por teclado y llama a la función.

        System.out.println("Cuál es tu nombre?: ");
        Scanner scanner = new Scanner(System.in);
        String nombrePorTeclado = scanner.next();
        saludar(nombrePorTeclado);

        // EJERCICIO 2 "Suma de dos números"
        // Crea una función estática llamada sumar() que reciba dos números enteros
        // y devuelva su suma. En el main, pide los dos números, llama a la función
        // y muestra el resultado con un mensaje como: "La suma de A + B es = X".

        System.out.println("\nDame un número entero: ");
        Scanner escanerNumeroEntero = new Scanner(System.in);
        System.out.println("Dame otro número entero: ");
        Scanner escanerOtroNumeroEntero = new Scanner(System.in);

        int sumaPorTeclado = (escanerNumeroEntero.nextInt() + escanerOtroNumeroEntero.nextInt());
        sumar(sumaPorTeclado, sumaPorTeclado);

        System.out.println("La suma de A + B es: " + sumaPorTeclado);

        // EJERCICIO 3 "Conversión de temperatura"
        // Crea una función estática llamada celsiusAFahrenheit() que reciba una temperatura
        // en Celsius y devuelva su conversión a Fahrenheit usando la fórmula F = (C * 9/5) + 32.
        // Desde el main, pide una temperatura al usuario y muestra el resultado.

        System.out.println("\nDame una temperatura Celsius: ");
        Scanner escanerTemperatura = new Scanner(System.in);

        int temperaturaPorTeclado = escanerTemperatura.nextInt();
        celsiusAFahrenheit(temperaturaPorTeclado);

        System.out.println("La temperatura en Farenheit es: " +  celsiusAFahrenheit(temperaturaPorTeclado));

        // EJERCICIO 4 "Crea un dado"
        // Crea una función estática llamada lanzarDado() que no reciba parámetros y
        // devuelva un número aleatorio entre 1 y 6. Desde main, llama a la función
        // varias veces (por ejemplo, dentro de un for) y muestra cada lanzamiento.

        for (int i = 1; i <= 6; i++) {
            System.out.println("\nEl lanzamiento fue: " + lanzarDado());
        }
    }
}
