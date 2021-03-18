package Ejercicios_java;
//Cambia los caracteres de una variable String
public class Punto_9 {
    public static void main(String[] args){

        String text = new String("La sonrisa sera la mejor arma contra la tristeza");
        System.out.println("El String original es: " + text);
        System.out.println("El String despues de reemplazar las 'a' por 'e' es: " + text.replace("a","e"));
        System.out.println("El String luego de reemplazar 'Sonrisa' por 'comida': " + text.replace("sonrisa","comida"));
    }
}
