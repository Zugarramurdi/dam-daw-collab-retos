import java.util.Arrays;
import java.util.HashSet;


/**
 * Clase kabalera82 donde realizaremos una seríe de operaciones con cadenas de caracteres
 * @author kabalera82
 * @version 1.0
 * @date 12/04/2025
 */


 public class kabalera82 {

    
 
        /* La clase String incluye métodos para examinar caracteres individuales de la secuencia,
         * comparar cadenas, buscar cadenas, extraer subcadenas y crear una copia de una cadena.
         * Una cadena representa una cadena en formato UTF-16,
         *  donde los caracteres suplementarios se representan mediante pares sustitutos
         *  Los valores de índice se refieren a unidades de código char,
         *  por lo que un carácter suplementario ocupa dos posiciones en una cadena.
         * 
         * fuente: https://docs.oracle.com/javase/8/docs/api/java/lang/String.html
         * Class String
        

        String cadena = "Hola Mundo";

        // 1. charAt(int index): Accede al carácter en el índice especificado.
        System.out.println("charAt(0): " + cadena.charAt(0)); // H

        // 2. codePointAt(int index): Devuelve el código Unicode del carácter en el índice.
        System.out.println("codePointAt(0): " + cadena.codePointAt(0)); // 72 (Unicode de 'H')

        // 3. codePointBefore(int index): Devuelve el código Unicode del carácter antes del índice.
        System.out.println("codePointBefore(1): " + cadena.codePointBefore(1)); // 72 (Unicode de 'H')

        // 4. codePointCount(int beginIndex, int endIndex): Cuenta los puntos de código Unicode.
        System.out.println("codePointCount(0, 4): " + cadena.codePointCount(0, 4)); // 4

        // 5. compareTo(String anotherString): Compara lexicográficamente.
        System.out.println("compareTo('Hola'): " + cadena.compareTo("Hola")); // > 0 (porque "Hola Mundo" > "Hola")

        // 6. compareToIgnoreCase(String str): Compara ignorando mayúsculas/minúsculas.
        System.out.println("compareToIgnoreCase('hola mundo'): " + cadena.compareToIgnoreCase("hola mundo")); // 0

        // 7. concat(String str): Concatena cadenas.
        System.out.println("concat('!!!'): " + cadena.concat("!!!")); // Hola Mundo!!!

        // 8. contains(CharSequence s): Verifica si contiene una secuencia.
        System.out.println("contains('Mundo'): " + cadena.contains("Mundo")); // true

        // 9. contentEquals(CharSequence cs): Compara con una secuencia de caracteres.
        System.out.println("contentEquals('Hola Mundo'): " + cadena.contentEquals("Hola Mundo")); // true

        // 10. endsWith(String suffix): Verifica si termina con un sufijo.
        System.out.println("endsWith('Mundo'): " + cadena.endsWith("Mundo")); // true

        // 11. equals(Object anObject): Compara si dos cadenas son iguales.
        System.out.println("equals('Hola Mundo'): " + cadena.equals("Hola Mundo")); // true

        // 12. equalsIgnoreCase(String anotherString): Compara ignorando mayúsculas/minúsculas.
        System.out.println("equalsIgnoreCase('hola mundo'): " + cadena.equalsIgnoreCase("hola mundo")); // true

        // 13. getBytes(): Convierte la cadena en un array de bytes.
        byte[] bytes = cadena.getBytes(StandardCharsets.UTF_8);
        System.out.println("getBytes(): " + new String(bytes)); // Hola Mundo

        // 14. getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin): Copia caracteres.
        char[] chars = new char[5];
        cadena.getChars(0, 5, chars, 0);
        System.out.println("getChars(): " + new String(chars)); // Hola 

        // 15. indexOf(int ch): Encuentra la primera aparición de un carácter.
        System.out.println("indexOf('M'): " + cadena.indexOf('M')); // 5

        // 16. lastIndexOf(int ch): Encuentra la última aparición de un carácter.
        System.out.println("lastIndexOf('o'): " + cadena.lastIndexOf('o')); // 9
        
        // 17. isEmpty(): Verifica si la cadena está vacía.
        System.out.println("isEmpty(): " + cadena.isEmpty()); // false

        // 18. length(): Devuelve la longitud de la cadena.
        System.out.println("length(): " + cadena.length()); // 10

        // 19. matches(String regex): Verifica si coincide con una expresión regular.
        System.out.println("matches('.*Mundo.*'): " + cadena.matches(".*Mundo.*")); // true

        // 20. replace(char oldChar, char newChar): Reemplaza caracteres.
        System.out.println("replace('o', 'a'): " + cadena.replace('o', 'a')); // Hala Munda

        // 21. split(String regex): Divide la cadena en un array.
        String[] partes = cadena.split(" ");
        System.out.println("split(' '): " + String.join(", ", partes)); // Hola, Mundo

        // 22. startsWith(String prefix): Verifica si comienza con un prefijo.
        System.out.println("startsWith('Hola'): " + cadena.startsWith("Hola")); // true

        // 23. substring(int beginIndex, int endIndex): Extrae una subcadena.
        System.out.println("substring(0, 4): " + cadena.substring(0, 4)); // Hola

        // 24. toCharArray(): Convierte la cadena en un array de caracteres.
        char[] array = cadena.toCharArray();
        System.out.println("toCharArray(): " + new String(array)); // Hola Mundo

        // 25. toLowerCase(): Convierte a minúsculas.
        System.out.println("toLowerCase(): " + cadena.toLowerCase()); // hola mundo

        // 26. toUpperCase(): Convierte a mayúsculas.
        System.out.println("toUpperCase(): " + cadena.toUpperCase()); // HOLA MUNDO

        // 27. trim(): Elimina espacios en blanco al inicio y al final.
        System.out.println("trim(): " + "   Hola Mundo   ".trim()); // Hola Mundo

        // 28. hashCode(): Devuelve el código hash de la cadena.
        System.out.println("hashCode(): " + cadena.hashCode()); // Código hash de "Hola Mundo"

        // 29. valueOf(int i): Convierte un entero a cadena.
        System.out.println("valueOf(123): " + String.valueOf(123)); // 123

        // 30. format(String format, Object... args): Formatea la cadena.
        System.out.println("format('Hola %s', 'Mundo'): " + String.format("Hola %s", "Mundo")); // Hola Mundo

        // 31. regionMatches(int toffset, String other, int ooffset, int len): Compara regiones.
        System.out.println("regionMatches(0, 'Hola Mundo', 0, 4): " + cadena.regionMatches(0, "Hola Mundo", 0, 4)); // true

        // 32. replaceAll(String regex, String replacement): Reemplaza todas las coincidencias.
        System.out.println("replaceAll('o', 'a'): " + cadena.replaceAll("o", "a")); // Hala Munda

        // 33. replaceFirst(String regex, String replacement): Reemplaza la primera coincidencia.
        System.out.println("replaceFirst('o', 'a'): " + cadena.replaceFirst("o", "a")); // Hala Mundo

        // 34. split(String regex, int limit): Divide la cadena en un array con límite.
        String[] partesLimitadas = cadena.split(" ", 1);
        System.out.println("split(' ', 1): " + String.join(", ", partesLimitadas)); // Hola Mundo

        // 35. toString(): Devuelve la cadena misma.
        System.out.println("toString(): " + cadena.toString()); // Hola Mundo
    
        ****************************************************************************************
         * Ejercicio extra: Crear una función que reciba dos cadenas y devuelva la cadena más larga.
         */
    
         public static void main(String[] args) {
            String cadena1 = "Roma";
            String cadena2 = "Amor";
    
            realizarComprobaciones(cadena1, cadena2);
        }
        //Creamos una función que reciba dos cadenas
        private static void realizarComprobaciones(String cadena1, String cadena2) {
            // Eliminar espacios y convertir a minúsculas
            cadena1 = cadena1.replace(" ", "").toLowerCase();
            cadena2 = cadena2.replace(" ", "").toLowerCase();
        
            // Comprobación de anagramas
            if (sonAnagramas(cadena1, cadena2)) {
                System.out.println("Las palabras son anagramas.");
            } else {
                System.out.println("Las palabras no son anagramas.");
            }
        
            // Comprobación de isogramas
            if (esIsograma(cadena1) && esIsograma(cadena2)) {
                System.out.println("Ambas palabras son isogramas.");
            } else {
                System.out.println("Alguna de las palabras no es un isograma.");
            }
        
            // Comprobación de palíndromos
            if (esPalindromo(cadena1, cadena2)) {
                System.out.println("Las palabras son palíndromos entre sí.");
            } else {
                System.out.println("Las palabras no son palíndromos entre sí.");
            }
        }
        
        private static boolean sonAnagramas(String cadena1, String cadena2) {
            if (cadena1.length() != cadena2.length()) {
                return false;
            }
            char[] arr1 = cadena1.toCharArray();
            char[] arr2 = cadena2.toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            return Arrays.equals(arr1, arr2);
        }
        
        private static boolean esIsograma(String palabra) {
            HashSet<Character> letras = new HashSet<>();
            for (char c : palabra.toCharArray()) {
                if (letras.contains(c)) {
                    return false; // Si la letra ya está en el conjunto, no es un isograma
                }
                letras.add(c);
            }
            return true; // Todas las letras son únicas
        }
        
        private static boolean esPalindromo(String cadena1, String cadena2) {
            if (cadena1.length() != cadena2.length()) {
                return false;
            }
            for (int i = 0; i < cadena1.length(); i++) {
                if (cadena1.charAt(i) != cadena2.charAt(cadena2.length() - 1 - i)) {
                    return false; // Si hay una diferencia, no son palíndromos
                }
            }
            return true; // Si no hay diferencias, son palíndromos
        }
    }