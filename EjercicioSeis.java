import java.util.Scanner;

public class EjercicioSeis {


    public static void main(String[] args) {

  int numero = 0 ;

   Scanner entrada = new Scanner(System.in);

   System.out.print("Ingresa el precio del producto ");
   numero = entrada.nextInt();

    System.out.println("El precio sin Iva es :"  + (numero - numero  / 10 ));




    }


}
