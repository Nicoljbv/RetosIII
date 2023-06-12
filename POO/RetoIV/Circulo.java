package RetoIV;

import java.util.Scanner;

public class Circulo extends Figura {

    //Atributos 
    private double radio;
    final private double pi=3.1416;

    //Método constructor vacío
    public Circulo() {
    }
    //Método constructor con parámetros 
    public Circulo(double radio) {
        super();
        this.radio = radio;
    }

    //Métodos accesores
    public double getRadio() {
        return radio;
    }
    public void setRadio(double radio) {
        this.radio = radio;
    }
    public double getPi() {
        return pi;
    }

    //Uso de los métodos abstractos
    //Solicitar datos 
    public void solicitarDatos(){
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el radio del circulo");
        radio=leer.nextDouble();
    }

    //Calcular el area
    public void calcularArea(){
        double radio2,area;
        radio2=Math.pow(radio, 2);
        area=pi*radio2;
        System.out.println("El radio del circulo es "+radio+" El area es: "+area);
    }
    
    

    
}
