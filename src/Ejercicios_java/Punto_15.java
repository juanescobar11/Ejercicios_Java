package Ejercicios_java;
import java.util.Scanner;
//menu de opciones
public class Punto_15 {
    public static void main(String[] args) {
        Scanner EnterData = new Scanner(System.in);

        System.out.println("***************************\n**GESTIÓN CINEMATOGRAFICA**\n***************************");
        String Menu = new String("1-NUEVO ACTOR\n2-BUSCAR ACTOR\n3-ELIMINAR ACTOR\n4-MODIFICAR ACTOR\n5-VER TODOS LOS ACTORES\n6-VER PELICULAS DE LOS ACTORES\n7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES\n8-SALIR");
        System.out.println(Menu);
        int eleccion = EnterData.nextInt();

        switch(eleccion){
            case 1:
                    do{
                        System.out.println(Menu + "\n");
                        eleccion = EnterData.nextInt();
                    }while(eleccion >=1 && eleccion <=7);
                break;
            case 2:
                do{
                    System.out.println(Menu + "\n");
                    eleccion = EnterData.nextInt();
                }while(eleccion >= 1 && eleccion <=7);
                break;
            case 3:
                do{
                    System.out.println(Menu + "\n");
                    eleccion = EnterData.nextInt();
                }while(eleccion >= 1 && eleccion <=7);
                break;
            case 4:
                do{
                    System.out.println(Menu + "\n");
                    eleccion = EnterData.nextInt();
                }while(eleccion >= 1 && eleccion <=7);
                break;
            case 5:
                do{
                    System.out.println(Menu + "\n");
                    eleccion = EnterData.nextInt();
                }while(eleccion >= 1 && eleccion <=7);
                break;
            case 6:
                do{
                    System.out.println(Menu + "\n");
                    eleccion = EnterData.nextInt();
                }while(eleccion >= 1 && eleccion <=7);
                break;
            case 7:
                do{
                    System.out.println(Menu + "\n");
                    eleccion = EnterData.nextInt();
                }while(eleccion >= 1 && eleccion <=7);
                break;
            case 8:
                System.out.println("***CERRANDO PROGRAMA***");
                break;
            default:
                System.out.println("OPCIÓN INCORRECTA");
                System.out.println(Menu + "\n");
                eleccion = EnterData.nextInt();
        }
    }
}
