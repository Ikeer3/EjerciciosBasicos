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

        System.out.println("Cuál es tu saldo?: ");
        int saldo = scanner.nextInt();
        System.out.println("Cuánto te valió el refresco?: ");
        int refresco = scanner.nextInt();

        int cambio = saldo - refresco;

        while (saldo > refresco) {
            System.out.println("Aquí tienes tu refresco y tu cambio: " + cambio + "€");
            System.out.println("Cuánto te valió el siguiente refresco?: ");
            int nuevoRefresco = scanner.nextInt();
        }
            System.out.println("Saldo insuficiente \uD83D\uDE1E");
    }
}
