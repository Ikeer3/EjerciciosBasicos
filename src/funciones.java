import java.util.Scanner;
public class funciones {

    public static void saludar(String nombre) {
        String paraImprimir =  "¡Hola, " + nombre + "! Bienvenido al servidor de programación";
        System.out.println(paraImprimir);
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
    }
}
