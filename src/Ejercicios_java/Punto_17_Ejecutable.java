package Ejercicios_java;

public class Punto_17_Ejecutable {
    public static void main(String[] args) {

        Punto_17_Electrodomestico listaElectrodomesticos[]=new Punto_17_Electrodomestico[10];

        listaElectrodomesticos[0]=new Punto_17_Electrodomestico(50, 10);
        listaElectrodomesticos[1]=new Punto_17_Television(250, 70);
        listaElectrodomesticos[2]=new Punto_17_Lavadora(150, 30);
        listaElectrodomesticos[3]=new Punto_17_Television(200, 60, 'C', "naranja", 30, true);
        listaElectrodomesticos[4]=new Punto_17_Television(500, 80, 'E', "negro", 42, false);
        listaElectrodomesticos[5]=new Punto_17_Lavadora(300, 40, 'Z', "blanco", 40);
        listaElectrodomesticos[6]=new Punto_17_Electrodomestico(600, 20, 'D', "gris");
        listaElectrodomesticos[7]=new Punto_17_Electrodomestico(200, 60, 'C', "Verde");
        listaElectrodomesticos[8]=new Punto_17_Electrodomestico();
        listaElectrodomesticos[9]=new Punto_17_Lavadora(400, 100, 'A', "verde", 15);

        double sumaElectrodomesticos=0;
        double sumaLavadoras=0;
        double sumaTelevisiones=0;

        for(int i=0;i<listaElectrodomesticos.length;i++){

            if(listaElectrodomesticos[i] instanceof Punto_17_Electrodomestico){
                sumaElectrodomesticos+=listaElectrodomesticos[i].precioFinal();
            }
            if(listaElectrodomesticos[i] instanceof Punto_17_Lavadora){
                sumaLavadoras+=listaElectrodomesticos[i].precioFinal();
            }
            if(listaElectrodomesticos[i] instanceof Punto_17_Television){
                sumaTelevisiones+=listaElectrodomesticos[i].precioFinal();
            }
        }
        System.out.println("La suma del precio de los electrodomesticos es de "+sumaElectrodomesticos);
        System.out.println("La suma del precio de las lavadoras es de "+sumaLavadoras);
        System.out.println("La suma del precio de las televisiones es de "+sumaTelevisiones);
    }
}