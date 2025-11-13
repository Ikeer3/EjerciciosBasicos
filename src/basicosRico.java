public class basicosRico {
    public static void main(String[] args) {

        // ARRAYS
        // Ejercicio 1: Declarar, Inicializar y Acceder (El Equipo Pokémon).
        //
        // Objetivo: Crear un array para un equipo Pokémon (tamaño 6), asignar Pokémon a algunas "ranuras"
        // y acceder a ellas.

        String[] nombresPokemon = new String[5];

        // Asignamos a Charmander en la primera posición (índice 0)
        nombresPokemon[0] = "Charmander";
        // Asignamos a Charmeleon en la tercera posición (índice 2)
        nombresPokemon[2] = "Charmeleon";
        // Asignamos a Charizard en la quinta posición (índice 5, que es tamaño -1)
        nombresPokemon[4] = "Charizard";

        // Acceder a valores
        System.out.println("El pokémon en la primera ranura es: " + nombresPokemon[0]);
        System.out.println("El pokémon en la tercera ranura es: " + nombresPokemon[2]);
        // Si accedemos a una ranura vacía...
        System.out.println("El pokémon en la segunda ranura es: " + nombresPokemon[1]); // imprimirá null


        // Ejercicio 2: Recorrer un Array con un bucle for (Garaje de coches).
        //
        // Objetivo: Crear un array de coches y usar un bucle for para imprimir todos los elementos.
        // Aquí usamos una forma de inicialización más directa.

        String[] marcasCoche = new String[4];

        marcasCoche[0] = "Ferrari";
        marcasCoche[1] = "Porsche";
        marcasCoche[2] = "Lamborghini";
        marcasCoche[3] = "Bugatti";

        System.out.println("\n--Mi Garaje de coches de lujo--");

        // Usamos .lenght para saber el tamaño del array (en este caso 4)
        // El bucle ire desde i=0 hasta i=3
        for (int i = 0; i < marcasCoche.length; i++) {
            System.out.println("Coche en la plaza " + i + ": " + marcasCoche[i]);
        }


        // Ejercicio 3: Procesar datos (Media de notas)
        //
        // Objetivo: Usar un array de números (int) para realizar cálculos, como una suma y una media.

        int[] notasClase = new int[7];

        notasClase[0] = 8;
        notasClase[1] = 9;
        notasClase[2] = 7;
        notasClase[3] = 10;
        notasClase[4] = 1;
        notasClase[5] = 6;
        notasClase[6] = 3;

        int sumaNotas = 0;

        for (int i = 0; i < notasClase.length; i++) {
            sumaNotas = sumaNotas + notasClase[i];
            System.out.print("\nSumando " + notasClase[i] + " | Suma parcial: " + sumaNotas);
        }
        double mediaNotas = (double) sumaNotas/notasClase.length;

        System.out.println("\n-- Resultados --");
        System.out.println("Número total de notas: " + notasClase.length);
        System.out.println("Suma total de notas: " + sumaNotas);
        // Printf + %.2f para reducir número de decimales double
        System.out.printf("Media de notas: %.2f\n", mediaNotas);


        // Ejercicio 4: Rellenar un Array con Scanner (Alineación de Fútbol)
        //
        // Objetivo: Crear un array vacío y rellenarlo con datos introducidos por el usuario.
    }
}
