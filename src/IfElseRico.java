import java.util.Scanner;

public class IfElseRico {
    public static void main(String[] args) {

        // Ejercicio 1: Verificador de Velocidad (Dificultad: Fácil)
        //
        // Conceptos a practicar: Scanner, variables primitivas (int, boolean), System.out y estructura if-else.
        // Enunciado: Crea un programa que pida al usuario la velocidad actual
        // de su coche en km/h (un número entero).

        Scanner lectorVelocidad = new Scanner(System.in);
        boolean esExcesoVelocidad = false;

        System.out.print("\nIntroduce la velocidad actual de tu coche (km/h): ");
        int velocidadUsuario = lectorVelocidad.nextInt();

        if (!esExcesoVelocidad) {
            if (velocidadUsuario > 120) {
                System.out.println("Atención!! Vas a una velocidad excesiva. Riesgo de multa!!");
            } else if (esExcesoVelocidad);
        } if (velocidadUsuario <= 120){
            System.out.println("Velocidad adecuada. Sigue así y conduce con seguridad!!");
        }
    }
}
