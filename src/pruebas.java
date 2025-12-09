import java.util.Scanner;

public class pruebas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double suma = 0;
        int contador = 0;
        double nota;

        System.out.println("Introduce notas (0-10). Pon -1 para acabar.");

        while (true) {

            // --- PASO 1: EL FILTRO DE SEGURIDAD (Do-While) ---
            // Este bucle atrapa al usuario hasta que da un dato válido o un -1.
            // NO se suma ni se cuenta nada aquí dentro.
            do {
                System.out.print("Introduce nota: ");
                nota = scanner.nextDouble();

                // Si quiere salir, rompemos el filtro inmediatamente
                if (nota == -1) {
                    break;
                }

                // Si la nota es mala, avisamos y el while(condición) le obligará a repetir
                if (nota < 0 || nota > 10) {
                    System.out.println(">> Error: El 15 no vale. Solo de 0 a 10.");
                }

            } while (nota < 0 || nota > 10);
            // Se repite MIENTRAS la nota sea inválida (por ejemplo 15)


            // --- PASO 2: VERIFICAR SI QUEREMOS SALIR ---
            // Si salimos del do-while porque era -1, rompemos el bucle principal
            if (nota == -1) {
                break;
            }

            // --- PASO 3: PROCESAR EL DATO (Zona Segura) ---
            // Si el código llega aquí, es IMPOSIBLE que sea 15, ni -1.
            // Es seguro sumar y contar.
            suma += nota;
            contador++;
            System.out.println("Nota válida registrada (" + contador + " en total).");
        }

        // Resultados
        if (contador > 0) {
            System.out.println("Media: " + (suma / contador));
        } else {
            System.out.println("No se introdujeron notas.");
        }
    }
}
