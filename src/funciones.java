import java.util.Scanner;
public class funciones {

    public static String saludar() {
        return "¡Hola, " + saludar() + "! Bienvenido al servidor de programación";
    }

    public static void main(String[] args) {
        // EJERCICIO 1 "Saludo personalizado"
        // Crea una función estática llamada saludar() que reciba un nombre como parámetro (String)
        // y muestre por pantalla:
        // "¡Hola, [nombre]! Bienvenido al servidor de programación."
        // Desde main, pide el nombre por teclado y llama a la función.

        Scanner scanner = new Scanner(System.in);
        String nombre = scanner.next();
    }
}
