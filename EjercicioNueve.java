import java.util.Scanner;
public class EjercicioNueve {
    public static void main(String args[]){


        Scanner entrada =new Scanner(System.in);

        String password = "";

        System.out.println("**********************************************");
        System.out.println("*Bienvenido al sistema *");
        System.out.println("**********************************************");
        System.out.println("");
        System.out.println("");





         for (int i=1 ; i<= 3 ; i++ ) {

             System.out.print("Por favor introduzca el password");
             password = entrada.nextLine();

             if (password.equals("123456")) {
                 System.out.println("Correcto! ");




                 }else{
                     System.out.println("Fallaste jajajjj!!");




             }

         }

    }
}
