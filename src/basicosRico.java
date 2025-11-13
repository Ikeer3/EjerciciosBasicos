public class basicosRico {
    public static void main(String[] args) {
        // Arrays
        // Ejercicio 1: Declarar, Inicializar y Acceder (El Equipo Pokémon)
        //
        // Objetivo: Crear un array para un equipo Pokémon (tamaño 6), asignar Pokémon a algunas "ranuras"
        // y acceder a ellas.

        String[] nombresPokemon = new String[5];

        nombresPokemon[0] = "Charmander";
        nombresPokemon[2] = "Charmeleon";
        nombresPokemon[4] = "Charizard";

        System.out.println("El pokémon en la primera ranura es: " + nombresPokemon[0]);
        System.out.println("El pokémon en la tercera ranura es: " + nombresPokemon[2]);
        System.out.println("El pokémon en la quinta ranura es: " + nombresPokemon[4]);

    }
}
