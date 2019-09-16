package EjerciciosClase;

import java.util.Calendar;

import java.util.Scanner;

public class EjercicioClase {


    public static void main(String[] args) {
        Scanner scanner = null;

        String a, m, mes, repetir;
        boolean comprobar = false;


        scanner = new Scanner(System.in);
        System.out.println("Introduzca Nombre: ");
        m = scanner.next();
        scanner.nextLine();

        do {
            int day = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
            int month = Calendar.getInstance().get(Calendar.MONTH)+1;
            int year = Calendar.getInstance().get(Calendar.YEAR);
            int hora = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
            int min = Calendar.getInstance().get(Calendar.MINUTE);

            if (hora >= 20 && hora <= 7) {
                a = "Buenas Noches";
            } else if (hora > 7 && hora <= 14) {
                a = "Buenos Dias";

            } else {
                a = "Buenas tardes";
            }
            switch (month) {
                case 1:
                    mes = "Enero";
                    break;
                case 2:
                    mes = "Febrero";
                    break;
                case 3:
                    mes = "Marzo";
                    break;
                case 4:
                    mes = "Abril";
                    break;
                case 5:
                    mes = "Mayo";
                    break;
                case 6:
                    mes = "Junio";
                    break;
                case 7:
                    mes = "Julio";
                    break;
                case 8:
                    mes = "Agosto";
                    break;
                case 9:
                    mes = "Septiembre";
                    break;
                case 10:
                    mes = "Octubre";
                    break;
                case 11:
                    mes = "Noviembre";
                    break;
                default:
                    mes = "Diciembre";
            }

            System.out.printf("%s %s son las %d:%d del %d de %s del %d \n ", a, m, hora, min, day, mes, year);
            System.out.println("¿Quieres volver a comprobar la hora? (s/n)");
            repetir = scanner.next();
            scanner.nextLine();

            if (repetir.toLowerCase().equals("s")) {
                comprobar = true;
            } else {
                comprobar = false;
            }
        }

        while (comprobar);

        System.out.printf("Que tengas un buen día %s",m);
    }
}


