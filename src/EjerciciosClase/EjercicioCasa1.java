package EjerciciosClase;

import java.sql.Array;
import java.util.*;
import java.util.ArrayList;

public class EjercicioCasa1 {
    public static void main(String[] args) {

        int[] arrayAleatorios = new int[50];
        ArrayList<Integer> arrayList =  new ArrayList<Integer>(50);
        int almacenar;
        int opcion;

        do {
            System.out.println("Elegir una opción:");
            System.out.println("Opcion 1: Rellenar");
            System.out.println("Opcion 2: Listar");
            System.out.println("Opcion 3: Ordenar");
            System.out.println("Opcion 4: Vaciar");
            System.out.println("Opcion 5: Salir");
            Scanner scanner = new Scanner(System.in);
            opcion = scanner.nextInt();
            switch (opcion) {


                case 1:
                    for (int i =0 ; i<50;i++) {
                        almacenar = ((int) (Math.random() * (200 - 1) + 1));
                        arrayList.add(almacenar);
                        //System.out.println(arrayList.get(i));
                    }

                    System.out.println("Operación completada");


                    break;
                case 2:
                    for (int i=0;i<50;i++){
                        System.out.println("Elemento:" + (i+1) + " "+ arrayList.get(i));
                    }
                    break;
                case 3:
                      for (int i = 0; i<arrayAleatorios.length;i++){
                          Collections.sort(arrayList);
                          System.out.println("Elemento:" + (i+1) + " "+ arrayList.get(i));
                }
                    break;

                case 4:

                    for (int i = 0; i<50;i++){
                       arrayList.clear();
                        System.out.println(arrayList);
                    }
                    break;
                case 5:
                    System.out.println("Saliendo de la aplicacion...");
                    break;
                default:
                    System.out.println("Opción Inválida ,porfavor elige una opción del menú");
                    break;
            }
        }while (opcion!=5);




    }
}
