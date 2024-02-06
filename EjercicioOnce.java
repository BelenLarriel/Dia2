import java.util.Random;

public  class EjercicioOnce {
    public static void main(String args[]){

        int  [] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(11)-5;
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

      int mayornum = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > mayornum) {
                mayornum=array[i];
            }
        }
        System.out.println("El mayor numero de array es :" +mayornum);
}
}

