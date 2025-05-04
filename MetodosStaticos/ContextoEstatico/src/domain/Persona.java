package domain;

public class Persona{
    protected String nombre;
    protected char genero;
    protected int edad;
    protected String direccion;
    
    
    
    //Sobrecarga de Constructores 
    //los consstructores son metodos especiales Su propósito es preparar el nuevo objeto configurando sus propiedades iniciales o 
    //ejecutando cualquier lógica de inicio necesaria.
    //contructor vacio
    public Persona(){
        
    }
    //constructor parametrizado
    public Persona(String nombre){
        this.nombre = nombre;
    }

    //contructor parametrizado
    public Persona(String nombre, char genero, int edad, String direccion) {
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.direccion = direccion;
    }

    //Metodos con parametros y retornos
    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getGenero() {
        return this.genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{nombre=").append(nombre);
        sb.append(", genero=").append(genero);
        sb.append(", edad=").append(edad);
        sb.append(", direccion=").append(direccion);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }

   
    
    
    
    
    
}
