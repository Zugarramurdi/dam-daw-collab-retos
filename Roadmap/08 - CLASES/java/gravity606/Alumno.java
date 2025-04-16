
/*------------------
 * #08 CLASES
 * @author gravity606
 * @version 1.0
 * @date 2025-04-16
 *-------------------
 */

/*
 *CARACTERÍSTICAS DE UNA CLASE:
 *-------------------------------------------------------------
 *
 *Elemento clave de la programación orientada a objetos
 *
 *Molde que permite construir objetos
 *
 *Representa entidades del mundo real
 *
 *Posee atributos y métodos
 *
 *No utilizable directamente sino mediante instancias a objetos
 *
 *Ejemplos: Coche, Persona, Documento, Producto…
 *
 *El nombre empieza siempre por mayúscula y es singular
 *
 *-------------------------------------------------------------
 */

//Clase

public class Alumno {

//Atributos de la clase

    int id;
    String nombre;
    String apellido;
    double calificacion;

    /*
     *CONSTRUCTORES:
     *--------------------------------------------------------------------
     *
     *Funciones especiales dentro de las clases que permiten crear objetos
     *
     *Pueden recibir datos y parámetros
     *
     *Se llaman siempre igual que la clase a la que pertenecen
     *
     *No devuelven valores
     *
     *Generalmente, hay dos tipos: vacíos o con todos los parámetros
     *
     *--------------------------------------------------------------------
     */

//Constructor vacío

    public Alumno() {
    }

//Constructor con parámetros

    public Alumno(int id, String nombre, String apellido, double calificacion) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.calificacion = calificacion;
    }

    /*
     *GETTERS Y SETTERS:
     *------------------------------------------------------------------
     *
     *Getter: Permite recuperar un valor de una instancia
     *
     *Setter: Permite asignar un valor a un valor vacío de una instancia
     *
     *Importante para cumplir la condición de encapsulamiento
     *
     *------------------------------------------------------------------
     */

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    /*
     *MÉTODOS:
     *-----------------------------------------------------------------------------
     *
     *Acción contenida en una clase que define su comportamiento
     *
     *Se llaman métodos en diseño y programación, y operaciones en el análisis
     *
     *Pueden tener valores de entrada (parámetros) y de salida (valores de retorno)
     *
     *Pueden devolver un valor (función) o no (procedimiento)
     *
     *-----------------------------------------------------------------------------
     */

    public void mostrarNombre(){
        System.out.println("Soy un alumno y me llamo " + this.nombre + " " + this.apellido);
    }

    public void saberAprobado(double calificacion){
        if(calificacion >= 5){
            System.out.println("He aprobado la asignatura.");
        }
        else{
            System.out.println("He suspendido la asignatura.");
        }
    }
}