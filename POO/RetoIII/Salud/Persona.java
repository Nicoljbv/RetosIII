package RetoIII.Salud;

import java.util.Scanner;

public class Persona {

    //Atributos 
    private String tipoDoc;
    private String nombre;
    private String apellido; 
    private int documento;

    //Método construtor vacío
    public Persona() {
    }

    //Método constructor con parámetros - Inicializar los atributos
    public Persona(String tipoDoc, String nombre, String apellido, int documento) {
        this.tipoDoc = tipoDoc;
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
    }

    //Métodos getters y setters para cada atributo
    public String getTipoDoc() {
        return tipoDoc;
    }
    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public int getDocumento() {
        return documento;
    }
    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public void pedirDatos(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        nombre=leer.next();
        System.out.println("Ingrese su apellido");
        apellido=leer.next();
        System.out.println("Ingrese el tipo de documento");
        tipoDoc=leer.next();
        System.out.println("Ingrese su número de documento");
        documento=leer.nextInt();

       
    }
   
    
    
    
}
