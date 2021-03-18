package Ejercicios_java;
import java.util.Scanner;
//App que dice la longitud de un string pasado por teclado, y cuantas vocales tiene.
public class Punto_11 {
    public static void main(String[] args) {
        Scanner EnterData = new Scanner(System.in);
        int contadorVocales = 0;

        System.out.println("Por favor, ingresa un texo.");
        String text = EnterData.nextLine();
        System.out.println("La longitud de el texto '" + text + "' es de: " + text.length() + " caracteres");
        //
        for (int i = 0; i < text.length(); i++) {
            if ((text.charAt(i) == 'a') || (text.charAt(i) == 'e') || (text.charAt(i) == 'i') || (text.charAt(i) == 'o') || (text.charAt(i) == 'u')) {
                contadorVocales++;
            }
        }
        System.out.println("La cantidad de vocales de la palabra: " + text + " es de: " + contadorVocales + " vocales.");
    }
}

