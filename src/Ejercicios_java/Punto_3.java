package Ejercicios_java;
import java.util.Scanner;
//App que cálcula el área de un circulo.//
public class Punto_3 {
    public static void main(String[] args){
        Scanner EnterData = new Scanner(System.in);

        double PI = 3.14;
        System.out.println("Si quieres conocer el área de un Circulo\nPrimero ingresa cuál quieres que sea su radio ");
        double radio = EnterData.nextDouble();
        double area = PI * (Math.pow(radio,2));
        System.out.println("El área del circulo es de: " + area);
    }
}
