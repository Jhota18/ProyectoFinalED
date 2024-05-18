import java.util.LinkedList;
import java.util.Scanner;

public class LLAMADA_TC {

    public LinkedList<TABLETA_GRAFICA> tableta(LinkedList<TABLETA_GRAFICA> lista_tableta){
        
        int continuar = 0;
        int indexx =1;
        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println("Registra los atributos de la tableta grafica:");
        System.out.println();
        do{
            TABLETA_GRAFICA objeto1 = new TABLETA_GRAFICA(null, null, indexx, continuar, null, indexx);

            System.out.println();
            System.out.println("Tableta grafica: #"+ indexx++);
            System.out.println();
            System.out.print("Ingresa el serial: ");
            while (true) {
                try {
                    objeto1.setSerial(sc.next());
                    break;
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage() + " Por favor, inténtalo de nuevo.");
                }
            }

            System.out.print("Ingresa la marca: ");
            while (true) {
                try {
                    objeto1.setMarca(sc.next());
                    break;
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage() + " Por favor, inténtalo de nuevo.");
                }
            }

            System.out.print("Ingresa el tamaño en pulgadas: ");
            while (!sc.hasNextFloat()) {
                System.out.println("Entrada inválida. Intentalo de nuevo, el tamaño solo recibe numeros.");
                sc.next();
            }
            objeto1.setTamaño(sc.nextFloat());

            System.out.print("Ingresa el precio: ");
            while (!sc.hasNextFloat()) {
                System.out.println("Entrada inválida. Intentelo de nuevo, el precio solo recibe numeros.");
                sc.next();
            }
            objeto1.setPrecio(sc.nextFloat());

            System.out.print("Almacenamiento:" +"\n"+ "1. [256 GB]"+"\n"+ "2. [512 GB]" +"\n"+ "3. [1 TB]" +"\n");
            System.out.print("RESPUESTA: ");
            int respuesta=0;

            do {
                if (sc.hasNextInt()) { // Verificar si la entrada es un número entero
                    respuesta = sc.nextInt();
                    if (respuesta >= 1 && respuesta <= 3) { // Verificar si la respuesta está dentro del rango válido
                        break; // Salir del bucle si la respuesta es válida
                    } else {
                        System.out.println("Entrada inválida. Inténtelo de nuevo.");
                    }
                } else {
                    System.out.println("Entrada inválida. Inténtelo de nuevo.");
                    sc.next(); // Limpiar la entrada incorrecta del scanner
                }
            } while (true);
            switch (respuesta) {
                case 1:
                    objeto1.setAlmacenamiento("256 GB");
                    break;
                case 2:
                    objeto1.setAlmacenamiento("512 GB");
                    break;
                case 3:
                    objeto1.setAlmacenamiento("1 TB");
                    break;
            }
        
            

            System.out.print("Ingresa el peso en kg: ");
            while (!sc.hasNextFloat()) {
                System.out.println("Entrada inválida. Intentelo de nuevo, el peso solo recibe numeros.");
                sc.next();
            }
            objeto1.setPeso(sc.nextFloat());
            lista_tableta.add(objeto1);

            System.out.println();
            System.out.print("¿Deseas agregar otra tableta grafica? [1.Si - 2.No]   RESPUESTA: ");
            continuar = sc.nextInt();

        }while(continuar != 2);

        return (lista_tableta);
    }



    public LinkedList<COMPUTADOR_PORTATIL> computador(LinkedList<COMPUTADOR_PORTATIL> lista_computador){
        
        int continuar = 0;
        int indexx =1;
        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println("Registra los atributos del computador portatil:");
        System.out.println();
        do{
            COMPUTADOR_PORTATIL objeto2 = new COMPUTADOR_PORTATIL(null, null, continuar, indexx, null, null);

            System.out.println();
            System.out.println("Computador portatil: #"+ indexx++);
            System.out.println();
            System.out.print("Ingresa el serial: ");
            while (true) {
                try {
                    objeto2.setSerial(sc.next());
                    break;
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage() + " Por favor, inténtalo de nuevo.");
                }
            }

            System.out.print("Ingresa la marca: ");
            while (true) {
                try {
                    objeto2.setMarca(sc.next());
                    break;
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage() + " Por favor, inténtalo de nuevo.");
                }
            }

            System.out.print("Ingresa el tamaño en pulgadas: ");
            while (!sc.hasNextFloat()) {
                System.out.println("Entrada inválida. Intentalo de nuevo, el tamaño solo recibe numeros.");
                sc.next();
            }
            objeto2.setTamaño(sc.nextFloat());

            System.out.print("Ingresa el precio: ");
            while (!sc.hasNextFloat()) {
                System.out.println("Entrada inválida. Intentelo de nuevo, el precio solo recibe numeros.");
                sc.next();
            }
            objeto2.setPrecio(sc.nextFloat());

            System.out.print("Sistema operativo:" +"\n"+ "1. Windows 7"+"\n"+ "2. Windows 10" +"\n"+ "3. Windows 11" +"\n");
            System.out.print("RESPUESTA: ");
            int respuestA=0;

            do {
                if (sc.hasNextInt()) { // Verificar si la entrada es un número entero
                    respuestA = sc.nextInt();
                    if (respuestA >= 1 && respuestA <= 3) { // Verificar si la respuesta está dentro del rango válido
                        break; // Salir del bucle si la respuesta es válida
                    } else {
                        System.out.println("Entrada inválida. Inténtelo de nuevo.");
                    }
                } else {
                    System.out.println("Entrada inválida. Inténtelo de nuevo.");
                    sc.next(); // Limpiar la entrada incorrecta del scanner
                }
            } while (true);
            switch (respuestA) {
                case 1:
                    objeto2.setSistemaOperativo("Windows 7");
                    break;
                case 2:
                    objeto2.setSistemaOperativo("Windows 10");
                    break;
                case 3:
                    objeto2.setSistemaOperativo("Windows 11");
                    break;
            }

            System.out.print("Procesador:" +"\n"+ "1. AMD Ryzen"+"\n"+"2. Intel® Core™ i5." +"\n");
            System.out.print("RESPUESTA: ");
            int Respuesta=0;

            do {
                if (sc.hasNextInt()) { // Verificar si la entrada es un número entero
                    Respuesta = sc.nextInt();
                    if (Respuesta >= 1 && Respuesta <= 2) { // Verificar si la respuesta está dentro del rango válido
                        break; // Salir del bucle si la respuesta es válida
                    } else {
                        System.out.println("Entrada inválida. Inténtelo de nuevo.");
                    }
                } else {
                    System.out.println("Entrada inválida. Inténtelo de nuevo.");
                    sc.next(); // Limpiar la entrada incorrecta del scanner
                }
            } while (true);
            switch (Respuesta) {
                case 1:
                    objeto2.setProcesador("AMD Ryzen");;
                    break;
                case 2:
                    objeto2.setProcesador("Intel® Core™ i5");
                    break;
            }
            lista_computador.add(objeto2);

            System.out.println();
            System.out.print("¿Deseas agregar otro computador portatil? [1.Si - 2.No]   RESPUESTA: ");
            continuar = sc.nextInt();

        }while(continuar != 2);

        return (lista_computador);
    }
}
