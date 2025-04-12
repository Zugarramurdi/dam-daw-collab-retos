function realizarComprobaciones(cadena1, cadena2) {
    // Eliminar espacios y convertir a minúsculas
    cadena1 = cadena1.replace(/\s+/g, "").toLowerCase();
    cadena2 = cadena2.replace(/\s+/g, "").toLowerCase();

    // Comprobación de anagramas
    if (sonAnagramas(cadena1, cadena2)) {
        console.log("Las palabras son anagramas.");
    } else {
        console.log("Las palabras no son anagramas.");
    }

    // Comprobación de isogramas
    if (esIsograma(cadena1) && esIsograma(cadena2)) {
        console.log("Ambas palabras son isogramas.");
    } else {
        console.log("Alguna de las palabras no es un isograma.");
    }

    // Comprobación de palíndromos
    if (esPalindromo(cadena1, cadena2)) {
        console.log("Las palabras son palíndromos entre sí.");
    } else {
        console.log("Las palabras no son palíndromos entre sí.");
    }
}

function sonAnagramas(cadena1, cadena2) {
    if (cadena1.length !== cadena2.length) {
        return false;
    }
    // Convertir las cadenas a arrays de caracteres, ordenarlas y compararlas
    const arr1 = cadena1.split("").sort().join("");
    const arr2 = cadena2.split("").sort().join("");
    return arr1 === arr2;
}

function esIsograma(palabra) {
    const letras = new Set();
    for (const c of palabra) {
        if (letras.has(c)) {
            return false; // Si la letra ya está en el conjunto, no es un isograma
        }
        letras.add(c);
    }
    return true; // Todas las letras son únicas
}

function esPalindromo(cadena1, cadena2) {
    if (cadena1.length !== cadena2.length) {
        return false;
    }
    for (let i = 0; i < cadena1.length; i++) {
        if (cadena1[i] !== cadena2[cadena2.length - 1 - i]) {
            return false; // Si hay una diferencia, no son palíndromos
        }
    }
    return true; // Si no hay diferencias, son palíndromos
}

// Ejemplo de uso
const cadena1 = "Roma";
const cadena2 = "Amor";
realizarComprobaciones(cadena1, cadena2);