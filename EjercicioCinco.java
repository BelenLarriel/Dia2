import java.util.Scanner;

public class EjercicioCinco {

    public static void main (String args []) {


        Scanner in = new Scanner(System.in);
        int numero = 0;

        System.out.print("Ingresa un numero");
        numero = in.nextInt();


        if (numero %2  == 0) {
            System.out.print("Es divisible entre 2  ");


        } else {

           System.out.println("No es divisible entre 2 ");
        }

    }


}
