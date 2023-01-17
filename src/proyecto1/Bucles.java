package proyecto1;

public class Bucles {

    public static void main(String[] args) {

        String[] nombres = {"Iván", "Esther", "Alexandra"};
        String nombresFinal = "";

        for (String nombre : nombres) {

            nombresFinal += nombre + " ";
        }

        System.out.println(nombresFinal);
    }
}
