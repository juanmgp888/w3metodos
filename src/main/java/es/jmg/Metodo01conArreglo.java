package es.jmg;

/*
www.w3resource.com
UNA VERSIÓN ALTERNATIVA CON 1000 NÚMEROS
1. Write a Java method to find the smallest number among 1000 numbers.
Test Data:

 */

 public class Metodo01conArreglo {

    // Método para calcular el menor de un conjunto de números
    public static int calcularMenorNumEntre10(int[] numeros) {
        // Suponemos que el primer número es el menor inicialmente
        int menorNum = numeros[0];
        
        // Recorremos todos los números y actualizamos el menor encontrado
        // COMENZAMOS EL CICLO POR 1 !!!
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] < menorNum) {
                menorNum = numeros[i];  // Actualizamos el menor número
            }
        }
        
        return menorNum;
    }

    public static void main(String[] args) {
        // Creamos un arreglo con 100 números
        int[] numeros = new int[10];

        // Llenamos el arreglo con valores aleatorios entre 1 y 1000
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 1000) + 1;  // Números entre 1 y 1000
        }

        // Llamamos al método para calcular el menor número
        int menorNum = Metodo01conArreglo.calcularMenorNumEntre10(numeros);
        // Para mostrar el contenido de un arreglo, lo recorremos con un ciclo/bucle.
        for (int i : numeros) {
            System.out.println(i);    
        }
        
        // Imprimimos el resultado
        System.out.println("El menor número es: " + menorNum);
    }
}


/* Clase Math *** java.lang.Math ** public static int max(int a,
                      int b)
 * Math.max
 * Math.min
 * 
*/

