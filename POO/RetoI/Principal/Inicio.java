package RetoI.Principal;

import RetoI.Salud.Persona;

public class Inicio {

    public static void main(String[] args) {
        
        //Objeto Solicitar- método que solicita datos
        Persona solicitar = new Persona();

        solicitar.pedirDatos();
        solicitar.mostrarPersona();

        //Objeto Mostrar- método que muestra los datos que ingreso el usuario
        //Persona mostrar = new Persona();

        //mostrar.mostrarPersona(); //Cuando utilizó un método diferente no me muestra los datos(0,null)

        //Objeto Edad- método que determina si el usuario es mayor o menor de edad 
        Persona edad = new Persona();

        edad.mayorEdad();

        //Objeto Peso- método que evalua el peso del usuario
        Persona peso = new Persona();

        peso.calcularlmc();

    }
    
}
