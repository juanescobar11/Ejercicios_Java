package Ejercicios_java;

public class Punto_17_Lavadora extends Punto_17_Electrodomestico{

    private final static int CARGA_DEF=5;

    private int carga;

    public int obtenerCarga() {
        return carga;
    }

    public double precioFinal(){
        double plus=super.precioFinal();

        if (carga>30){
            plus+=50;
        }

        return plus;
    }

    public Punto_17_Lavadora(){
        this(PRECIO_BASE_DEF, PESO_DEF, CONSUMO_ENERGETICO_DEF, COLOR_DEF, CARGA_DEF);
    }

    public Punto_17_Lavadora(double precioBase, double peso){
        this(precioBase, peso, CONSUMO_ENERGETICO_DEF, COLOR_DEF, CARGA_DEF);
    }

    public Punto_17_Lavadora(double precioBase, double peso, char consumoEnergetico, String color, int carga){
        super(precioBase,peso, consumoEnergetico,color);
        this.carga=carga;
    }
}
