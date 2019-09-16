package EjerciciosClase;

import java.util.ArrayList;
import java.util.Scanner;

public class EjercicioCasa2 {
    public static void main(String[] args) {

        int random, contador = 1, numeroIntroducido,intentos = 0;
        String sn,nombre;
        Scanner scanner = null;
        ArrayList<String> record = new ArrayList();

       // int record[][] = new int[5][5];

        random = (int) (Math.random() * (10 - 1 + 1) + 1);
        System.out.println(random);

        do {
            System.out.println("Introduzca un número entre el 1 y el 100");
            scanner = new Scanner(System.in);
            numeroIntroducido = scanner.nextInt();

            if (numeroIntroducido != random) {
               //System.out.println("INTENTO: "+intentos);
                System.out.println("¿Quiere volver a intentarlo (si/no) ?");
                sn=scanner.next();
                if (sn.equals("si")){
                    intentos+= contador;
                }else ;
            }
            else {
                System.out.println("NUMERO DE FALLOS: "+intentos);
                System.out.println("Introduzca su nombre: ");
                nombre=scanner.next();
                scanner.nextLine();
                record.add(nombre+":"+intentos);
                for (String temp:record){
                    System.out.println(temp);
                }



            }

        } while (numeroIntroducido != random);


    }


}

