package com.roshka.bootcamp;


import java.util.Stack;

public class BalanceadorParentesis {
    public static Boolean isBalanced(final String cadena) {

        Stack<Character> pila = new Stack<>();

       for( char caracter : cadena.toCharArray() ){

          if (caracter == ')'  &&   !pila.isEmpty() && pila.pop() != '(') {
              return false;
          } else if (caracter == ']' && !pila.isEmpty() && pila.pop() != '[') {
              return false;
          } else if (caracter == '}' && !pila.isEmpty() && pila.pop() != '{') {
              return false;







          }



       }





     return pila.isEmpty();



    }





}
