import java.util.LinkedList;
import java.util.Scanner;

public class llamada_ID {
    public LinkedList<ESTUDIANTE_INGENIERIA> ingeniero(LinkedList<ESTUDIANTE_INGENIERIA> lista_ingenieria){
        
        int continuar = 0; ///
        int indexx =1;  /// numeracion de objeto ingeniero
        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println("Registra los atributos del estudiante de ingenieria:");
        System.out.println();
        do{
            ESTUDIANTE_INGENIERIA ing = new ESTUDIANTE_INGENIERIA(null, null, null, null, continuar, indexx, null);
            System.out.println();
            System.out.println("Estudiante de ingenieria: #"+ indexx++);
            System.out.println();
            System.out.print("Ingresa la cedula: ");
            while (true) {
                try {
                    ing.setCedula(sc.next());
                    break;
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage() + " Por favor, inténtalo de nuevo.");
                }
            }

            System.out.print("Ingresa el nombre: ");
            while (true) {
                try {
                    ing.setNombre(sc.next());
                    break;
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage() + " Por favor, inténtalo de nuevo.");
                }
            }

            System.out.print("Ingresa el apellido: ");
            while (true) {
                try {
                    ing.setApellido(sc.next());
                    break;
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage() + " Por favor, inténtalo de nuevo.");
                }
            }

            System.out.print("Ingresa el telefono: ");
            while (true) {
                try {
                    ing.setTelefono(sc.next());
                    break;
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage() + " Por favor, inténtalo de nuevo.");
                }
            }

            System.out.println("Ingresa el numero de semestre actual cursado: ");
            while (!sc.hasNextInt()) {
                System.out.println("Entrada inválida. Intentalo de nuevo,  solo debes ingresar numeros.");
                sc.next();
            }
            ing.setNumSemestre(sc.nextInt());

            System.out.println("ingresa tu promedio acumulado: ");
            while (!sc.hasNextFloat()) {
                System.out.println("Entrada inválida. Intentalo de nuevo, el promedio solo recibe numeros.");
                sc.next();
            }
            ing.setPromAcum(sc.nextFloat());

            System.out.println("Ingresa el serial: ");
            while (true) {
                try {
                    ing.setSerial(sc.next());
                    break;
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage() + " Por favor, inténtalo de nuevo.");
                }
            }

            lista_ingenieria.add(ing);

            System.out.println();
            System.out.print("¿Deseas agregar otra estudiante de ingenieria? [1.Si - 2.No]   RESPUESTA: ");
            continuar = sc.nextInt();

        }while(continuar != 2);

        return (lista_ingenieria);
    }


    public LinkedList<ESTUDIANTE_DISENO> diseño(LinkedList<ESTUDIANTE_DISENO> lista_diseño){
        
        int continuar = 0; ///
        int indexx =1;  /// numeracion de objeto ingeniero
        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println("Registra los atributos del estudiante de diseño:");
        System.out.println();
        do{
            ESTUDIANTE_DISENO dis = new ESTUDIANTE_DISENO(null, null, null, null, null, continuar, indexx);
            System.out.println();
            System.out.println("Estudiante de diseño: #"+ indexx++);
            System.out.println();
            System.out.print("Ingresa la cedula: ");
            while (true) {
                try {
                    dis.setCedula(sc.next());
                    break;
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage() + " Por favor, inténtalo de nuevo.");
                }
            }

            System.out.print("Ingresa el nombre: ");
            while (true) {
                try {
                    dis.setNombre(sc.next());
                    break;
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage() + " Por favor, inténtalo de nuevo.");
                }
            }

            System.out.print("Ingresa el apellido: ");
            while (true) {
                try {
                    dis.setApellido(sc.next());
                    break;
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage() + " Por favor, inténtalo de nuevo.");
                }
            }

            System.out.print("Ingresa el telefono: ");
            while (!sc.hasNextFloat()) {
                System.out.println("Entrada inválida. Intentalo de nuevo,  solo debes ingresar numeros.");
                sc.next();
            }
            dis.setTelefono(sc.next());

            System.out.print("Que modalidad de estudio tienes:" +"\n"+ "1. Virtual" +"\n"+ "2.Presencial" +"\n");
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
                    dis.setModalidad("Virtual");
                    break;
                case 2:
                    dis.setModalidad("Presencial");
                    break;
            }
            
            System.out.print("Cantidad de asignaturas que esta viendo: ");
            while (!sc.hasNextInt()) {
                System.out.println("Entrada inválida. Intentalo de nuevo, el tamaño solo recibe numeros.");
                sc.next();
            }
            dis.setCantAsignat(sc.nextInt());
            
            System.out.print("Ingresa un serial: ");
            while (!sc.hasNextInt()) {
                System.out.println("Entrada inválida. Intentalo de nuevo, el seiral solo recibe numeros.");
                sc.next();
            }
            dis.setSerial(sc.nextInt());

            lista_diseño.add(dis);

            System.out.println();
            System.out.print("¿Deseas agregar otro estudiante de diseño? [1.Si - 2.No]   RESPUESTA: ");
            continuar = sc.nextInt();

        }while(continuar != 2);

        return (lista_diseño);
    }
    
}
