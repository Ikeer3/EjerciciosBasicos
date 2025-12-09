import java.util.Scanner;

public class salidaNocheRico {
    public static void main(String[] args) {

        // -------------------------------------------------------------------------------------------
        // 1. Saca por consola un mensaje de bienvenida “Vamos a tomar el aire. Bienvenido”.
        //
        // 2. Haz que existan las variables nivelAlcohol = 0.0, precioChupito = 3, precioCaña = 1.8,
        // precioCombinado = 8, nivelChupito = 0.25, nivelCaña =  0.1 y nivelCombinado = 0.4.
        //
        // 3. Introduce por teclado un nombre de cliente y guárdalo en una variable.
        //
        // 4. Introduce una edad de cliente y guárdalo en una variable.
        //
        // 5. Introduce una cantidad de dinero que quieres que tenga el cliente.
        //
        // 6. Muestra en un único mensaje por consola lo siguiente: “El cliente de nombre: nombreCliente
        // con edad edadCliente tiene x euros”.
        //
        // 7. Haz que el cliente entre en la primera discoteca, para poder entrar, el programa tiene que
        // comprobar que es mayor de edad, si no lo es, tendrá que salir un mensaje por consola denegando
        // la entrada. Si es mayor de edad deberemos comprobar que su nivel de alcoholemia no supere
        // el valor 1.2, en caso de superarlo, se le denegará la entrada mostrando un mensaje que diga que
        // no está en condiciones de entrar.

        // 8. Si el cliente consigue entrar por cumplir todas las condiciones podrá beber lo que quiera,
        // para beber algo, mostraremos por consola qué bebe y tendremos que, reducir el dinero del cliente
        // en función del precio de lo que bebe e incrementar el nivelAlcohol que tiene. Esto podremos
        // repetirlo hasta que el cliente se quede sin dinero (su dinero no puede ser negativo) o el
        // nivelAlcohol supere un 2, en este caso, se mostrará por consola que el cliente se marcha en
        // ambulancia por irresponsable.

        Scanner lector = new Scanner(System.in);
        double dineroCliente = 20.0;

        System.out.println("\n---VAMOS A TOMAR EL AIRE. BIENVENIDO!!---");

        double nivelAlcohol = 0.0;
        int precioChupito = 3;
        double precioCanha = 1.8;
        int precioCombinado = 8;
        double nivelChupito = 0.25;
        double nivelCanha = 0.1;
        double nivelCombinado = 0.4;

        System.out.print("\nComo te llamas?: ");
        String nombreCliente = lector.next();

        System.out.print("Y cuántos años tienes?: ");
        int edadCliente = lector.nextInt();

        System.out.println("\nEl cliente de nombre: " + nombreCliente + ", con edad: " + edadCliente + " años"
                + ", tiene: " + dineroCliente + "$");

        while (edadCliente >= 18) {
            if (nivelAlcohol > 1.2) {
                System.out.println("\nVas etílico perdido, NO puedes entrar!!");
                break;
            } else {
                while (dineroCliente > 0 || nivelAlcohol < 2) {
                    System.out.print("\nBuenas " + nombreCliente + ", qué quieres beber?");
                    System.out.print("\nTenemos chupitos, cañas o combinados: ");
                    String bebidaCliente = lector.next();
                    if (bebidaCliente.equalsIgnoreCase("chupitos")) {
                        System.out.println("\nAquí tienes tu chupito!! De un trago!!");
                        dineroCliente = dineroCliente - precioChupito;
                        nivelAlcohol = nivelAlcohol + nivelChupito;
                        System.out.println("Te quedan " + dineroCliente + "$ y tienes un nivel de alcohol de "
                                + nivelAlcohol);
                    } else if (bebidaCliente.equalsIgnoreCase("cañas")) {
                        System.out.println("\nAquí tienes tu caña fresquita!!");
                        dineroCliente = dineroCliente - precioCanha;
                        nivelAlcohol = nivelAlcohol + nivelCanha;
                        System.out.println("Te quedan " + dineroCliente + "$ y tienes un nivel de alcohol de "
                                + nivelAlcohol);
                    } else if (bebidaCliente.equalsIgnoreCase("combinados")) {
                        System.out.println("\nAquí tienes tu combinado!! Está un poco cargado!!");
                        dineroCliente = dineroCliente - precioCombinado;
                        nivelAlcohol = nivelAlcohol + nivelCombinado;
                        System.out.println("Te quedan: " + dineroCliente + "$ y " +
                                "tienes un nivel de alcohol de: " + nivelAlcohol);
                    }
                }
                if (nivelAlcohol > 2) {
                    System.out.println("\nNo te mantienes de PIE!! Voy a llamar a una AMBULANCIA!!");
                }
                if (dineroCliente < 0) {
                    System.out.println("\nNo tienes ni un CHAVO!! Vete al cajero o MÁRCHATE!!");
                }
            }
        }
        if (edadCliente < 18) {
            System.out.println("\nNo tienes ni 18 años, vete a CASA a dormir NIÑO!!");
        }
    }
}
