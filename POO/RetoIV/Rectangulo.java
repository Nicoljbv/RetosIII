package RetoIV;

import java.util.Scanner;

public class Rectangulo extends Figura{

    //Atributos 
    private int base;
    private int altura;
    
    //Método contructor vacío
    public Rectangulo() {
    }
    //Método constructor con parámetros 
    public Rectangulo(int base, int altura) {
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

    //Uso de los métodos contructores
    //Solicitar datos 
    public void solicitarDatos(){
        Scanner leer= new Scanner(System.in);

        System.out.println("Ingrese la base del rectangulo");
        base=leer.nextInt();
        System.out.println("Ingrese la altura del rectangulo");
        altura=leer.nextInt();
    }

    //Calcular el area
    public void calcularArea(){
        int area;
        area=base*altura;
        System.out.println("La base del rectangulo es: "+base+" La altura del rectangulo es: "+altura+" El area es: "+area);
    }
    
    
}
