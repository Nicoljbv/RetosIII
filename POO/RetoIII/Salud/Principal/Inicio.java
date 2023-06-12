package RetoIII.Salud.Principal;

import java.util.Scanner;

import RetoIII.Salud.Empleado;

public class Inicio {
    public static void main(String[] args) {

        Empleado dato = new Empleado();
        
        dato.pedirDatos();
        dato.solicitarDatos();
        double horaT=dato.solicitarHorastrabajadas();
        double valorH=dato.solicitarValorhora();
        dato.mostrarEmpleado(valorH, horaT);
        dato.calcularHonorarios(valorH, horaT);
    }
}
