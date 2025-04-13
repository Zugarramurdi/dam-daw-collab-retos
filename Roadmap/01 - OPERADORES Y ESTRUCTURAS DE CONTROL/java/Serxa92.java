/**
 * #01 OPERADORES Y ESTRUCTURAS DE CONTROL
 * 
 * @author serxa92
 */

public class Serxa92 {

    public static void main(String[] args) {
        
        // Operadores aritméticos

        //Declaración de variables
        int a = 10;
        int b = 5;
        int suma = a + b;
        int resta = a - b;
        int multiplicacion = a * b;
        int division = a / b;
        int modulo = a % b;
        
        //Sacar el resultado de las operaciones
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);
        System.out.println("Módulo: " + modulo);

        // Operadores lógicos

        //Declaración de variables
        boolean x = true;
        boolean y = false;
        boolean and = x && y;
        boolean or = x || y;
        boolean not = !x;
        
        //Sacar el resultado de las operaciones
        System.out.println("AND: " + and);
        System.out.println("OR: " + or);
        System.out.println("NOT: " + not);

        // Operadores de comparación

        //Declaración de variables
        boolean igual = (a == b);
        boolean diferente = (a != b);
        boolean mayorQue = (a > b);
        boolean menorQue = (a < b);
        boolean mayorIgualQue = (a >= b);
        boolean menorIgualQue = (a <= b);

        //Sacar el resultado de las operaciones
        System.out.println("Igual: " + igual);
        System.out.println("Diferente: " + diferente);
        System.out.println("Mayor que: " + mayorQue);
        System.out.println("Menor que: " + menorQue);
        System.out.println("Mayor o igual que: " + mayorIgualQue);
        System.out.println("Menor o igual que: " + menorIgualQue);

       
        // CONDICIONALES (if-else, switch-case)
        // Estructura if-else
        int int1 = 1;
        if (int1 == 0) {
            System.out.println("La condición int1 == 0 se cumple.");
        } else if (int1 == 1) {
            System.out.println("La condición int1 == 1 se cumple.");
        } else {
            System.out.println("Ni la condición int1 == 0 ni la condición int1 == 1 se cumplen.");
        }

        // Estructura switch-case

        int numero = 2;
        switch (numero) {
            case 1:
                System.out.println("El número es uno.");
                break;
            case 2:
                System.out.println("El número es dos.");
                break;
            case 3:
                System.out.println("El número es tres.");
                break;
            default:
                System.out.println("El número no es uno, dos ni tres.");
        }

        // ESTRUCTURAS ITERATIVAS (for, while, do-while)
        // Bucle for
        System.out.println("\nBucle for:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Iteración " + i);
        }

        // Bucle while
        System.out.println("\nBucle while:");
        int j = 0;
        while (j < 5) {
            System.out.println("Iteración " + j);
            j++;
        }

        // Bucle do-while
        System.out.println("\nBucle do-while:");
        int k = 0;
        do {
            System.out.println("Iteración " + k);
            k++;
        } while (k < 5);

        // ESTRUCTURAS DE EXCEPCIÓN (try-catch)

        // Manejo de excepciones

        System.out.println("\nManejo de excepciones:");
        try {
            int resultado = a / 0; // Esto generará una excepción de división por cero
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: División por cero.");
        }
        finally {
            System.out.println("Bloque finally ejecutado.");
        }
        // DIFICULTAD EXTRA

        System.out.println("\nNúmeros entre 10 y 55 (incluidos), pares, y que no son ni el 16 ni múltiplos de 3:");
        for (int i = 10; i <= 55; i++) {
            if (i % 2 == 0 && i != 16 && i % 3 != 0) {
                System.out.print(i + " ");
            }
        }

    }

}
