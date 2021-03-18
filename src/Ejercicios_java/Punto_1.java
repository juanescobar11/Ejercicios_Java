package Ejercicios_java;
//App que dice cuál es el mayor de dos números//
public class Punto_1 {
    public static void main(String[] args){

        int num1 = 10, num2 = 5;

        if(num1 > num2){
            System.out.println("el número: " + num1+ " es mayor que el número: " + num2);
        }else if(num1 < num2){
            System.out.println("El número: " + num2 + " es mayor que el número: " +num1);
        }else if(num1 == num2){
            System.out.println("El número: " + num1 + " es igual que el número: " + num2);
        }
    }
}
