import java.util.Scanner;
public class EjercicioOcho {
    public static void  main(String args[]){

        Scanner in = new Scanner(System.in);
        int num= 0;



        do {
            System.out.println("Ingrese un numero");
            num = in.nextInt();

        }while( num < 0);
         System.out.print("Este numero si es mayor a 0  :" + num);



    }
}
