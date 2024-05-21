import java.util.LinkedList;
import java.util.Scanner;

public class Principal{

    public static void main(String[] args) {   

        Scanner sc = new Scanner(System.in);
        LinkedList<TABLETA_GRAFICA> lista_tableta = new LinkedList<>();
        LinkedList<COMPUTADOR_PORTATIL> lista_computador = new LinkedList<>();
        validar_entrada val = new validar_entrada();
        LLAMADA_TC tc = new LLAMADA_TC();
        menu me = new menu();

        int A = 0;   ///variable donde se va almacenar la respuesta del menu crear objeto
        
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
            System.out.println("* 6. Siguiente menu                                *");
            System.out.println("* 7. Salir del programa                            *");
            System.out.println("****************************************************");
            
            A = val.obtenerOpcionValida(sc, 1, 7);

            switch (A) {
                case 1:
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    lista_computador = tc.computador(lista_computador);
                    break;
                case 4:
                    lista_tableta = tc.tableta(lista_tableta);
                    break;
                case 5:
                    
                    break;
                case 6:
                    me.MenuPrincipal();
                    break;
                case 7:
                    System.out.println();
                    System.out.println("Saliendo...........");
                    break;
            }
        }while(A != 7);
        
        sc.close();
         
        /* 
        menu me = new menu();
        me.MenuPrincipal();
        
        
        LinkedList<TABLETA_GRAFICA> lista_tableta = new LinkedList<>();
        LinkedList<COMPUTADOR_PORTATIL> lista_computador = new LinkedList<>();
        Exportacion exp = new Exportacion();
        LLAMADA_TC tc = new LLAMADA_TC();
        lista_tableta = tc.tableta(lista_tableta);
        exp.exportarTableta(lista_tableta);
        lista_computador = tc.computador(lista_computador);
        exp.exportarComputador(lista_computador); */
    }

}