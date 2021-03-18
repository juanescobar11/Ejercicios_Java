package Ejercicios_java;

//Clase persona con atributos, constructores y metodos
public class Punto_16_Persona {
    public static final int BAJOPESO = -1;
    public static final int PESOIDEAL = 0;
    public static final int SOBREPESO = 1;
    private final static char DEFINIRSEXO = 'H';

    private String nombre;
    private int edad;
    private String DNI;
    private char sexo;
    private double peso;
    private double altura;

    public Punto_16_Persona() {
        this("", 0, DEFINIRSEXO, 0, 0);
    }

    public Punto_16_Persona(String nombre, int edad, char sexo) {
        this(nombre, edad, sexo, 0, 0);
    }

    public Punto_16_Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        crearDni();
        this.sexo = sexo;
        verificarSexo();
    }

    private void verificarSexo() {

        if(sexo != 'H' && sexo != 'M') {
            this.sexo = DEFINIRSEXO;
        }
    }

    private void crearDni() {
        final int divisor = 23;

        int numDNI = ((int) Math.floor(Math.random() * (100000000 - 10000000) + 10000000));
        int res = numDNI - (numDNI / divisor * divisor);

        char letraDNI = generaLetraDNI(res);

        DNI = Integer.toString(numDNI) + letraDNI;
    }

    private char generaLetraDNI(int res) {
        char letras[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y',
                'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z',
                'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        return letras[res];
    }

    public void establecerNombre(String nombre) {
        this.nombre = nombre;
    }

    public void establecerEdad(int edad) {
        this.edad = edad;
    }

    public void establecerSexo(char sexo) {
        this.sexo = sexo;
    }

    public void establecerPeso(double peso) {
        this.peso = peso;
    }

    public void establecerAltura(double altura) {
        this.altura = altura;
    }

    public int calcularIMC() {
        double pesoActual = peso / (Math.pow(altura, 2));

        if (pesoActual >= 20 && pesoActual <= 25) {
            return PESOIDEAL;
        } else if (pesoActual < 20) {
            return BAJOPESO;
        } else {
            return SOBREPESO;
        }
    }

    public boolean mayorDeEdad() {
        boolean mayor = false;
        if (edad >= 18) {
            mayor = true;
        }
        return mayor;
    }

    public String toString() {
        String sexo;
        if (this.sexo == 'H') {
            sexo = "hombre";
        } else {
            sexo = "mujer";
        }
        return "Informacion de la persona:\n" + "Nombre: " + nombre + "\n" + "Sexo: " + sexo + "\n" + "Edad: " + edad + " años\n" + "DNI: " + DNI + "\n" + "Peso: " + peso + " kg\n" + "Altura: " + altura + " metros\n";
    }

}
