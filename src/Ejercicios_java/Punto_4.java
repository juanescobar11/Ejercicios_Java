package Ejercicios_java;
import java.util.Scanner;
//ingresa el precio de un producto y devuelve el valor sumado del IVA
public class Punto_4 {
    public static void main(String[] args){
        Scanner EnterData = new Scanner(System.in);

        double precioProducto, IVA = 21, IvaDelProducto, valorTotal;
        System.out.println("Ingresa el precio de un producto, del cual quieras saber cuánto cuesta con IVA");
        precioProducto = EnterData.nextDouble();
        IvaDelProducto = ((IVA * precioProducto) / 100);
        valorTotal = (precioProducto + IvaDelProducto);
        System.out.println("El valor del producto que ingresaste, sumado con el Iva cuesta: " + valorTotal + "$");
    }
}
