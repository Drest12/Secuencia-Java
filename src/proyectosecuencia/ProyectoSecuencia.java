
package proyectosecuencia;


public class ProyectoSecuencia {

     public static void main(String[] args) {
        // Prueba incrementando el prefijo "AB"
        String resultado = incrementarPrefijo("0001");
        System.out.println("Prefijo incrementado: " + resultado);
    }

    // Método para incrementar un prefijo de letras
    private static String incrementarPrefijo(String prefix) {
        char[] chars = prefix.toCharArray();
        for (int i = chars.length - 1; i >= 0; i--) {
            if (chars[i] == 'Z') {
                chars[i] = 'A'; // Si es Z, lo convierto a A
            } else {
                chars[i]++; // Incremento el carácter
                break; // Rompo el bucle si no es Z
            }
        }
        return new String(chars);
    }
}
