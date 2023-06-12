package RetoIV;

import java.util.Scanner;

public class Ejecucion {
    public static void main(String[] args) {
        //Declarar variables para almacenar la opción elegida por el usuario
        String eleccion, resp;
        int repe=0;

        //Instanciar la clase scanner
        Scanner captura = new Scanner(System.in);

        do{
        //Solicitar la elección al usuario 
        System.out.println("¿De que figura quiere hallar el area?\n1.Circulo\n2.Triangulo\n3.Rectangulo\n4.Hexagono");
        eleccion=captura.next();

        //Area de la figura según elección
        switch(eleccion){
            case "1", "circulo":
            Circulo c = new Circulo();
            c.solicitarDatos();
            c.calcularArea();
            repe++;
            break;

            case "2", "triangulo":
            Triangulo t = new Triangulo();
            t.solicitarDatos();
            t.calcularArea();
            repe++;
            break;

            case "3", "rectangulo":
            Rectangulo r = new Rectangulo();
            r.solicitarDatos();
            r.calcularArea();
            repe++;
            break;

            case "4", "hexagono":
            Hexagono h = new Hexagono();
            h.solicitarDatos();
            h.calcularArea();
            repe++;
            break;

            default:
            System.out.println("Figura incorrecta");
        }
        

        System.out.println("Desea hallar el area de otra figura, escriba si o no");
        resp=captura.next();

    }while(resp.equalsIgnoreCase("si"));

System.out.println("Gracias por utilizar el programa, usted halló el area de "+repe+" figura/figuras");

    }
}