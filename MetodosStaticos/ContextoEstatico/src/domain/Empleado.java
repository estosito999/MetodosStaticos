package domain;

// el nombre de la clase es Empleado
public class Empleado extends Persona{
  
  //Aqui nos creamos los atributos  que es la parte muy importate de nuestra clase que describe cada instancia de esta clase
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleado;
    
    
    public Empleado(){
        //super();
        this.idEmpleado = ++Empleado.contadorEmpleado;
    }

    //Metodo especial
    //hacemos llamar ha nuestros atributos de nuestro constructor parametrizado 
    public Empleado(String nombre, double sueldo) {
        //super(nombre);
        this();
        this.nombre = nombre;
        this.sueldo = sueldo;
    }
    //Contructor de Empleado con informaciion detallada
    public Empleado(String nombre, double sueldo, char genero, int edad, String direccion){
        super(nombre,genero,edad, direccion);
        
        this.nombre = nombre;
        this.sueldo = sueldo;
    
    }

    //Aqui  tenemos los metodos set and get
    public int getIdEmpleado() {
        return this.idEmpleado;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    
    //y aqui tenemos un metodo que nos ayudara ha que no los compile y nos mande a la pantalla
    //tambien este metodo  lo podemos llamar metodo imprimir
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{idEmpleado = ").append(this.idEmpleado);
        sb.append(", sueldo=").append(this.sueldo);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }

    
    
    
    
    
}
