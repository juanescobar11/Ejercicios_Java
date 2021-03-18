package Ejercicios_java;
import java.util.Scanner;
//App que dice cuál es el mayor de dos números, por datos obtenidos por el teclado//
public class Punto_2 {
    public static void main(String[] args){

        Scanner EnterData = new Scanner(System.in);

        int num1, num2;
        System.out.println("Por favor, ingresa un valor entero.");
        num1 = EnterData.nextInt();
        //
        System.out.println("Por favor ingresa un segundo valor entero.");
        num2 = EnterData.nextInt();
        //
        if(num1 > num2){
            System.out.println("El número: " + num1 + " es mayor al número: " + num2);
        }else if(num1 < num2){
            System.out.println("El número: " + num2 + " es mayor al número: " + num1);
        }else if(num1 == num2){
            System.out.println("El número: " + num1 + " es igual al número: " + num2);
        }
    }
}
