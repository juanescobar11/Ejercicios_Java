package Ejercicios_java;
import java.util.Scanner;
//Pedir numero por teclado y a partir del mismo mostrar todos de 2 en 2 hasta 1.000
public class Punto_14 {
    public static void main(String[] args) {
        Scanner EnterData = new Scanner(System.in);

        System.out.println("Ingresa un número");
        int num;

        for(num = EnterData.nextInt(); num <= 1000; num += 2){

            System.out.print(num + ", ");
        }
    }
}
