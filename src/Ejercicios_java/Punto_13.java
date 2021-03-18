package Ejercicios_java;
import java.time.LocalDateTime;
//consulta fecha y hora
public class Punto_13 {
    public static void main(String[] args){

        LocalDateTime FechaYHora = LocalDateTime.now();

        System.out.println("la fecha y hora actual es: " + FechaYHora);
    }
}
