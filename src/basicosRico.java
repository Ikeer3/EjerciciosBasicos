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

    }
}
