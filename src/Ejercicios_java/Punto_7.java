package Ejercicios_java;
import java.util.Scanner;
//ingresa un número por teclado, y si este es menor que cero, vuelve a pedir un número. hazlo con do while
public class Punto_7 {
    public static void main(String[] args){
        Scanner EnterData = new Scanner (System.in);

        int num;
        do{
            System.out.println("Introduce un numero mayor que 0");
            num = EnterData.nextInt();
        }while(num<=0);

        System.out.println("el número: " + num + " es mayor que cero.");
    }
}
