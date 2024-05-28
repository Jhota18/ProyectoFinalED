import java.util.LinkedList;
import java.util.Scanner;

public class Principal{

    public static void main(String[] args) {   

        Scanner sc = new Scanner(System.in);
        LinkedList<TABLETA_GRAFICA> lista_tableta = new LinkedList<>();
        LinkedList<COMPUTADOR_PORTATIL> lista_computador = new LinkedList<>();
        LinkedList<ESTUDIANTE_DISENO> lista_diseño = new LinkedList<>();
        LinkedList<ESTUDIANTE_INGENIERIA> lista_Ingenieria = new LinkedList<>();
        validar_entrada val = new validar_entrada();
        Exportacion exp = new Exportacion();
        LLAMADA_TC tc = new LLAMADA_TC();
        llamada_ID id = new llamada_ID();
        menu me = new menu();
        importar imp=new importar();

        int A = 0;   ///variable donde se va almacenar la respuesta del menu crear objeto
        int B=0;
        String filePath="";
        
        do{
            System.out.println();
            System.out.println("****************************************************");
            System.out.println("*          Escoger objeto que vas a crear          *");
            System.out.println("****************************************************");
            System.out.println("* 1. Crear estudiante de Ingenieria                *");
            System.out.println("* 2. Crear estudiante de diseño                    *");
            System.out.println("* 3. Crear computador portatil                     *");
            System.out.println("* 4. Crear tableta digital                         *");
            System.out.println("* 5. Importar lista                                *");
            System.out.println("* 6. Exportar lista                                *");
            System.out.println("* 7. Siguiente menu                                *");
            System.out.println("* 8. Salir del programa                            *");
            System.out.println("****************************************************");
            
            A = val.obtenerOpcionValida(sc, 1, 8);

            switch (A) {
                case 1:
                    lista_Ingenieria = id.ingeniero(lista_Ingenieria);
                    break;
                case 2:
                    lista_diseño = id.diseño(lista_diseño);
                    break;
                case 3:
                    lista_computador = tc.computador(lista_computador);
                    break;
                case 4:
                    lista_tableta = tc.tableta(lista_tableta);
                    break;
                case 5:
                    System.out.println();
                    System.out.println("****************************************************");
                    System.out.println("*          Escoge la lista a importar              *");
                    System.out.println("****************************************************");
                    System.out.println("* 1. Estudiantes de ingenieria                     *");
                    System.out.println("* 2. Estudiantes de diseño                         *");
                    System.out.println("* 3. Computadores portatiles                       *");
                    System.out.println("* 4. Tabletas digitales                            *");
                    System.out.println("* 5. Inventario                                    *");
                    System.out.println("* 6. Regresar al menu anterior                     *");
                    System.out.println("****************************************************");
                    B = val.obtenerOpcionValida(sc, 1, 6);
                    switch (B) {
                        case 1:
                            filePath=imp.agregarArchivo();
                            lista_Ingenieria=imp.importarEstudianteIn(filePath);
                            break;
                        case 2:
                            filePath=imp.agregarArchivo();
                            lista_diseño=imp.importarEstudiante(filePath);
                            break;
                        case 3:
                            filePath=imp.agregarArchivo();
                            lista_computador=imp.importarComputador(filePath);
                            break;
                        case 4:
                            filePath=imp.agregarArchivo();
                            lista_tableta=imp.importarTableta(filePath);
                            break;
                        case 5:
                            System.out.println("Pendiente por realizar");
                            break;
                        case 6:
                            A=0;
                            break;               
                        
                    }
                    
                    for (ESTUDIANTE_DISENO estudiante_DISENO : lista_diseño) {
                    System.out.println(estudiante_DISENO);
                    }
                    break;
                case 6:
                    System.out.println();
                    System.out.println("****************************************************");
                    System.out.println("*          Escoge la lista a exportar         *");
                    System.out.println("****************************************************");
                    System.out.println("* 1. Estudiantes de ingenieria                     *");
                    System.out.println("* 2. Estudiantes de diseño                         *");
                    System.out.println("* 3. Computadores portatiles                       *");
                    System.out.println("* 4. Tabletas digitales                            *");
                    System.out.println("* 5. Inventario                                    *");
                    System.out.println("* 6. Regresar al menu anterior                     *");
                    System.out.println("****************************************************");
                    B = val.obtenerOpcionValida(sc, 1, 6);
                    switch (B) {
                        case 1:
                            exp.exportarIngeniero(lista_Ingenieria);
                            break;
                        case 2:
                            exp.exportarDiseño(lista_diseño);
                            break;
                        case 3:
                            exp.exportarComputador(lista_computador);
                            break;
                        case 4:
                            exp.exportarTableta(lista_tableta);
                            break;
                        case 5:

                            break;
                        case 6:
                            A=0;
                            break;               
                        
                    }
                    break;
                case 7:
                    me.MenuPrincipal(lista_computador, lista_tableta);
                    break;
                case 8:
                    System.out.println();
                    System.out.println("Saliendo...........");
                    System.out.println();
                    break;    
            }
        }while(A != 8);
        
        sc.close();
    }

}