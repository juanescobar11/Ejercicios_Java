package Ejercicios_java;
import java.util.Scanner;
//Ingresa texto por teclado y luego elimine los espacios que esta contenga
public class Punto_10 {
    public static void main(String[] args){
        Scanner EnterData = new Scanner(System.in);

        System.out.println("Por favor, ingresa un texto con más de una palabra (Puede ser cualquiera)");
        String text = EnterData.nextLine();
        System.out.println("El texto original quedaria así: " + text);
        System.out.println("El texto anterios sin espacios quedaria así: " + text.replace(" ",""));

    }
}
