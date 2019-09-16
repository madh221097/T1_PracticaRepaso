package EjerciciosClase;

public class Prueba {
    public static void main(String[] args) {

        Object[][] multidimensional = {{"primera", "posición"}, {"segunda", "posición"}, {"tercera", "posición"}};
        int i = 0;
        for (Object[] temp : multidimensional) {
            System.out.println("El array que se está evaluando es: " + temp.toString());
            for (Object tempDos : temp) {
                System.out.println("El valor es: " + tempDos);
            }

        }
    }
}

