package es.jmg;

/*
www.w3resource.com
1. Write a Java method to find the smallest number among three numbers.
Test Data:
Input the first number: 25
Input the Second number: 37
Input the third number: 29
Expected Output:

The smallest value is 25.0
 */

public class Metodo01 {
    public int menorNum;
    public static int calcularMenorNum(int num1, int num2, int num3) {
        return Math.min(num1,(Math.min(num2, num3))); 
        // En la declaración del método ya le indicamos el tipo de valor de retorno: int
    }
    public static void main(String[] args) {
        
        int menorNum = Metodo01.calcularMenorNum(8,2,3);
    }

}

/* Clase Math *** java.lang.Math ** public static int max(int a,
                      int b)
 * Math.max
 * Math.min
 * 
*/

