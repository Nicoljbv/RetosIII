package RetoIV;

import java.util.Scanner;

public class Triangulo extends Figura {
    //Atributos
    private int base;
    private int altura;
    //Método constructor vacío
    public Triangulo() {
    }
    //Método constructor con parámetros
    public Triangulo(int base, int altura) {
        super();
        this.base = base;
        this.altura = altura;
    }
    //Métodos accesores
    public int getBase() {
        return base;
    }
    public void setBase(int base) {
        this.base = base;
    }
    public int getAltura() {
        return altura;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    } 

    //Uso de los métodos abstractos
    //Solicitar datos 
    public void solicitarDatos(){
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la altura del triangulo");
        altura=leer.nextInt();
        System.out.println("Ingrese la base del triangulo");
        base=leer.nextInt();
    }

    //Calcular el area
    public void calcularArea(){
        int area;
        area=(base*altura)/2;
        System.out.println("La base del triangulo es "+base+" La altura es: "+altura+" El area es: "+area);
    }
    
}
