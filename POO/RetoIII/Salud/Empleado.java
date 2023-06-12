package RetoIII.Salud;

import java.util.Scanner;

public class Empleado extends Persona {
    private String cargo;
    private double valorHora; 
    private double horasTrabajadas; 
    private String departamento;
    
    public Empleado(){

    }
    //Método constructor
    public Empleado(String tipoDoc, String nombre, String apellido, int documento, String cargo, double valorHora,
            int horasTrabajadas, String departamento) {
        super(tipoDoc, nombre, apellido, documento);
        this.cargo = cargo;
        this.valorHora = valorHora;
        this.horasTrabajadas = horasTrabajadas;
        this.departamento = departamento;
    }

    //Getters y Setters
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(double horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    } 

    public void solicitarDatos(){
        Scanner captura = new Scanner(System.in);
        System.out.println("Ingrese su cargo");
        cargo=captura.next();
        System.out.println("Ingrese el departamento");
        departamento=captura.next();
        
    }

    public double solicitarValorhora () {
        Scanner captura = new Scanner(System.in);
        System.out.println("Ingrese el valor de la hora: ");
        valorHora=captura.nextDouble();
        return valorHora;
    }
    
    public double solicitarHorastrabajadas () {
        Scanner captura = new Scanner(System.in);
        System.out.println("Ingrese el número de horas que trabajo: ");
        horasTrabajadas=captura.nextDouble();
        return horasTrabajadas;
    }

    //Método para calcular honorarios
    public double calcularHonorarios(double valorHora, double horasTrabajadas){
        double total;

        total=(valorHora*horasTrabajadas)-((valorHora*horasTrabajadas)*0.00966);
        System.out.println("El total a pagar es $: "+total);
        return total;
    }

    public void mostrarEmpleado(double valorHora, double horasTrabajadas){
        System.out.println("Nombre: "+getNombre());
        System.out.println("Apellido: "+getApellido());
        System.out.println("Tipo Documento: "+getTipoDoc());
        System.out.println("Número de documento "+getDocumento());
        System.out.println("Cargo: "+cargo);
        System.out.println("Departamento: "+departamento);
        System.out.println("Horas Trabajadas: "+ horasTrabajadas);
        System.out.println("El valor de hora es $: "+valorHora);
    }


}
