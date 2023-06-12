package RetoIV;

import java.util.Scanner;

public class Hexagono extends Figura {
    //Atributos
    private double perimetro;
    private double apotema;

    //Método constructor vacío 
    public Hexagono(){

    }
    //Método constructor con parámetros 
    public Hexagono(double perimetro, double apotema) {
        this.perimetro = perimetro;
        this.apotema = apotema;
    }

    //Métodos accesores
    public double getPerimetro() {
        return perimetro;
    }
    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
    public double getApotema() {
        return apotema;
    }
    public void setApotema(double apotema) {
        this.apotema = apotema;
    }

    //Uso de los métodos abstractos 
    //Solicitar datos
    public void solicitarDatos(){
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el perimetro del hexagono");
        perimetro=leer.nextDouble();
        System.out.println("Ingrese el apotema del hexagono");
        apotema=leer.nextDouble();
    }
    
    public void calcularArea(){
        double area;
        area=(perimetro*apotema)/2;
        System.out.println("El perimetro del hexagono es: "+perimetro+" El apotema del hexagono es: "+apotema+" El area es: "+area);

    }
}
