public class Arrays {


    public static void main(String[] args) {
        String [] palabras = new String[]{"hola", "adios", "brrr"};
        Object [] objetos = {"asd",2};
        for (int i = 0; i < palabras.length; i++) {
            System.out.printf("Elemento %s\n", palabras[i]);
        }

        for (String item:palabras){
            System.out.println(item);
        }

    }
}
