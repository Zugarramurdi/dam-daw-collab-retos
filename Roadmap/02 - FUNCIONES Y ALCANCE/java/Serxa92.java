/**
 * #02 FUNCIONES Y ALCANCE
 */

public class Serxa92 {

    // Funcion sin parametros ni retorno
    public static void funcion1() {
        System.out.println("\nEsta es una funcion sin parametros ni retorno\n");
    }

    // Funcion con un parametro y sin retorno

    public static void funcion2(String mensaje) {
        System.out.println("\nEsta es una funcion con un parametro: " + mensaje + "\n");
    }

    // Funcion con dos parametros y sin retorno

    public static void funcion3(int numero1, int numero2) {
        System.out.println("\nEsta es una funcion con dos parametros: " + numero1 + " y " + numero2);
        System.out.println("Se pueden realizar operaciones con los parametros: " + (numero1 + numero2) + "\n");
    }

    // Funcion con dos parametros y retorno

    public static int funcion4(int numero1, int numero2) {
        return numero1 + numero2;
    }

    // Funcion dentro de funcion

    /*
     * En Java no es posible declarar funciones dentro de otras funciones, pero sí
     * es posible invocar funciones desde dentro de otra función.
     * Ejemplo de función ya proporcionada por el lenguaje:
     */

    public static void MathRandom() {
        System.out.println("\nEsta es una funcion ya creada por el lenguaje: " + Math.random() + "\n");
    }

    //* - Pon a prueba el concepto de variable LOCAL y GLOBAL.

    // Variable global
    static int numeroGlobal = 0;
    public static void variableGlobal() {
        System.out.println("\nEsta es una variable global: " + numeroGlobal + "\n");
    }

    // Variable local

    public static void variableLocal() {
        int numeroLocal = 0;
        System.out.println("\nEsta es una variable local: " + numeroLocal + "\n");
    }


    // Ejercicio Extra

    public static int extra(String mensaje1, String mensaje2) {
        int contador = 0;
        System.out.println("\n\tEjercicio Extra\n");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(mensaje1 + " " + mensaje2);
            } else if (i % 3 == 0) {
                System.out.println(mensaje1);
            } else if (i % 5 == 0) {
                System.out.println(mensaje2);
            } else {
                System.out.println(i);
                contador++;
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        // Llamada a las funciones
        funcion1();
        funcion2("Hola Mundo");
        funcion3(5, 10);
        System.out.println("\nEsta es una funcion con dos parametros y retorno: " + funcion4(5, 10) + "\n");
        MathRandom();
        System.out.println("\nEl numero de veces que se ha impreso el numero es: " + extra("Hola", "Mundo") + "\n");

    }
}
