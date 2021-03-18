package Ejercicios_java;
import java.sql.SQLOutput;
import java.util.Scanner;
//Pide pañabras por teclado, comparalas, di si son iguales y si no lo son, muestra sus diferencias.
public class Punto_12 {
    public static void main(String[] args){
        Scanner EnterData = new Scanner(System.in);
        String texto1, texto2;

        System.out.println("Ingresa un texto, por favor.");
        texto1 = EnterData.nextLine();
        System.out.println("Ingresa un segundo Texto");
        texto2 = EnterData.nextLine();

        if(texto1.equals(texto2)){
            System.out.println("El texto1: " + texto1 + " es igual al texto2: " + texto2);
        }else {
            System.out.println("El texto '" + texto1 + " cuanta con " + texto1.length() + " caracteres, a diferencia de el texto '" + texto2 + "' el cual tiene " + texto2.length() + "caracteres");
        }
    }
}
