public class EjerciciCatorce {
    public static void main(String args[]) {


        String nElementos = " 1234";
        int[] array = cadenaConvertir(nElementos);

        for (int valor : array) {
            System.out.println(valor + " , ");
        }
    }





    }

    private static int[] cadenaConvertir(String nElementos) {
        int[] array = new int[nElementos.length()];

        for (int i = 0; i < nElementos.length(); i++) {
            char caracter = nElementos.charAt(i);
            int valorNumerico = Character.getNumericValue(caracter);
            array[i] = valorNumerico;
        }

        return array;
    }



