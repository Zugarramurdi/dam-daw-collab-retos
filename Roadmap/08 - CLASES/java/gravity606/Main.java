
/*------------------
 * #08 CLASES
 * @author gravity606
 * @version 1.0
 * @date 2025-04-16
 *-------------------
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*------------------------------------------------------------------------------
         *Creamos un primer objeto (alu1) usando el constructor vacío de la clase Alumno
         * -----------------------------------------------------------------------------
         */

        Alumno alu1 = new Alumno();

        /*----------------------------------------------------------------------------------------
         *Creamos un segundo objeto (alu2) usando el constructor con parámetros de la clase Alumno
         *----------------------------------------------------------------------------------------
         */

        Alumno alu2 = new Alumno(5, "Guillermo", "Fuster", 7);

        /*--------------------------------------------------------------------------------
         *Mostrar e imprimir los datos del objeto alu2 usando los correspondientes getters
         *--------------------------------------------------------------------------------
         */

        System.out.println("La id del alumno 2 es: " + alu2.getId());
        System.out.println("El alumno 2 se llama: " + alu2.getNombre() + " " + alu2.getApellido());
        System.out.println("-----------------------------------------");

        /*------------------------------------------------------------------------------------------
         *Le damos valores al objeto alu1 que hemos creado vacío usando los correspondientes setters
         *------------------------------------------------------------------------------------------
         */

        alu1.setId(8);
        alu1.setNombre("Sonia");
        alu1.setApellido("Borowiecka");
        alu1.setCalificacion(9);

        /*---------------------------------------------------------------
         *Mostramos e imprimimos los datos que acabamos de agregar a alu1
         *---------------------------------------------------------------
         */

        System.out.println("La id del alumno 1 es: " + alu1.getId());
        System.out.println("El alumno 2 se llama: " + alu1.getNombre() + " " + alu1.getApellido());
        System.out.println("-----------------------------------------");

        /*-------------------------------------------------------------------------------------------
         *Modificamos un valor que ya estaba previamente establecido usando el setter correspondiente
         *al valor que queremos modificar (En este caso, Id de alu2)
         *-------------------------------------------------------------------------------------------
         */

        alu2.setId(35);

        /*------------------------------------------------------------------------------
         *Comprobamos que el cambio ha funcionado mostrando nuevamente los datos de alu2
         *------------------------------------------------------------------------------
         */

        System.out.println("La id del alumno 2 es: " + alu2.getId());
        System.out.println("El alumno 2 se llama: " + alu2.getNombre() + " " + alu2.getApellido());
        System.out.println("-----------------------------------------");


        /*------------------------------------------------------------------------------------------
         *Hacemos que alu1 utilice sus dos métodos provenientes de la clase Alumno:
         *
         *En primer lugar, usamos su metodo mostrarNombre
         *
         *En segundo lugar, usamos su metodo saberAprobado usando un getter relacionado con su valor
         *calificación para realizar la comprobación requerida por el metodo
         *------------------------------------------------------------------------------------------
         */

        alu1.mostrarNombre();
        alu1.saberAprobado(alu1.getCalificacion());

        /*-------------------------------------------------------------------------------------------
         *Hacemos que alu2 utilice sus dos métodos provenientes de la clase Alumno:
         *
         *En primer lugar, usamos su metodo mostrarNombre
         *
         *En segundo lugar, usamos su metodo saberAprobado usando una nueva variable cuyo valor
         *solicitaremos por pantalla al usuario para realizar la comprobación requerida por el metodo
         *-------------------------------------------------------------------------------------------
         */

        alu2.mostrarNombre();
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce la note del alumno: " + alu2.getNombre() + " " + alu2.getApellido());
        double calificacionAlu2 = teclado.nextDouble();
        alu2.saberAprobado(calificacionAlu2);

    }
}
