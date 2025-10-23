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

        int suma = (escanerNumeroEntero.nextInt() +  escanerOtroNumeroEntero.nextInt());
        sumar(suma, suma);

        System.out.println("La suma de A + B es: " + suma);
    }
}
