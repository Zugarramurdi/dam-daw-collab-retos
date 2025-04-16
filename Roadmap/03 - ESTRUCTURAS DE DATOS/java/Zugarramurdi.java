/**
 * Solucion a ejercicio #03 - ESTRUCTURAS DE DATOS
 * @author Zugarramurdi
 * @version 1.0 15/04/2025
 */

import java.util.*;

public class Zugarramurdi{
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        // Array
        System.out.println("**** Array ****");

        // Creacion de un array de enteros
        int[] array = new int[10];

        // Insercion de elementos en el array con bucle
        int cont = 1;
        for (int i = 0; i < array.length; i++) {
            array[i] = cont++;
        }

        // Insercion de elementos asignando valor
        array[0] = 10;
        array[1] = 15;
        array[2] = 20;
        array[3] = 30;

        // Actualizacion de elemento en el array
        array[3] = 25; // Cambiamos el valor de indice 3 de 30 a 25

        // "Borrar" elemento en el array
        array[3] = 0; // Cambiamos el valor de indice 3 a 0

        // Ordenacion de array
        Arrays.sort(array); // Ordenamos el array de menor a mayor, metodo sort() de la clase Arrays

        // Impresion de array
        // con bucle for each
        System.out.print("Array: ");
        for (int i : array) {
            System.out.print("["+i+"] ");
        }
        // con metodo toString() de la clase Arrays
        System.out.println("\nArray: " + Arrays.toString(array));

        // Arrays multidimensionales (2 o mas dimensiones)
        System.out.println("\n**** Arrays multidimensionales ****");

        // Creacion de un array multidimensional
        int[][] arrayMulti = new int[3][3];
        // int[][][] arrayMulti2 = new int[3][3][3]; // Array tridimensional

        // Insercion de elementos en el array multidimensional
        cont = 1;
        for (int i = 0; i < arrayMulti.length; i++) {
            for (int j = 0; j < arrayMulti[i].length; j++) {
                arrayMulti[i][j] = cont++;
            }
        }

        // Actualizacion de elemennto en el array multidimensional
        arrayMulti[1][2] = 100; // Cambiamos el valor de la fila 1, columna 2 de 6 a 100

        // "Borrar" elemento en el array multidimensional
        arrayMulti[1][2] = 0; // Cambiamos el valor de la fila 1, columna 2 a 0

        // Imprimir array multidimensional
        System.out.println("Array multidimensional: ");
        for (int i = 0; i < arrayMulti.length; i++) {
            for (int j = 0; j < arrayMulti[i].length; j++) {
                System.out.print("["+arrayMulti[i][j]+"] ");
            }
            System.out.println();
        }

        // con metodo deepToString() de la clase Arrays
        System.out.println("Array multidimensional: " + Arrays.deepToString(arrayMulti)); // Los Arrays multidimensionales son arrays de arrays, por lo que se utiliza el metodo deepToString() para pasar a toString() el contenido completo

        // ArrayList
        System.out.println("\n**** ArrayList ****");
        /* Admite elementos duplicados y nulos
         * Se puede cambiar el tamaño del ArrayList, ya que es dinamico
         * Los elementos se almacenan en el orden en el que se insertan
         * Los elementos tienen un indice, que empieza en 0
         * Acceso aleatorio a los elementos rapido, secuencial lento
         */

        // Creacion de un ArrayList de Strings
        ArrayList<String> arrayList = new ArrayList<>();

        // Insercion de elementos en el ArrayList
        arrayList.add("Melocoton");
        arrayList.add("Pera");
        arrayList.add("Manzana");
        arrayList.add("Naranja");

        // Actualizacion de elemento en el ArrayList
        arrayList.set(3, "Albaricoque"); // Cambiamos el valor de indice 3 de Naranja a Albaricoque

        // Borrar elemento en el ArrayList
        arrayList.remove(2); // Borramos el elemento de indice 2 (Manzana)

        // Ordenacion de ArrayList
        Collections.sort(arrayList); // Ordenamos el ArrayList alfabeticamente, metodo sort() de la clase Collections

        // Impresion de ArrayList con bucle for each
        System.out.print("ArrayList: ");
        for (String s : arrayList){
            System.out.print("["+s+"] ");
        }

        // Impresion de ArrayList con metodo toString()
        System.out.println("\nArrayList: " + arrayList); // El metodo toString() de la clase ArrayList devuelve el contenido del ArrayList entre corchetes y separado por comas, y no es necesario usar el metodo toString() para imprimirlo, ya que el metodo print() lo llama automaticamente


        /* Metodos interesantes de ArrayList
         * -- arraylist.add(elemento) --> Inserta un elemento al final del ArrayList
         *                                devuelve true si se ha insertado correctamente
         *
         * -- arraylist.add(indice, elemento) --> Inserta un elemento en el indice indicado
         *                                        desplaza los elementos a la derecha (suman 1 al indice de los elementos a la derecha)
         *
         * -- arrayList.addAll(coleccion) --> Inserta todos los elementos de la coleccion al final del ArrayList
         *
         * -- arrayList.set(indice, elemento) --> Cambia el valor del elemento en el indice indicado
         *
         * -- arrayList.add(null) --> Inserta un elemento nulo en el ArrayList
         *
         * -- arrayList.contains(elemento) --> Devuelve true si el elemento existe en el ArrayList
         *
         * -- arrayList.get(indice) --> Devuelve el elemento en el indice indicado
         *
         * -- arrayList.indexOf(elemento) --> Devuelve el indice del elemento indicado (si hay varios elementos iguales, devuelve el primero y -1 si no existe)
         *
         * -- arrayList.lastIndexOf(elemento) --> Devuelve el indice del elemento indicado (si hay varios elementos iguales, devuelve el ultimo y -1 si no existe)
         *
         * -- arrayList.isEmpty() --> Devuelve true si el ArrayList esta vacio
         *
         * -- arrayList.size() --> Devuelve el tamaño del ArrayList (tiene en cuenta los elementos nulos)
         *
         * -- arrayList.iterator() --> Devuelve un iterador para recorrer el ArrayList
         *
         * -- arrayList.toArray() --> Devuelve un array con los elementos del ArrayList
         *
         * -- arrayList.clear() --> Borra todos los elementos del ArrayList incluido los nulos
         */

        // LinkedList
        System.out.println("\n**** LinkedList ****");

        /* Lista simplemente encadenada
         * Cada elemento tiene un puntero al siguiente elemento
         * Admite elementos duplicados y nulos
         * Se puede cambiar el tamaño del LinkedList, ya que es dinamico
         * Los elementos se almacenan en el orden en el que se insertan
         * Acceso aleatorio a los elementos lento, secuencial rapido
         */

        // Creacion de un LinkedList de Strings
        LinkedList<String> linkedList = new LinkedList<>();

        // Insercion de elementos en el LinkedList
        linkedList.add("Sandia");
        linkedList.add("Pomelo");
        linkedList.add("Cereza");
        linkedList.add("Breva");

        // Actualizacion de elemento en el LinkedList
        linkedList.set(1, "Limon"); // Cambiamos el valor de indice 1 de Pomelo a Limon

        // Borrar elemento en el LinkedList
        linkedList.remove(2); // Borramos el elemento de indice 2 (Cereza)

        // Ordenacion de LinkedList
        Collections.sort(linkedList); // Ordenamos el LinkedList alfabeticamente, metodo sort() de la clase Collections

        // Impresion de LinkedList con bucle for each
        System.out.print("LinkedList: ");
        for (String s : linkedList){
            System.out.print("["+s+"] ");
        }

        // Impresion de LinkedList con metodo toString()
        System.out.println("\nLinkedList: " + linkedList);


        /*
         * Metodos similares al de ArrayList, incorporando algunos metodos especificos de LinkedList
         *
         * -- linkedList.addFirst(elemento) --> Inserta un elemento al principio del LinkedList
         *
         * -- linkedList.addLast(elemento) --> Inserta un elemento al final del LinkedList
         *
         * -- linkedList.peekFirst() --> Devuelve el primer elemento del LinkedList (sin borrarlo)
         *
         * -- linkedList.peekLast() --> Devuelve el ultimo elemento del LinkedList (sin borrarlo)
         *
         * -- linkedList.pollFirst() --> Devuelve el primer elemento del LinkedList (borrandolo) y desplaza el resto de elementos
         *
         * -- linkedList.pollLast() --> Devuelve el ultimo elemento del LinkedList (borrandolo)
         *
         * -- linkedList.push(elemento) --> Inserta un elemento al principio del LinkedList, desplaza el resto, tipo stack
         *
         * -- linkedList.pop() --> Extrae el primer elemento del LinkedList (borrandolo), desplaza el resto, tipo stack
         */

        // HashSet

        System.out.println("\n**** HashSet ****");
        /* No admite elementos duplicados
         *
         */

        // Creacion de un HashSet de Strings
        HashSet<String> hashSet = new HashSet<>();

        // Insercion de elementos en el HashSet
        hashSet.add("Manzana");
        hashSet.add("Pera");
        hashSet.add("Granada");
        hashSet.add("Platano");

        // Insercion de elemento duplicado
        hashSet.add("Manzana"); // No se inserta, ya que el elemento ya existe en el HashSet

        // Actualizacion de elemento en el HashSet
        // No se puede actualizar un elemento en el HashSet, ya que no tiene un indice, pero se puede borrar y volver a insertar

        // Borrar elemento en el HashSet
        hashSet.remove("Platano"); // Borramos el elemento Platano

        // Ordenacion de HashSet
        // No se puede ordenar un HashSet, ya que no tiene un orden definido, pero se puede convertir a un ArrayList y luego ordenar el ArrayList

        // Impresion de HashSet con bucle for each
        System.out.print("HashSet: ");
        for (String s : hashSet){
            System.out.print("["+s+"] ");
        }

        // Impresion de HashSet con metodo toString()
        System.out.println("\nHashSet: " + hashSet);

        /*
         * Los metodos de HashSet son similares a los de ArrayList, pero no tienen metodos para acceder a los elementos por indice
         */

        // HashMap
        System.out.println("\n**** HashMap ****");
        /* Almacena pares clave-valor
         * No admite claves duplicadas
         * Admite valores duplicados
         * Las claves no tienen un orden definido, pero los valores si tienen un orden definido
         * Se puede cambiar el tamaño del HashMap, ya que es dinamico
         */

        // Creacion de un HashMap de Strings y enteros
        HashMap<Integer, String> hashMap = new HashMap<>();

        // Insercion de elementos en el HashMap
        hashMap.put(1, "Manzana");
        hashMap.put(2, "Pera");
        hashMap.put(3, "Granada");
        hashMap.put(4, "Platano");
        hashMap.put(5, "Melon");

        // Actualizacion de elemento en el HashMap
        hashMap.put(3, "Cereza"); // Cambiamos el valor de la clave 3 de Granada a Cereza

        // Borrar elemento en el HashMap
        hashMap.remove(4); // Borramos el elemento de clave 4 (Platano)

        // Imprimir HashMap con bucle for each
        System.out.print("HashMap: ");
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()){ // entrySet() devuelve un conjunto de pares clave-valor
            System.out.print("["+entry.getKey()+": "+entry.getValue()+"] "); // getKey() devuelve la clave y getValue() devuelve el valor
        }

        // Impresion de HashMap con metodo toString()
        System.out.println("\nHashMap: " + hashMap);

        /* Metodos interesantes de HashMap
         *
         * -- hashMap.put(clave, valor) --> Inserta un elemento en el HashMap
         *                                  Si la clave ya existe, actualiza el valor
         *
         * -- hashMap.containsKey(clave) --> Devuelve true si la clave existe en el HashMap
         *
         * -- hashMap.containsValue(valor) --> Devuelve true si el valor existe en el HashMap
         *
         * -- hashMap.get(clave) --> Devuelve el valor de la clave indicada
         *
         * -- hasMap.keySet() --> Devuelve un conjunto con las claves del HashMap
         *
         * -- hashMap.values() --> Devuelve una coleccion con los valores del HashMap
         *
         * -- hashMap.entrySet() --> Devuelve un conjunto con los pares clave-valor del HashMap
         *
         * -- hashMap.isEmpty() --> Devuelve true si el HashMap esta vacio
         */

       // Ejercicio Extra

        HashMap<String, Integer> miAgenda = new HashMap<>();
        menu(miAgenda);
        scanner.close();


    }
    // AGENDA
    // Menu
    public static void menu(HashMap<String, Integer> map){
        int opcion;
        System.out.println("\n**** AGENDA DE CONTACTOS ****");
        System.out.println("\t1. BUSQUEDA");
        System.out.println("\t2. INSERCION");
        System.out.println("\t3. ACTUALIZACION");
        System.out.println("\t4. BORRADO");
        System.out.println("\t5. SALIR");
        System.out.print("Elige una opcion [1-5]: ");

        opcion = opcionValida(1,5);
        agenda(map, opcion);

    }

    public static void agenda(HashMap<String, Integer> map, int opcion){
        switch (opcion){
            case 1:
                busquedaAgenda(map);
                break;
            case 2:
                insercionAgenda(map);
                break;
            case 3:
                actualizacionAgenda(map);
                break;
            case 4:
                borradoAgenda(map);
                break;
            case 5:
                System.out.println("Saliendo de la agenda...");
                break;
        }
    }

    // Busqueda
    public static void busquedaAgenda(HashMap<String, Integer> map){
        int opcion = 0;
        String nombre;
        while (opcion !=3){
            System.out.println("\n**** BUSQUEDA ****");
            System.out.println("\t1. VER TODOS");
            System.out.println("\t2. BUSCAR POR NOMBRE");
            System.out.println("\t3. VOLVER");
            System.out.print("Elige una opcion [1-3]: ");

            opcion = opcionValida(1,5);

            switch (opcion){
                case 1:
                    System.out.println(map);
                    break;
                case 2:
                    System.out.println("Introduce el nombre del contacto: ");
                    nombre = scanner.next();
                    if (map.containsKey(nombre)){
                        System.out.println("El contacto [" + nombre + "] tiene el numero: " + map.get(nombre));
                    }else{
                        System.out.println("El contacto " + nombre + " no existe en la agenda");
                    }
                    break;
                case 3:
                    menu(map);
            }
        }
    }

    // Insercion
    public static void insercionAgenda(HashMap<String, Integer> map){
        String nombre;
        int telefono;
        System.out.println("\n**** INSERCION ****");
        System.out.print("Introduce el nombre del contacto: ");
        nombre = scanner.next();
        System.out.print("Introduce el telefono del contacto: ");
        telefono = numeroValido();

        map.put(nombre, telefono);
        menu(map);
    }

    // Actualizacion
    public static void actualizacionAgenda(HashMap<String, Integer> map){
        String nombre;
        int telefono;
        System.out.println("\n**** ACTUALIZACION ****");
        System.out.print("Introduce el nombre del contacto: ");
        nombre = scanner.next();
        if (map.containsKey(nombre)) {
            System.out.print("Introduce el nuevo telefono del contacto: ");
            telefono = numeroValido();
            map.put(nombre, telefono);
        }else{
            System.out.println("El contacto " + nombre + " no existe en la agenda");
        }
        menu(map);
    }

    // Borrado
    public static void borradoAgenda(HashMap<String, Integer> map){
        String nombre;
        System.out.println("\n**** BORRADO ****");
        System.out.print("Introduce el nombre del contacto: ");
        nombre = scanner.next();
        if (map.containsKey(nombre)) {
            map.remove(nombre);
            System.out.println("El contacto " + nombre + " ha sido borrado de la agenda");
        }else{
            System.out.println("El contacto " + nombre + " no existe en la agenda");
        }
        menu(map);
    }

    // Comprobar si el numero es valido
    public static int numeroValido(){
        while (true){
            try{
                int numero = scanner.nextInt();
                if (Integer.toString(numero).length() >=9){
                    return numero;
                }else{
                    System.out.println("El numero de telefono debe tener al menos 9 digitos");
                }
            }catch (InputMismatchException e){
                System.out.println("El numero de telefono invalido");
                scanner.next(); // Limpiar el buffer
            }
        }
    }

    // Validador de opcion
    public static int opcionValida(int min, int max){
        while (true){
            try{
                int opcion = scanner.nextInt();
                if (opcion >= min && opcion <= max){
                    return opcion;
                }else{
                    System.out.println("La opcion debe estar entre " + min + " y " + max);
                }
            }catch (InputMismatchException e){
                System.out.println("Opcion invalida, ingresa un numero entre [" + min + " y " + max+"]");
                scanner.next(); // Limpiar el buffer
            }
        }
    }

}