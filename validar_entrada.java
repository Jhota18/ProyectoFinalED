import java.util.Scanner;

public class validar_entrada {
    
    // Método para validar la entrada del usuario
    public static int obtenerOpcionValida(Scanner sc, int min, int max) {
        int opcion;
        do {
            System.out.print("Selecciona una opción: ");
            if (sc.hasNextInt()) {
                opcion = sc.nextInt();
                if (opcion >= min && opcion <= max) {
                    break;
                } else {
                    System.out.println("Entrada inválida. Debe estar entre " + min + " y " + max + ". Inténtelo de nuevo.");
                }
            } else {
                System.out.println("Entrada inválida. Debes introducir un número entero. Inténtelo de nuevo.");
                sc.next(); // Limpiar la entrada incorrecta del scanner
            }
        } while (true);
        return opcion;
    }
    
}
