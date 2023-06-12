package RetoII.Principal.Salud;

import java.util.Scanner;

public class Persona {
    
        //Definir atributos
        private String tipoDoc;
        private String nombre;
        private String apellido;
        private String sexo; 
        private int documento;
        private int edad; 
    
        //Definir métodos constructores 
        public Persona() {
        }
        
        public Persona(String tipoDoc, String nombre, String apellido, String sexo, int documento, int edad) {
            this.tipoDoc = tipoDoc;
            this.nombre = nombre;
            this.apellido = apellido;
            this.sexo = sexo;
            this.documento = documento;
            this.edad = edad;
        }


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

            System.out.println("Sexo: ");
            sexo=captura.next();
    
        }

        public double solicitarPeso () {
            Scanner captura = new Scanner(System.in);
            double peso;
            System.out.println("Peso: ");
            peso=captura.nextDouble();
            return peso;
        }

        public double solicitarEstatura () {
            Scanner captura = new Scanner(System.in);
            double estatura;
            System.out.println("Estatura: ");
            estatura=captura.nextDouble();
            return estatura;
        }
    
        //Método para mostrar los datos que ingreso el usuario
        public void mostrarPersona (double peso, double estatura){
    
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
        public double calcularlmc(double peso, double estatura){
            double pesoActual;
            double eElevada=Math.pow(estatura,2);
            pesoActual=eElevada/peso;

            return pesoActual;
        }
    
}
