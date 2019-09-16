public class Entrada {


    public static void main(String[] args) {
        boolean salida;
        int nota = 5;

        switch (nota) {
            case 1:
                salida = true;
                break;
            case 2:
                salida = true;

                break;
            case 3:
                salida = true;

                break;
            case 4:
                salida = true;

                break;
            case 5:
                salida = false;
                break;

            default:
                salida = true;


        }
        System.out.println("El valor de salida es :" + salida);
    }

}
