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
            } else if (esExcesoVelocidad) ;
        }
        if (velocidadUsuario <= 120) {
            System.out.println("Velocidad adecuada. Sigue así y conduce con seguridad!!");
        }


        // Ejercicio 3: Videoclub de Directores de Cine (Dificultad: Media)

        // Conceptos a practicar: Scanner, String, switch-case, if-else.
        // Enunciado: Crea un programa que recomiende una película basándose en el director
        // elegido por el usuario.

        Scanner lectorDirectores = new Scanner(System.in);
        String respuesta;

        System.out.println("\n---BIENVENIDO AL VIDEOCLUB---");

        do {
            System.out.print("\nElige un director de la lista: Christopher Nolan, Quentin Tarantino, Guillermo del Toro: ");
            String directorElegido = lectorDirectores.nextLine();
            if (directorElegido.equalsIgnoreCase("Christopher Nolan")) {
                System.out.println("\nDirector elegido: " + directorElegido + ". Te recomendamos 'Inception'");
                System.out.print("Te gustan las películas de Ciencia Ficción? (si/no): ");
                String cienciaFiccion = lectorDirectores.next();
                if (cienciaFiccion.equalsIgnoreCase("si")) {
                    System.out.println("Genial!! Disfrutarás de sus mundo complejos.");
                } else if (cienciaFiccion.equalsIgnoreCase("no")) {
                    System.out.println("Quizás prefieras su película 'The Dark Knight', que es más de acción.");
                }
            } else if (directorElegido.equalsIgnoreCase("Quentin Tarantino")) {
                System.out.println("\nDirector elegido: " + directorElegido + ". Te recomendamos 'Pulp Fiction'");
                System.out.print("Te gustan los diálogos ingeniosos? (si/no): ");
                String ingeniosos = lectorDirectores.next();
                if (ingeniosos.equalsIgnoreCase("si")) {
                    System.out.println("Perfecto!! Te encantará el guion.");
                } else if (ingeniosos.equalsIgnoreCase("no")) {
                    System.out.println("No te preocupes, la acción y la trama también son excelentes.");
                }
            } else if (directorElegido.equalsIgnoreCase("Guillermo del Toro")) {
                System.out.println("\nDirector elegido: " + directorElegido + ". Te recomendamos 'El Laberinto del Fauno'");
                System.out.print("Te gustan las historias de fantasía oscura? (si/no): ");
                String fantasiaOscura = lectorDirectores.next();
                if (fantasiaOscura.equalsIgnoreCase("si")) {
                    System.out.println("Te sumergirás en un mundo mágico e inolvidable.");
                } else if (fantasiaOscura.equalsIgnoreCase("no")) {
                    System.out.println("Puedes probar con 'Pacific Rim' para una dosis de acción con monstruos gigantes.");
                }
            } else {
                System.out.println("Director no encontrado en nuestra base de datos");
            }

            System.out.print("\nQuieres elegir otro director? (si/no): ");
            respuesta = lectorDirectores.next();
            lectorDirectores.nextLine();
        } while (respuesta.equalsIgnoreCase("si"));
        System.out.println("\n---EL VIDEOCLUB HA CERRADO---");
    }
}
