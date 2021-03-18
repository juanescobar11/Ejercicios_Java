package Ejercicios_java;
import java.util.Scanner;
//app que nos dice si un dia de la semana se labora, independiente del día que elijamos.
public class Punto_8 {
    public static void main(String[] args){
        Scanner EnterData = new Scanner(System.in);

        System.out.println("¿Qué día de la semana quieres saber si hay que laborar?\nSeleciona 1 si quieres saber si el Lunes se labora\nSeleciona 2 si quieres saber si el Martes se labora\nSeleciona 3 si quieres saber si el Miercoles se labora\nSeleciona 4 si quieres saber si el Jueves se labora\nSeleciona 5 si quieres saber si el viernes se labora\nSeleciona 6 si quieres saber si el Sabado se labora\nSeleciona 7 si quieres saber si el Domingo se labora\n");
        int dia = EnterData.nextInt();

        switch(dia){
            case 1:
                System.out.println("Este día se labora");
                break;
            case 2:
                System.out.println("Este día se labora");
                break;
            case 3:
                System.out.println("Este día se labora");
                break;
            case 4:
                System.out.println("Este día se labora");
                break;
            case 5:
                System.out.println("Este día se labora");
                break;
            case 6:
                System.out.println("Este día no se labora");
                break;
            case 7:
                System.out.println("Este día no se labora");
                break;
        }
    }
}
