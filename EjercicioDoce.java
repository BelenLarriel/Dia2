import java.util.Random;

public class EjercicioDoce {

    public static void main(String args[]){

        int  [] array = new int[100];



        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(61)-30;
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        int  [] numeromasRepetidos = new int[61];

        int maxinumero= 0 , numrepetidos = 0;

        for(int numero : array){
            int indice = numero + 30;
            numeromasRepetidos [indice]++;

            if(numeromasRepetidos[indice] > maxinumero){
                maxinumero = numeromasRepetidos[indice];
                numrepetidos= numero;




            }


        }

        System.out.println("El elemento  que más se repite : " + numrepetidos + " (repetido " + maxinumero + " veces)");
    }

}
