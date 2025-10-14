import java.util.Scanner;
public class bucles {
    public static void main(String[] args) {

        // EJERCICIO 1
        //Pide al usuario cuántos bloques quiere picar.
        // Usa un bucle for para simular que los va picando uno a uno e imprime mensajes como:
        // "Picando bloque 1...", "Picando bloque 2...", etc.
        // Al final, imprime "Has terminado de picar X bloques!".

        Scanner scanner = new Scanner(System.in);
        System.out.println("Cuántos bloques quieres picar?: ");
        int bloques = scanner.nextInt();

        for (int i = 1; i <= bloques; i++) {
            System.out.println("Picando bloque " + bloques);
        }
        System.out.println("Has terminado de picar " + bloques + " bloques!");
    }
}
