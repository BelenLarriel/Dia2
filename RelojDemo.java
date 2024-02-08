package DiaTres;

import java.util.Scanner;

public class RelojDemo {
    public static void main(String[] args) {


    Scanner entrada = new Scanner(System.in);

   System.out.println("Introduzca el tiempo porfavor");
   int horas= entrada.nextInt();


   System.out.println("Introduzca los minutos porfavor  (0-59): ");
   int minutos = entrada.nextInt();

   System.out.println("Introduzca los segundos porfavor (0-59): ");
   int segundos = entrada.nextInt();


     Reloj valores = new Reloj(horas,minutos,segundos);

        System.out.println("Valores iniciales: " + valores.toString());

        valores.tick();
        System.out.println("Después de un tick: " + valores.toString());

        valores.tickDecrement();
        System.out.println("Después de un tick decrementado: " + valores.toString());







}
}