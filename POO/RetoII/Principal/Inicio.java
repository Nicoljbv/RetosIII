package RetoII.Principal;

import RetoII.Principal.Salud.Persona;

public class Inicio {
public static void main(String[] args) {
    
    Persona mostrar = new Persona(); 
  
    mostrar.pedirDatos();
    double p=mostrar.solicitarPeso();
    double e=mostrar.solicitarEstatura();
    mostrar.mostrarPersona(p, e);
    double pActual=mostrar.calcularlmc(p, e);  

    if(pActual<20){
        System.out.println("Su peso está por debajo de lo ideal");
    }else if((pActual>=20) && (pActual<=25)){
        System.out.println("Su peso es ideal");
    }else{
        System.out.println("Usted tiene sobrepeso");
    }
}


















    
}
