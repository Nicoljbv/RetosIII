import java.util.Random;
import java.util.Scanner;

public class Ppt implements Juego{
     //Atributos
    private int elecUsu;
    private int elecPro;
    private String nombre;

    //Método constructor vacío
    public Ppt(){

    }
    //Método constructor con parámetros
     public Ppt(int elecUsu, int elecPro, String nombre) {
        this.elecUsu = elecUsu;
        this.elecPro = elecPro;
        this.nombre = nombre;
    }

    public void iniciar(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        nombre=leer.next();
    }

    public void jugar(){
        Scanner leer = new Scanner(System.in);
        //Instanciamos el método random para generar los números aleatoriamente 
        Random opc = new Random();
        //Generar un número aleatorio entre 0, 1 o 2
        elecPro = opc.nextInt(3);
        System.out.println(nombre + " Elija una opción: \n1.Piedra \n2.Papel \n3.Tijera");
        elecUsu = leer.nextInt();
    }

    public void finalizar(){
        if (elecUsu == 1) {
             if (elecPro == 0) {
                 System.out.println("El usuario saco: \nPiedra \nEl programa saco: \nPiedra \n¡EMPATE!");
 
             } else if (elecPro == 1) {
                 System.out.println("El usuario saco: \nPiedra \nEl programa saco: \nPapel \n¡PERDISTE");
             } else {
                 System.out.println("El usuario saco: \nPiedra \nEl programa saco: \nTijera \n¡GANASTE!");
             }
         } else if (elecUsu == 2) {
             if (elecPro == 0) {
                 System.out.println("El usuario saco: \nPapel \nEl programa saco: \nPiedra \n¡GANASTE!");
 
             } else if (elecPro == 1) {
                 System.out.println("El usuario saco: \nPapel \nEl programa saco: \nPapel \n¡EMPATE!");
             } else {
                 System.out.println("El usuario saco: \nPapel \nEl programa saco: \nTijera \n¡PERDISTE!");
             }
 
         } else if (elecUsu == 3) {
             if (elecPro == 0) {
                 System.out.println("El usuario saco: \nTijera \nEl programa saco: \nPiedra \n¡PERDISTE!");
 
             } else if (elecPro == 1) {
                 System.out.println("El usuario saco: \nTijera \nEl programa saco: \nPapel \n¡GANASTE!");
             } else {
                 System.out.println("El usuario saco: \nTijera \nEl programa saco: \nTijera \n¡EMPATE!");
             }
         } else {
             System.out.println("Ingreso una opción incorrecta");
         }
    }
}
