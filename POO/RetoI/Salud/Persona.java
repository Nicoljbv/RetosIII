package RetoI.Salud;

import java.util.Scanner;

public class Persona {
    
    //Definir atributos
    private String tipoDoc;
    private String nombre;
    private String apellido;
    private String sexo; 
    private int documento;
    private int edad; 
    private double peso;
    private double estatura;
    private double pesoActual=0; 

    //Definir métodos 

    //Método para solicitar los datos al usuario
    public void pedirDatos (){

        //Instanciar la clase scanner para capturar los datos
        Scanner captura = new Scanner(System.in);

        System.out.println("Bienvenido \nPara la consulta de salud se le solicitan los siguientes datos:");

        System.out.println("Tipo de Documento: ");
        tipoDoc=captura.next();

        System.out.println("Número de Documento: ");
        documento=captura.nextInt();

        System.out.println("Nombre: ");
        nombre=captura.next();

        System.out.println("Apellido: ");
        apellido=captura.next();

        System.out.println("Edad: ");
        edad=captura.nextInt();

        System.out.println("Peso: ");
        peso=captura.nextDouble();

        System.out.println("Estatura: ");
        estatura=captura.nextDouble();

        System.out.println("Sexo: ");
        sexo=captura.next();

    }

    //Método para mostrar los datos que ingreso el usuario
    public void mostrarPersona (){

        System.out.println("Tipo de Documento "+tipoDoc);
        System.out.println("Número de Documento "+documento);
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellido: "+apellido);
        System.out.println("Edad: "+edad);
        System.out.println("Peso: "+peso);
        System.out.println("Estatura: "+estatura);
        System.out.println("Sexo: "+sexo);
    }

    //Método para evaluar el pesoActual del usuario
    public void calcularlmc(){

        pesoActual=Math.pow((peso/estatura),2); 

        if(pesoActual<20){
            System.out.println("Su peso está por debajo de lo ideal");
        }else if((pesoActual>=20) && (pesoActual<=25)){
            System.out.println("Su peso es ideal");
        }else{
            System.out.println("Usted tiene sobrepeso");
        }
    }

    //Método para determinar si el usuario es mayor de edad
    public void mayorEdad (){

        if(edad<0){
            System.out.println("Ingreso una edad incorrecta");
        }else if(edad<18){
            System.out.println("Usted es menor de edad");
        }else if(edad>=18){
            System.out.println("Usted es mayor de edad");
        }

    }

}
