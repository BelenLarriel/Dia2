import java.util.Scanner;

public class EjercicioDiez {

    public static void main (String args[]) {


        Scanner entrada = new Scanner(System.in);
        String  semana ="";

    System.out.println("Ingrese un dia de la semana");
    semana =entrada.nextLine();

    switch (semana) {
        case "lunes":
        case "martes":
        case "miércoles":
        case "jueves":
        case "viernes":
            System.out.println("Es dia laboral " );
            break;

        default:
            System.out.println("No es un dia laboral");




    }





    }

}
