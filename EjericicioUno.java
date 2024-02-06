public class EjericicioUno {

public static void main (String [] args){

    int numUno = 5, numDos= 7  , resultado = 0 ;
    int parametro =5;

    switch (parametro){

        case 1 : resultado = numUno + numDos;
        System.out.println("El resultado de la suma es :"+ resultado);
                  break;


        case 2 : resultado = numUno - numDos ;
        System.out.println("El resultado de la resta es : " + resultado);
                  break ;


        case 3 : resultado = numUno * numDos ;
        System.out.println("El resultado de la multiplicacion es :" + resultado);
                  break;

        case 4 : resultado= numUno / numDos ;
        System.out.println("El resultado de la division es :" + resultado);
                 break;

        case 5 : resultado = numUno % numDos ;
        System.out.println("El resultado del modulo es :" + resultado);
                 break;

        default: System.out.println("Error , la opcion no existe ");
                 break ;

    }

}


}


