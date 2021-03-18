package Ejercicios_java;

public class Punto_17_Television extends Punto_17_Electrodomestico{

    private final static int RESOLUCION_DEF=20;
    private int resolucion;
    private boolean sintonizadorTDT;


    public double precioFinal(){

        double plus=super.precioFinal();

        if (resolucion>40){
            plus+=precioBase*0.3;
        }
        if (sintonizadorTDT){
            plus+=50;
        }

        return plus;
    }


    public Punto_17_Television(){
        this(PRECIO_BASE_DEF, PESO_DEF, CONSUMO_ENERGETICO_DEF, COLOR_DEF, RESOLUCION_DEF, false);
    }


    public Punto_17_Television(double precioBase, double peso){
        this(precioBase, peso, CONSUMO_ENERGETICO_DEF, COLOR_DEF, RESOLUCION_DEF, false);
    }


    public Punto_17_Television(double precioBase, double peso, char consumoEnergetico, String color, int resolucion, boolean sintonizadorTDT){
        super(precioBase, peso, consumoEnergetico, color);
        this.resolucion=resolucion;
        this.sintonizadorTDT=sintonizadorTDT;
    }
}
