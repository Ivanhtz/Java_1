package proyecto1;

public class Functions {

    public static void main(String[] args) {

        double precioFinal = precioConIVA(5.5);

        System.out.println(precioFinal);

    }

    static double precioConIVA(double precio){
        return precio * 1.21;
    }

}
